package org.sopt.snapdeck.domain.slide.dto.response;

import org.sopt.snapdeck.domain.slide.entity.Slide;

import java.time.LocalDateTime;

public record SlideResponse(
        Long id,
        Long deckId,
        int order,
        String imageName,
        String title,
        String content,
        String footer,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    public static SlideResponse from(Slide slide, Long deckId) {
        return new SlideResponse(
                slide.getId(),
                deckId,
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
