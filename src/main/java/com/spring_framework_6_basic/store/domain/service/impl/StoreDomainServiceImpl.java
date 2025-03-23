package com.spring_framework_6_basic.store.domain.service.impl;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.domain.service.StoreDomainService;
import com.spring_framework_6_basic.store.persistence.service.StoreDatabaseService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StoreDomainServiceImpl implements StoreDomainService {

    private final StoreDatabaseService storeDatabaseService;

    public StoreDomainServiceImpl(StoreDatabaseService storeDatabaseService) {
        this.storeDatabaseService = storeDatabaseService;
    }

    @Override
    public boolean existsById(Long id) {
        return storeDatabaseService.existsById(id);
    }

    @Override
    public Store create(Store store) {
        return storeDatabaseService.create(store);
    }
}
