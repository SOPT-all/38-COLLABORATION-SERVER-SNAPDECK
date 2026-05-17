package org.sopt.snapdeck.domain.deck.repository;

import org.sopt.snapdeck.domain.deck.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck,Long> {
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("""
        update Deck d
        set d.visibleCount = d.visibleCount - 1
        where d.id = :deckId
          and d.visibleCount > 0
        """)
    int decreaseVisibleCount(Long deckId);
}
