package org.sopt.snapdeck.domain.chat.code;

import lombok.Getter;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
public enum ChatSuccessCode implements BaseCode {
    CHATS_FOUND(HttpStatus.OK, "채팅 목록 조회 완료");

    private final HttpStatus status;
    private final String message;

    ChatSuccessCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public String getCode() { return name(); }
}
