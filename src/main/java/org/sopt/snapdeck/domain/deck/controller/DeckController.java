package org.sopt.snapdeck.domain.deck.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.deck.service.DeckService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Decks", description = "Decks 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/decks")
public class DeckController {
    private final DeckService deckService;
}
