package org.sopt.snapdeck.domain.slide.repository;

import org.sopt.snapdeck.domain.slide.entity.Slide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SlideRepository extends JpaRepository<Slide, Long> {
    @Query("""
    select s
    from Slide s
    join fetch s.deck
    where s.deck.id = :deckId
    order by s.order asc
    """)
    List<Slide> findAllByDeckIdWithDeck(Long deckId);
}
