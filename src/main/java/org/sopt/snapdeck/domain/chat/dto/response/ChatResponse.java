package org.sopt.snapdeck.domain.chat.dto.response;

import org.sopt.snapdeck.domain.chat.entity.Chat;
import org.sopt.snapdeck.domain.chat.enums.ChatRole;

import java.time.LocalDateTime;

public record ChatResponse(
        Long id,
        Long deckId,
        int order,
        ChatRole role,
        String message,
        LocalDateTime createdAt
) {
    public static ChatResponse from(Chat chat){
        return new ChatResponse(
                chat.getId(),
                chat.getDeck().getId(),
                chat.getOrder(),
                chat.getRole(),
                chat.getMessage(),
                chat.getCreatedAt()
        );
    }
}
