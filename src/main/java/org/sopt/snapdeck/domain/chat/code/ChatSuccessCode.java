package org.sopt.snapdeck.domain.chat.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ChatSuccessCode implements BaseCode {
    CHATS_FOUND(HttpStatus.OK, "채팅 목록 조회 완료");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
