package com.spring_framework_6_basic.product.domain.service.impl;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.domain.service.ProductDomainService;
import com.spring_framework_6_basic.product.persistence.service.ProductDatabaseService;
import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.persistence.service.StoreDatabaseService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class ProductDomainServiceImpl implements ProductDomainService {

    private final ProductDatabaseService productDatabaseService;

    private final StoreDatabaseService storeDatabaseService;

    public ProductDomainServiceImpl(ProductDatabaseService productDatabaseService, StoreDatabaseService storeDatabaseService) {
        this.productDatabaseService = productDatabaseService;
        this.storeDatabaseService = storeDatabaseService;
    }

    @Override
    public Page<Product> findAll(Pageable pageable, Long storeId) {
        return productDatabaseService.findAllByStoreId(pageable, storeId);
    }

    @Override
    public Product save(Product product, Long storeId) {
        return Optional.of(storeId)
                .filter(Objects::nonNull)
                .filter(storeDatabaseService::existsById)
                .map(store -> saveProductWithStore(product, store))
                .orElseThrow(() -> new RuntimeException(String.format("Store with id %s does not exists.", storeId)));
    }

    private Product saveProductWithStore(Product product, Long storeId) {
        product.setStore(new Store(storeId));
        return productDatabaseService.save(product);
    }
}
