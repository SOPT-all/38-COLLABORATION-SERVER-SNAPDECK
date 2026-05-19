package org.sopt.snapdeck.domain.test.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.domain.test.code.HealthErrorCode;
import org.sopt.snapdeck.domain.test.code.HealthSuccessCode;
import org.sopt.snapdeck.domain.test.dto.response.HeathResponse;
import org.sopt.snapdeck.global.common.response.SuccessResponse;
import org.sopt.snapdeck.global.exception.CustomException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
@Tag(name = "Test", description = "테스트용 API")
public class TestController {
    private final DataSource dataSource;

    @Operation(summary = "헬스 체크", description = "서버 상태를 확인합니다.")
    @GetMapping("/health")
    public ResponseEntity<SuccessResponse<HeathResponse>> healthCheck() {
        return ResponseEntity
                .ok(SuccessResponse.of(HealthSuccessCode.HEALTH_SUCCESS, HeathResponse.create()));
    }

    @Operation(summary = "DB 데이터 초기화", description = "데이터베이스의 더미데이터를 초기화합니다.")
    @PostMapping("/reset")
    public ResponseEntity<SuccessResponse<Void>> resetData() {
        try {
            ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
            populator.addScript(new ClassPathResource("data.sql"));
            populator.setSeparator(";");
            populator.setContinueOnError(false);
            populator.execute(dataSource);

            return ResponseEntity
                    .ok(SuccessResponse.of(HealthSuccessCode.DATA_INIT_SUCCESS));
        } catch (Exception e) {
            throw new CustomException(HealthErrorCode.DATA_INIT_ERROR);
        }
    }
}
