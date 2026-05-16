package org.sopt.snapdeck.domain.slide.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.deck.code.DeckErrorCode;
import org.sopt.snapdeck.domain.deck.entity.Deck;
import org.sopt.snapdeck.domain.deck.repository.DeckRepository;
import org.sopt.snapdeck.domain.slide.code.SlideErrorCode;
import org.sopt.snapdeck.domain.slide.dto.response.SlideResponse;
import org.sopt.snapdeck.domain.slide.entity.Slide;
import org.sopt.snapdeck.domain.slide.repository.SlideRepository;
import org.sopt.snapdeck.global.exception.CustomException;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SlideService {
    private final SlideRepository slideRepository;
    private final DeckRepository deckRepository;

    @Transactional
    public List<SlideResponse> updateSlideOrder(Long slideId, int toOrder) {
        Slide targetSlide = slideRepository.findByIdWithDeck(slideId)
                .orElseThrow(() -> new CustomException(SlideErrorCode.SLIDE_NOT_FOUND));

        Long deckId = targetSlide.getDeck().getId();

        // 변경 전 slide의 원래 order 값 가져옴
        int fromOrder = targetSlide.getOrder();

        // toOrder 값 검증 절차
        int slideCount = slideRepository.countByDeckId(deckId);
        validateToOrder(toOrder, slideCount);

        if (fromOrder == toOrder) {
            return slideRepository.findAllByDeckIdOrderByOrderAsc(deckId)
                    .stream()
                    .map(slide -> SlideResponse.from(slide, deckId))
                    .toList();
        }

        if (fromOrder < toOrder) {
            // slide를 뒤로 옮기고 싶을 때, 그 중간에 있는 slide들의 order 를 1씩 줄이기
            slideRepository.decreaseOrdersBetween(deckId, fromOrder, toOrder);
        } else {
            // slide를 앞으로 옮기고 싶을 때, 그 중간에 있는 slide들의 order를 1씩 늘리기
            slideRepository.increaseOrdersBetween(deckId, fromOrder, toOrder);
        }

        // 그 후 targetSlide 의 order를 update
        slideRepository.updateTargetOrder(slideId, toOrder);

        // 순서 변경 후 최신 슬라이드들을 order 순으로 리턴
        return slideRepository.findAllByDeckIdOrderByOrderAsc(deckId)
                .stream()
                .map(slide -> SlideResponse.from(slide, deckId))
                .toList();
    }

    // toOrder 검증 메소드
    private void validateToOrder(int toOrder, int slideCount) {
        if (toOrder < 1 || toOrder > slideCount) {
            throw new CustomException(SlideErrorCode.SLIDE_ORDER_OUT_OF_RANGE);
        }
    }

    @Transactional
    public List<SlideResponse> addSlideToDeck(Long deckId){
        Deck deck = deckRepository.findById(deckId)
                .orElseThrow(() -> new CustomException(DeckErrorCode.DECK_NOT_FOUND));

        if (deck.getVisibleCount() >= slideRepository.countByDeckId(deckId))
            throw new CustomException(SlideErrorCode.NO_MORE_SLIDES_TO_REVEAL);

        deck.increaseVisibleCount();

        List<Slide> slides = slideRepository.findAllByDeckIdOrderByOrderAsc(
                deckId, PageRequest.of(0, deck.getVisibleCount() ));

        return slides
                .stream()
                .map(slide -> SlideResponse.from(slide, deckId))
                .toList();
    }
}
