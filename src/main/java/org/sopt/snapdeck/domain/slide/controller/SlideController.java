package org.sopt.snapdeck.domain.slide.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "순서 변경 성공"),
            @ApiResponse(responseCode = "400", description = "슬라이드 변경 실패 - 같은 덱 슬라이드의 범위를 벗어난 순서 변경을 요청한 경우"),
            @ApiResponse(responseCode = "404", description = "슬라이드를 찾을 수 없음 — 존재하지 않는 slideId로 요청한 경우")
    })
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

    @Operation(
            summary = "슬라이드 삭제",
            description = "slideId에 해당하는 슬라이드를 삭제합니다."
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "삭제 성공"),
            @ApiResponse(responseCode = "404", description = "슬라이드를 찾을 수 없음 — 존재하지 않는 slideId로 요청한 경우")
    })
    @DeleteMapping("/slides/{slideId}")
    public ResponseEntity<SuccessResponse<Void>> deleteSlide(
            @Parameter(description = "삭제할 슬라이드 id", example = "3")
            @PathVariable Long slideId
    ) {

        slideService.deleteSlide(slideId);

        return ResponseEntity.ok(
                SuccessResponse.of(SlideSuccessCode.SLIDE_DELETED)
        );
    }
}
