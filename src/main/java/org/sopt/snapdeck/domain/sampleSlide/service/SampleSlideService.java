package org.sopt.snapdeck.domain.sampleSlide.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.sampleSlide.repository.SampleSlideRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SampleSlideService {
    private final SampleSlideRepository sampleSlideRepository;
}
