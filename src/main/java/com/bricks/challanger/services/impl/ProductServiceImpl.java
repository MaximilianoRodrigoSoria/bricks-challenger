package com.bricks.challanger.services.impl;


import com.bricks.challanger.clients.CategoryClient;
import com.bricks.challanger.models.dtos.ProductDTO;
import com.bricks.challanger.models.entities.Product;
import com.bricks.challanger.repositories.ProductRepository;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.services.ProductService;
import com.bricks.challanger.utils.enums.State;
import com.bricks.challanger.utils.exceptions.IdNotFoundException;
import com.bricks.challanger.utils.exceptions.SaveException;
import com.bricks.challanger.utils.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private CategoryService categoryService;

    private ProductRepository productRepository;

    private ProductMapper mapper;

    @Override
    public List<ProductDTO> readAll() {

        var c = categoryService.readAll();
        log.info(c.toString());

        return productRepository.findAll()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO created(ProductDTO request) {
        Product product = null;
        try {
            product = productRepository.save(mapper.toEntity(request));
        } catch (Exception e) {
            log.error("Registration could not be saved in products");
            throw new SaveException("Product");
        }
        return mapper.toModel(product);
    }

    @Override
    public ProductDTO read(Long id) {
        var product = productRepository.findById(id).orElseThrow(()-> {
        log.error("Error reading the product with the id {}", id);
        throw new IdNotFoundException("Product");});
        return mapper.toModel(product);
    }

    @Override
    public ProductDTO update(ProductDTO request, Long id) {
        var product = productRepository.findById(id);
        if (product.isEmpty()){
            log.error("Error updating the product with the id {}", id);
            throw new IdNotFoundException("Product");
        }
        created(request);
        return request;

    }

    @Override
    public void delete(Long id) {
        var product = productRepository.findById(id).orElseThrow(()-> {
            log.error("Error reading the product with the id {}", id);
            throw new IdNotFoundException("Product");});
        product.setState(State.DISABLED);
        productRepository.save(product);
    }

}