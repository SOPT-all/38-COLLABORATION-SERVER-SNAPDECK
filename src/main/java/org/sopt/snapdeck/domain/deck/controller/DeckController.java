package org.sopt.snapdeck.domain.deck.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.deck.code.DeckSuccessCode;
import org.sopt.snapdeck.domain.deck.dto.response.DeckSlideResponse;
import org.sopt.snapdeck.domain.deck.service.DeckService;
import org.sopt.snapdeck.global.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Decks", description = "Decks 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/decks")
public class DeckController {
    private final DeckService deckService;

    @GetMapping("/{deckId}")
    public ResponseEntity<SuccessResponse<List<DeckSlideResponse>>> getDeck(@PathVariable Long deckId) {
        List<DeckSlideResponse> responses =  deckService.getDeckSlides(deckId);

        return ResponseEntity.ok(
                SuccessResponse.of(DeckSuccessCode.DECK_FOUND, responses)
        );
    }
}
