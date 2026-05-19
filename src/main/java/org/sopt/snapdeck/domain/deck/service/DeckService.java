package org.sopt.snapdeck.domain.deck.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.deck.code.DeckErrorCode;
import org.sopt.snapdeck.domain.deck.dto.response.DeckSlideResponse;
import org.sopt.snapdeck.domain.deck.entity.Deck;
import org.sopt.snapdeck.domain.deck.repository.DeckRepository;
import org.sopt.snapdeck.domain.slide.entity.Slide;
import org.sopt.snapdeck.domain.slide.repository.SlideRepository;
import org.sopt.snapdeck.global.exception.CustomException;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeckService {
    private final DeckRepository deckRepository;
    private final SlideRepository slideRepository;

    @Transactional(readOnly = true)
    public List<DeckSlideResponse> getDeckSlides(Long deckId) {
        Deck deck = deckRepository.findById(deckId)
                .orElseThrow(() -> new CustomException(DeckErrorCode.DECK_NOT_FOUND));

        if (deck.getVisibleCount() == 0)
            return List.of();

        List<Slide> slides = slideRepository.findAllByDeckIdOrderByOrderAsc(
                deckId, PageRequest.of(0, deck.getVisibleCount()));

        return slides
                .stream()
                .map(slide -> DeckSlideResponse.from(slide, deckId))
                .toList();
    }
}
