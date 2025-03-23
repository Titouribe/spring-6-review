package com.spring_framework_6_basic.store.web.mapper;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.web.dto.StoreDto;

public interface StoreApiMapper {

    Store mapToDomain(StoreDto storeDto);
}
