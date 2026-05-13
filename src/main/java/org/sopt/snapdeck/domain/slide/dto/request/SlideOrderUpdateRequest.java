package org.sopt.snapdeck.domain.slide.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

public record SlideOrderUpdateRequest(
        @Schema(description = "바꾸고 싶은 순서입니다. 값은 1 이상, 같은 deckId에 속한 slide 개수 이하입니다. ",
                example = "3")
        int toOrder
) {
}
