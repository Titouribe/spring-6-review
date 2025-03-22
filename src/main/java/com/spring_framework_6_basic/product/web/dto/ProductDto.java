package com.spring_framework_6_basic.product.web.dto;

import java.io.Serial;
import java.io.Serializable;

public record ProductDto(
        Long id,
        String name) implements Serializable {

    @Serial
    private static final long serialVersionUID = -2220095287560619629L;
}
