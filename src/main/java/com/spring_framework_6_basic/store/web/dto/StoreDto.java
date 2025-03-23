package com.spring_framework_6_basic.store.web.dto;

import java.io.Serial;
import java.io.Serializable;

public record StoreDto(
        Long id,
        String name) implements Serializable {

    @Serial
    private static final long serialVersionUID = -3887701769017630018L;
}
