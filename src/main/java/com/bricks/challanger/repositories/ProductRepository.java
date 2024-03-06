package com.bricks.challanger.repositories;

import com.bricks.challanger.models.entities.Product;
import com.bricks.challanger.utils.enums.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByState(State state);
    Optional<Product> findByIdAndState(Long id, State state);

    Optional<Product> findByNameAndState(String name, State state);

}
