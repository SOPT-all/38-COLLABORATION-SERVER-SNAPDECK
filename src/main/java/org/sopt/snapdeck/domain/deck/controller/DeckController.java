package org.sopt.snapdeck.domain.deck.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Operation(
            summary = "슬라이드 덱 조회",
            description = "deckId에 해당하는 덱의 슬라이드들을 조회합니다."
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "조회 성공"),
            @ApiResponse(responseCode = "404", description = "슬라이드 덱을 찾을 수 없음 — 존재하지 않는 deckId로 요청한 경우")
    })
    @GetMapping("/{deckId}")
    public ResponseEntity<SuccessResponse<List<DeckSlideResponse>>> getDeck(
            @Parameter(description = "조회할 슬라이드 덱 ID", example = "1", required = true)
            @PathVariable Long deckId) {
        List<DeckSlideResponse> responses =  deckService.getDeckSlides(deckId);

        DeckSuccessCode code = responses.isEmpty()
                ? DeckSuccessCode.DECK_FOUND_SLIDES_EMPTY
                : DeckSuccessCode.DECK_FOUND;

        return ResponseEntity.ok(SuccessResponse.of(code, responses));
    }
}
