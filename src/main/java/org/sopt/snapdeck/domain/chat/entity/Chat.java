package org.sopt.snapdeck.domain.chat.entity;

import jakarta.persistence.*;
import lombok.*;
import org.sopt.snapdeck.domain.chat.enums.ChatRole;
import org.sopt.snapdeck.domain.deck.entity.Deck;
import org.sopt.snapdeck.global.common.entity.BaseCreatedEntity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Entity
@Table(name = "chats")
public class Chat extends BaseCreatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deck_id", nullable = false)
    private Deck deck;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ChatRole role;

    @Column(name = "`order`", nullable = false)
    private int order;

    @Column(nullable = false)
    private String message;
}
