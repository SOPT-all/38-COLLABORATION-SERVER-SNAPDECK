package org.sopt.snapdeck.domain.chat.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.chat.code.ChatSuccessCode;
import org.sopt.snapdeck.domain.chat.dto.response.ChatResponse;
import org.sopt.snapdeck.domain.chat.service.ChatService;
import org.sopt.snapdeck.global.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@Tag(name = "Chats", description = "Chats 관련 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ChatController {
    private final ChatService chatService;

    @Operation(
            summary = "채팅 조회",
            description = "deckId에 해당하는 덱의 모든 채팅 목록을 조회합니다."
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "조회 성공"),
            @ApiResponse(responseCode = "404", description = "슬라이드 덱을 찾을 수 없음 — 존재하지 않는 deckId로 요청한 경우")
    })
    @GetMapping("decks/{deckId}/chats")
    public ResponseEntity<SuccessResponse<List<ChatResponse>>> getChatsByDeckId(
            @Parameter(description = "조회할 슬라이드 덱 ID", example = "1", required = true)
            @PathVariable Long deckId) {
        List<ChatResponse> responses = chatService.getChatsByDeckId(deckId);

        return ResponseEntity.ok(
                SuccessResponse.of(ChatSuccessCode.CHATS_FOUND, responses));
    }
}
