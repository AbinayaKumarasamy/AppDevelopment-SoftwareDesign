package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Access {
    ADMIN_GET("ADMIN_GET"),
    ADMIN_POST("ADMIN_POST"),
    ADMIN_PUT("ADMIN_PUT"),
    ADMIN_DELETE("ADMIN_DELETE"),
    USER_GET("USER_GET"),
    USER_POST("USER_POST"),
    USER_PUT("USER_PUT"),
    USER_DELETE("USER_DELETE");

    @Getter
    private final String access;
}
