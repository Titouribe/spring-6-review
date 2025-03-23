package com.spring_framework_6_basic.store.persistence.service;

import com.spring_framework_6_basic.store.domain.model.Store;

public interface StoreDatabaseService {

    boolean existsById(Long id);

    Store create(Store store);
}
