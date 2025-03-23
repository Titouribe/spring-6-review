package com.spring_framework_6_basic.store.persistence.mapper.impl;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.persistence.entity.StoreEntity;
import com.spring_framework_6_basic.store.persistence.mapper.StoreDomainMapper;
import org.springframework.stereotype.Component;

@Component
public class StoreDomainMapperImpl implements StoreDomainMapper {

    @Override
    public Store mapToDomain(StoreEntity store) {
        Store domain = new Store();
        domain.setId(store.getId());
        domain.setName(store.getName());
        return domain;
    }

    @Override
    public StoreEntity mapToEntity(Store store) {
        StoreEntity entity = new StoreEntity();
        entity.setId(store.getId());
        entity.setName(store.getName());
        return entity;
    }
}
