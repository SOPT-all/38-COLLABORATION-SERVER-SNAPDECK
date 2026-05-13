package org.sopt.snapdeck.domain.sampleSlide.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.sampleSlide.dto.response.SampleSlideResponse;
import org.sopt.snapdeck.domain.sampleSlide.repository.SampleSlideRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleSlideService {
    private final SampleSlideRepository sampleSlideRepository;

    @Transactional(readOnly = true)
    public List<SampleSlideResponse> getSampleSlides(){

        return sampleSlideRepository.findAll()
                .stream().map(SampleSlideResponse::from).toList();

    }
}
