package org.sopt.snapdeck.domain.chat.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.chat.service.ChatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Chats", description = "Chats 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/decks/{deckId}/chats")
public class ChatController {
    private final ChatService chatService;
}
