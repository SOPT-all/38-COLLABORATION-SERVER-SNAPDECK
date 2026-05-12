package org.sopt.snapdeck.domain.slide.code;

import lombok.Getter;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
public enum SlideSuccessCode implements BaseCode {
    SLIDE_ORDER_CHANGED(HttpStatus.OK, "슬라이드 순서 변경 완료"),
    SLIDE_DELETED(HttpStatus.OK, "슬라이드 삭제 완료");

    private final HttpStatus status;
    private final String message;

    SlideSuccessCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public String getCode() { return name(); }
}
