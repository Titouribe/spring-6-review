package com.spring_framework_6_basic.store.web.controller;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.domain.service.StoreDomainService;
import com.spring_framework_6_basic.store.web.dto.StoreDto;
import com.spring_framework_6_basic.store.web.mapper.StoreApiMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stores")
public class StoreCrudControllerImpl implements StoreCrudController {

    private final StoreDomainService storeDomainService;
    private final StoreApiMapper storeApiMapper;

    public StoreCrudControllerImpl(StoreDomainService storeDomainService, StoreApiMapper storeApiMapper) {
        this.storeDomainService = storeDomainService;
        this.storeApiMapper = storeApiMapper;
    }

    @Override
    @PostMapping
    public Store createStore(@RequestBody StoreDto storeDto) {
        return storeDomainService.create(storeApiMapper.mapToDomain(storeDto));
    }
}
