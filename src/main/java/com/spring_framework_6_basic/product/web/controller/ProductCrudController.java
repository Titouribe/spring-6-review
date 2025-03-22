package com.spring_framework_6_basic.product.web.controller;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.web.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public interface ProductCrudController {

    public Page<Product> getAll(@PageableDefault(size = 20) Pageable pageable);

    public Product createProduct(ProductDto product);
}
