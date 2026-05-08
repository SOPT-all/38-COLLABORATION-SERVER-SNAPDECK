package org.sopt.snapdeck.domain.test.code;

import lombok.Getter;
import lombok.Setter;
import org.sopt.snapdeck.global.common.code.BaseCode;
import org.springframework.http.HttpStatus;

@Getter
public enum HealthSuccessCode implements BaseCode {
    HEALTH_SUCCESS(HttpStatus.OK, "헬스 체크 완료.");

    private final HttpStatus status;
    private final String message;

    HealthSuccessCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    @Override
    public String getCode() { return name(); }
}
