package com.spring_framework_6_basic.product.persistence.mapper.impl;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.persistence.entity.ProductEntity;
import com.spring_framework_6_basic.product.persistence.mapper.ProductDomainMapper;
import com.spring_framework_6_basic.store.persistence.mapper.StoreDomainMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductDomainMapperImpl implements ProductDomainMapper {

    private final StoreDomainMapper storeDomainMapper;

    public ProductDomainMapperImpl(StoreDomainMapper storeDomainMapper) {
        this.storeDomainMapper = storeDomainMapper;
    }

    @Override
    public Product mapToDomain(ProductEntity productEntity) {
        return new Product(productEntity.getId(), productEntity.getName());
    }

    @Override
    public ProductEntity mapToEntity(Product product) {
        return new ProductEntity(product.getId(), product.getName(), storeDomainMapper.mapToEntity(product.getStore()));
    }
}
