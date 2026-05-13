package org.sopt.snapdeck.domain.slide.repository;

import org.sopt.snapdeck.domain.slide.entity.Slide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SlideRepository extends JpaRepository<Slide, Long> {
    @Query("""
        select s
        from Slide s
        join fetch s.deck
        where s.id = :slideId
        """)
    Optional<Slide> findByIdWithDeck(Long slideId);

    // toOrder 값 검증 위한 쿼리
    int countByDeckId(Long deckId);

    List<Slide> findAllByDeckIdOrderByOrderAsc(Long deckId);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("""
        update Slide s
        set s.order = s.order - 1
        where s.deck.id = :deckId
          and s.order > :fromOrder
          and s.order <= :toOrder
        """)
    int decreaseOrdersBetween(Long deckId, int fromOrder, int toOrder);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("""
        update Slide s
        set s.order = s.order + 1
        where s.deck.id = :deckId
          and s.order >= :toOrder
          and s.order < :fromOrder
        """)
    int increaseOrdersBetween(Long deckId, int fromOrder, int toOrder);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("""
        update Slide s
        set s.order = :toOrder
        where s.id = :slideId
        """)
    int updateTargetOrder(Long slideId, int toOrder);

}
