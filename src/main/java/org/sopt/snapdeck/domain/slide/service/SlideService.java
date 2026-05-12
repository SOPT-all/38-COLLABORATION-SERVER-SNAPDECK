package org.sopt.snapdeck.domain.slide.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.slide.repository.SlideRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SlideService {
    private final SlideRepository slideRepository;
}
