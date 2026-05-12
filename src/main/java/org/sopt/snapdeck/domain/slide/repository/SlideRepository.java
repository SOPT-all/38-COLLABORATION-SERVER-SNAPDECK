package org.sopt.snapdeck.domain.slide.repository;

import org.sopt.snapdeck.domain.slide.entity.Slide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlideRepository extends JpaRepository<Slide, Long> {
}
