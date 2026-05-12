package org.sopt.snapdeck.domain.chat.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ChatRole {
    USER("사용자"),
    AI("AI 챗봇");

    private final String description;
}
