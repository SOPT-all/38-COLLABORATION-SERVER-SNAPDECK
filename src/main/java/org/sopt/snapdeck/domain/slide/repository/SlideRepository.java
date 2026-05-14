package org.sopt.snapdeck.domain.slide.repository;

import org.sopt.snapdeck.domain.slide.entity.Slide;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SlideRepository extends JpaRepository<Slide, Long> {
    List<Slide> findAllByDeckIdOrderByOrderAsc(Long deckId, Pageable pageable);
}
