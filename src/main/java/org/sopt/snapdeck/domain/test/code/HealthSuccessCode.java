package org.sopt.snapdeck.domain.test.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum HealthSuccessCode implements BaseCode {
    HEALTH_SUCCESS(HttpStatus.OK, "헬스 체크 완료."),
    DATA_INIT_SUCCESS(HttpStatus.OK, "데이터베이스 데이터 초기화 완료.");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
