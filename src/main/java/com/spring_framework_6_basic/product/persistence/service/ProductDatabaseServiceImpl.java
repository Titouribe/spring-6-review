package com.spring_framework_6_basic.product.persistence.service;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.persistence.mapper.ProductDomainMapper;
import com.spring_framework_6_basic.product.persistence.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductDatabaseServiceImpl implements ProductDatabaseService {

    private final ProductRepository productRepository;

    private final ProductDomainMapper productDomainMapper;

    public ProductDatabaseServiceImpl(ProductRepository productRepository, ProductDomainMapper productDomainMapper) {
        this.productRepository = productRepository;
        this.productDomainMapper = productDomainMapper;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable)
                .map(productDomainMapper::mapToDomain);
    }

    @Override
    public Product save(Product product) {
        return productDomainMapper
                .mapToDomain(productRepository
                        .save(productDomainMapper.mapToEntity(product)));
    }
}
