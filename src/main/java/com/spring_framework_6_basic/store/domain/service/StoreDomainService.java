package com.spring_framework_6_basic.store.domain.service;

import com.spring_framework_6_basic.store.domain.model.Store;

public interface StoreDomainService {

    boolean existsById(Long id);

    Store create(Store store);
}
