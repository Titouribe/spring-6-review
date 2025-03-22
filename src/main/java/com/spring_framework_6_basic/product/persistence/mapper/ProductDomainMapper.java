package com.spring_framework_6_basic.product.persistence.mapper;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.persistence.entity.ProductEntity;

public interface ProductDomainMapper {

    Product mapToDomain(ProductEntity productEntity);

    ProductEntity mapToEntity(Product product);
}
