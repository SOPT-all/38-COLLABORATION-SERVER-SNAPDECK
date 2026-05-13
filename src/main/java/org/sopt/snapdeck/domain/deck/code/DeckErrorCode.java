package org.sopt.snapdeck.domain.deck.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum DeckErrorCode implements BaseCode {
    DECK_NOT_FOUND(HttpStatus.NOT_FOUND, "deckId에 해당하는 슬라이드 덱을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
