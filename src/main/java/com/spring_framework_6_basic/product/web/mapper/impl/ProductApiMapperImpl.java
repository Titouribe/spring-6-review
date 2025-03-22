package com.spring_framework_6_basic.product.web.mapper.impl;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.web.dto.ProductDto;
import com.spring_framework_6_basic.product.web.mapper.ProductApiMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductApiMapperImpl implements ProductApiMapper {

    @Override
    public Product mapToDomain(ProductDto productDto) {
        return new Product(productDto.id(), productDto.name());
    }
}
