package org.sopt.snapdeck.domain.sampleSlide.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.sampleSlide.service.SampleSlideService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "SampleSlides", description = "SampleSlides 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sample-slides")
public class SampleSlideController {
    private final SampleSlideService sampleSlideService;
}
