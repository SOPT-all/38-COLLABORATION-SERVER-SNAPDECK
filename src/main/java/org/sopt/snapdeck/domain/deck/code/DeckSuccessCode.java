package org.sopt.snapdeck.domain.deck.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum DeckSuccessCode implements BaseCode {
    DECK_FOUND(HttpStatus.OK, "덱 조회 완료");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
