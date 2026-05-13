package org.sopt.snapdeck.domain.sampleSlide.dto.response;

import org.sopt.snapdeck.domain.sampleSlide.entity.SampleSlide;
import java.time.LocalDateTime;

public record SampleSlideResponse(
        Long id,
        String imageName,
        String title,
        int slideCount,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    public static SampleSlideResponse from(SampleSlide sampleSlide) {
        return new SampleSlideResponse(
                sampleSlide.getId(),
                sampleSlide.getImageName(),
                sampleSlide.getTitle(),
                sampleSlide.getSlideCount(),
                sampleSlide.getCreatedAt(),
                sampleSlide.getUpdatedAt()
        );
    }
}

