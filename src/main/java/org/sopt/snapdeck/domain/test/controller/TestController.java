package org.sopt.snapdeck.domain.test.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.test.code.HealthSuccessCode;
import org.sopt.snapdeck.domain.test.dto.response.HeathResponse;
import org.sopt.snapdeck.global.common.response.SuccessResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
@Tag(name = "Test", description = "테스트용 API")
public class TestController {

    @Operation(summary = "헬스 체크", description = "서버 상태를 확인합니다.")
    @GetMapping("/health")
    public ResponseEntity<SuccessResponse<HeathResponse>> healthCheck() {
        return ResponseEntity
                .ok(SuccessResponse.of(HealthSuccessCode.HEALTH_SUCCESS, HeathResponse.create()));
    }
}
