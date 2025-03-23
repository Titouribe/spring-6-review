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
@RequestMapping("stores/{storeId}/products")
public class ProductCrudControllerImpl implements ProductCrudController {

    private final ProductDomainService productDomainService;
    private final ProductApiMapper productApiMapper;

    public ProductCrudControllerImpl(ProductDomainService productDomainService, ProductApiMapper productApiMapper) {
        this.productDomainService = productDomainService;
        this.productApiMapper = productApiMapper;
    }

    @Override
    @GetMapping
    public Page<Product> getAllByStoreId(@PageableDefault(size = 20) Pageable pageable, @PathVariable(name = "storeId") Long storeId) {
        return productDomainService.findAll(pageable, storeId);
    }

    @Override
    @PostMapping
    public Product createProduct(@RequestBody ProductDto product, @PathVariable(name = "storeId") Long storeId) {
        return productDomainService
                .save(productApiMapper.mapToDomain(product), storeId);
    }
}
