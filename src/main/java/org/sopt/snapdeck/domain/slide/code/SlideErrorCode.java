package org.sopt.snapdeck.domain.slide.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum SlideErrorCode implements BaseCode {
    SLIDE_ORDER_OUT_OF_RANGE(HttpStatus.BAD_REQUEST, "슬라이드 범위를 초과하여 순서를 변경할 수 없습니다."),
    SLIDE_NOT_FOUND(HttpStatus.NOT_FOUND, "slideId 에 해당하는 슬라이드를 찾을 수 없습니다."),
    NO_MORE_SLIDES_TO_REVEAL(HttpStatus.BAD_REQUEST, "슬라이드 추가 범위를 벗어났습니다");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
