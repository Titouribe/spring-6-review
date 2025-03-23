package com.spring_framework_6_basic.store.web.mapper.impl;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.web.dto.StoreDto;
import com.spring_framework_6_basic.store.web.mapper.StoreApiMapper;
import org.springframework.stereotype.Component;

@Component
public class StoreApiMapperImpl implements StoreApiMapper {

    @Override
    public Store mapToDomain(StoreDto storeDto) {
        Store domain = new Store();
        domain.setName(storeDto.name());
        domain.setId(storeDto.id());
        return domain;
    }
}
