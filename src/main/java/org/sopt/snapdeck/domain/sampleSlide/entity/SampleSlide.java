package org.sopt.snapdeck.domain.sampleSlide.entity;

import jakarta.persistence.*;
import lombok.*;
import org.sopt.snapdeck.global.common.entity.BaseTimeEntity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
@Entity
@Table(name = "sample_slides")
public class SampleSlide extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_name", nullable = false)
    private String imageName;

    @Column(nullable = false)
    private String title;

    @Column(name = "slide_count", nullable = false)
    private int slideCount;
}
