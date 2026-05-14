package org.sopt.snapdeck.domain.deck.dto.response;

import org.sopt.snapdeck.domain.deck.entity.Deck;
import org.sopt.snapdeck.domain.slide.entity.Slide;

import java.time.LocalDateTime;

public record DeckSlideResponse(
        Long id,
        Long deckId,
        int order,
        String imageName,
        String title,
        String content,
        String footer,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
    public static DeckSlideResponse from(Slide slide) {
        return new DeckSlideResponse(
                slide.getId(),
                slide.getDeck().getId(),
                slide.getOrder(),
                slide.getImageName(),
                slide.getTitle(),
                slide.getContent(),
                slide.getFooter(),
                slide.getCreatedAt(),
                slide.getUpdatedAt()
        );
    }
}
