package org.sopt.snapdeck.domain.slide.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.sopt.snapdeck.domain.deck.entity.Deck;
import org.sopt.snapdeck.global.common.entity.BaseTimeEntity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@SQLDelete(sql = "UPDATE slides SET deleted = true WHERE id = ?")
@SQLRestriction("deleted = false")
@Getter
@Entity
@Table(name = "slides")
public class Slide extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deck_id", nullable = false)
    private Deck deck;

    @Column(name = "`order`", nullable = false)
    private int order;

    @Column(name = "image_name",nullable = false)
    private String imageName;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String footer;

    @Column(nullable = false)
    @ColumnDefault("false")
    private boolean deleted = false;
}
