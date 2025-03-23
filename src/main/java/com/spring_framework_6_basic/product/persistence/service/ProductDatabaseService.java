package com.spring_framework_6_basic.product.persistence.service;

import com.spring_framework_6_basic.product.domain.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductDatabaseService {

    Page<Product> findAllByStoreId(Pageable pageable, Long storeId);

    Product save(Product product);
}
