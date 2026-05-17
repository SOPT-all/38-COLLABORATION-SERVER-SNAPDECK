package org.sopt.snapdeck.domain.deck.entity;

import jakarta.persistence.*;
import lombok.*;
import org.sopt.snapdeck.global.common.entity.BaseTimeEntity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Entity
@Table(name = "decks")
public class Deck extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "visible_count", nullable = false)
    private int visibleCount;

    public void increaseVisibleCount(){
        this.visibleCount++;
    }
}
