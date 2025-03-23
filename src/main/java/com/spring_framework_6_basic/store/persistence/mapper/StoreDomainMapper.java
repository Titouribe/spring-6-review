package com.spring_framework_6_basic.store.persistence.mapper;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.persistence.entity.StoreEntity;

public interface StoreDomainMapper {

    Store mapToDomain(StoreEntity store);

    StoreEntity mapToEntity(Store store);
}
