package org.sopt.snapdeck.domain.test.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum HealthErrorCode implements BaseCode {
    DATA_INIT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "데이터베이스 데이터 초기화 작업 중 서버 에러 발생.");

    private final HttpStatus status;
    private final String message;

    @Override
    public String getCode() { return name(); }
}
