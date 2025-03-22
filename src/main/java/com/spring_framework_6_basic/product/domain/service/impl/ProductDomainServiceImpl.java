package com.spring_framework_6_basic.product.domain.service.impl;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.domain.service.ProductDomainService;
import com.spring_framework_6_basic.product.persistence.service.ProductDatabaseService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductDomainServiceImpl implements ProductDomainService {

    private final ProductDatabaseService productDatabaseService;

    public ProductDomainServiceImpl(ProductDatabaseService productDatabaseService) {
        this.productDatabaseService = productDatabaseService;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productDatabaseService.findAll(pageable);
    }

    @Override
    public Product save(Product product) {
        return productDatabaseService.save(product);
    }
}
