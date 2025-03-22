package com.spring_framework_6_basic.product.web.controller.impl;

import com.spring_framework_6_basic.product.domain.model.Product;
import com.spring_framework_6_basic.product.domain.service.ProductDomainService;
import com.spring_framework_6_basic.product.web.controller.ProductCrudController;
import com.spring_framework_6_basic.product.web.dto.ProductDto;
import com.spring_framework_6_basic.product.web.mapper.ProductApiMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductCrudControllerImpl implements ProductCrudController {

    private final ProductDomainService productDomainService;
    private final ProductApiMapper productApiMapper;

    public ProductCrudControllerImpl(ProductDomainService productDomainService, ProductApiMapper productApiMapper) {
        this.productDomainService = productDomainService;
        this.productApiMapper = productApiMapper;
    }

    @Override
    @GetMapping
    public Page<Product> getAll(@PageableDefault(size = 20) Pageable pageable) {
        return productDomainService.findAll(pageable);
    }

    @Override
    @PostMapping
    public Product createProduct(@RequestBody ProductDto product) {
        return productDomainService
                .save(productApiMapper.mapToDomain(product));
    }
}
