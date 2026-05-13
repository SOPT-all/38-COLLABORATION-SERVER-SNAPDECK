package org.sopt.snapdeck.domain.sampleSlide.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum SampleSlideSuccessCode implements BaseCode {
    SAMPLE_SLIDES_FOUND(HttpStatus.OK, "샘플 슬라이드 조회 완료");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
