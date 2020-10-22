package com.jellyfishmix.interchange.common.enums;

import lombok.Getter;

/**
 * @author JellyfishMIX
 * @date 2020/10/20 15:15
 */
@Getter
public enum ResultVOEnum {
    SUCCESS(100000, "success"),
    FAILED(200000, "failed");
    private Integer code;
    private String message;

    ResultVOEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
