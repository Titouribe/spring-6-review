package com.spring_framework_6_basic.store.persistence.service.impl;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.persistence.mapper.StoreDomainMapper;
import com.spring_framework_6_basic.store.persistence.repository.StoreRepository;
import com.spring_framework_6_basic.store.persistence.service.StoreDatabaseService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StoreDatabaseServiceImpl implements StoreDatabaseService {

    private final StoreRepository storeRepository;
    private final StoreDomainMapper storeDomainMapper;

    public StoreDatabaseServiceImpl(StoreRepository storeRepository, StoreDomainMapper storeDomainMapper) {
        this.storeRepository = storeRepository;
        this.storeDomainMapper = storeDomainMapper;
    }

    @Override
    public boolean existsById(Long id) {
        return storeRepository.existsById(id);
    }

    @Override
    public Store create(Store store) {
        return storeDomainMapper.mapToDomain(storeRepository.save(storeDomainMapper.mapToEntity(store)));
    }
}
