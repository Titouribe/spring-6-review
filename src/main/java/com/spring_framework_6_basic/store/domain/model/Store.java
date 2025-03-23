package com.spring_framework_6_basic.store.domain.model;

import com.spring_framework_6_basic.product.domain.model.Product;

import java.util.Objects;
import java.util.Set;

public class Store {

    private Long id;

    private String name;

    public Store() {
    }

    public Store(Long id) {
        this.id = id;
    }

    private Set<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
