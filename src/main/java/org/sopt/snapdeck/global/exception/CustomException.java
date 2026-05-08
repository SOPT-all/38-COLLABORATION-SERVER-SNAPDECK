package org.sopt.snapdeck.global.exception;

import lombok.Getter;
import org.sopt.snapdeck.global.common.code.BaseCode;

@Getter
public class CustomException extends RuntimeException {
    private final BaseCode errorCode;

    public CustomException(BaseCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
