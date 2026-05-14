package org.sopt.snapdeck.domain.slide.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.slide.code.SlideSuccessCode;
import org.sopt.snapdeck.domain.slide.dto.request.SlideOrderUpdateRequest;
import org.sopt.snapdeck.domain.slide.dto.response.SlideResponse;
import org.sopt.snapdeck.domain.slide.service.SlideService;
import org.sopt.snapdeck.global.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Slides", description = "Slides 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SlideController {
    private final SlideService slideService;

    @Operation(
            summary = "슬라이드 순서 변경",
            description = "슬라이드의 순서를 변경합니다."
    )
    @PatchMapping("/slides/{slideId}/order")
    public ResponseEntity<SuccessResponse<List<SlideResponse>>>  updateSlideOrder(
            @Parameter(description = "순서를 변경할 슬라이드 id", example = "1")
            @PathVariable Long slideId,

            @RequestBody SlideOrderUpdateRequest request
    ) {
        List<SlideResponse> response = slideService.updateSlideOrder(slideId, request.toOrder());

        return ResponseEntity.ok(
                SuccessResponse.of(SlideSuccessCode.SLIDE_ORDER_CHANGED, response)
        );
    }
}
