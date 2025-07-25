package com.bala.micoservice_product.repository;

import com.bala.micoservice_product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
