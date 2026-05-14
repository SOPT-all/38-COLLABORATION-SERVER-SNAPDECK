package org.sopt.snapdeck.domain.chat.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.chat.dto.response.ChatResponse;
import org.sopt.snapdeck.domain.chat.repository.ChatRepository;
import org.sopt.snapdeck.domain.deck.code.DeckErrorCode;
import org.sopt.snapdeck.domain.deck.repository.DeckRepository;
import org.sopt.snapdeck.global.exception.CustomException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatRepository chatRepository;
    private final DeckRepository deckRepository;

    @Transactional(readOnly = true)
    public List<ChatResponse> getChatsByDeckId(Long deckId){
        if (!deckRepository.existsById(deckId))
            throw new CustomException(DeckErrorCode.DECK_NOT_FOUND);

        return chatRepository.findAllByDeckIdOrderByOrderAsc(deckId)
                .stream()
                .map(ChatResponse::from)
                .toList();
    }
}
