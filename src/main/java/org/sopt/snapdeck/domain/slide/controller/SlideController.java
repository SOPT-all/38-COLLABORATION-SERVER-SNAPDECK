package org.sopt.snapdeck.domain.slide.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.slide.service.SlideService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Slides", description = "Slides 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SlideController {
    private final SlideService slideService;
}
