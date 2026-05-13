package org.sopt.snapdeck.domain.slide.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum SlideSuccessCode implements BaseCode {
    SLIDE_ORDER_CHANGED(HttpStatus.OK, "슬라이드 순서 변경 완료"),
    SLIDE_DELETED(HttpStatus.OK, "슬라이드 삭제 완료");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
