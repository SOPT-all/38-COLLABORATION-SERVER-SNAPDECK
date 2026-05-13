package org.sopt.snapdeck.domain.sampleSlide.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.sampleSlide.code.SampleSlideSuccessCode;
import org.sopt.snapdeck.domain.sampleSlide.dto.response.SampleSlideResponse;
import org.sopt.snapdeck.domain.sampleSlide.service.SampleSlideService;
import org.sopt.snapdeck.global.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Tag(name = "SampleSlides", description = "SampleSlides 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sample-slides")
public class SampleSlideController {
    private final SampleSlideService sampleSlideService;

    @Operation(summary = "샘플 슬라이드 전체 조회", description = "샘플 슬라이드를 전체 조회합니다.")
    @GetMapping
    public ResponseEntity<SuccessResponse<List<SampleSlideResponse>>> getSampleSlides(){
        List<SampleSlideResponse> response = sampleSlideService.getSampleSlides();

        return ResponseEntity.ok(
                SuccessResponse.of(SampleSlideSuccessCode.SAMPLE_SLIDES_FOUND, response));
    }
}
