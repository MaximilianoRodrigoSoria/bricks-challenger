package com.bricks.challanger.repositories;

import com.bricks.challanger.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
