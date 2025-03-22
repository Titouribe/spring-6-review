package com.spring_framework_6_basic.product.persistence.mapper.impl;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.persistence.entity.ProductEntity;
import com.spring_framework_6_basic.product.persistence.mapper.ProductDomainMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductDomainMapperImpl implements ProductDomainMapper {

    @Override
    public Product mapToDomain(ProductEntity productEntity) {
        return new Product(productEntity.getId(), productEntity.getName());
    }

    @Override
    public ProductEntity mapToEntity(Product product) {
        return new ProductEntity(product.getId(), product.getName());
    }
}
