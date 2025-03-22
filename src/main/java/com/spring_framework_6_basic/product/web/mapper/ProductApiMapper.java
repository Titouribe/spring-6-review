package com.spring_framework_6_basic.product.web.mapper;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.web.dto.ProductDto;

public interface ProductApiMapper {

    Product mapToDomain(ProductDto productDto);
}
