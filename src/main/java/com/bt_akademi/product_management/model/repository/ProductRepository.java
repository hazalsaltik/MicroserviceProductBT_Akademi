package com.bt_akademi.product_management.model.repository;

import com.bt_akademi.product_management.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
    // SELECT * FROM PRODUCTS WHERE PRICE > ?;
    List<Product> findAllByPriceGreaterThan(Double price);

    // SELECT * FROM PRODUCTS WHERE PRICE >= ?;
    List<Product> findAllByPriceGreaterThanEqual(Double price);
}

