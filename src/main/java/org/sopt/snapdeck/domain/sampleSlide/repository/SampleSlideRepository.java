package org.sopt.snapdeck.domain.sampleSlide.repository;

import org.sopt.snapdeck.domain.sampleSlide.entity.SampleSlide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleSlideRepository extends JpaRepository<SampleSlide, Long> {
}
