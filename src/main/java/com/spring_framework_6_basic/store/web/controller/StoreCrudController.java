package com.spring_framework_6_basic.store.web.controller;

import com.spring_framework_6_basic.store.domain.model.Store;
import com.spring_framework_6_basic.store.web.dto.StoreDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface StoreCrudController {

    Store createStore(@RequestBody StoreDto storeDto);
}
