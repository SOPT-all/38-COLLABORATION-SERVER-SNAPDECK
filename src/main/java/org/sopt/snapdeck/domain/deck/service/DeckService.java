package org.sopt.snapdeck.domain.deck.service;

import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.deck.repository.DeckRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeckService {
    private final DeckRepository deckRepository;
}
