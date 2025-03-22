package com.spring_framework_6_basic.store.persistence.entity;

import com.spring_framework_6_basic.product.persistence.entity.ProductEntity;
import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "store")
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "store", fetch = LAZY)
    private Set<ProductEntity> products;

    public StoreEntity() {
    }

    public StoreEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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

    public Set<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductEntity> products) {
        this.products = products;
    }
}
