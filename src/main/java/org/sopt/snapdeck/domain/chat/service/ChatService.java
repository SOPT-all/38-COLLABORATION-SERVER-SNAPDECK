package org.sopt.snapdeck.domain.chat.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.chat.repository.ChatRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatRepository chatRepository;
}
