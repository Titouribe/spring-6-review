package com.spring_framework_6_basic.store.persistence.repository;

import com.spring_framework_6_basic.store.persistence.entity.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<StoreEntity, Long> {
}
