package com.spring_framework_6_basic.product.web.controller;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.web.dto.ProductDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductCrudController {

    Page<Product> getAllByStoreId(@PageableDefault(size = 20) Pageable pageable, @PathVariable(name = "storeId") Long storeId);

    Product createProduct(@RequestBody ProductDto product, @PathVariable(name = "storeId") Long storeId);
}
