package com.bricks.challanger.services.impl;


import com.bricks.challanger.models.dtos.ProductDTO;
import com.bricks.challanger.models.entities.Product;
import com.bricks.challanger.repositories.ProductRepository;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.services.ProductService;
import com.bricks.challanger.utils.GlobalConstants;
import com.bricks.challanger.utils.enums.State;
import com.bricks.challanger.utils.exceptions.IdNotFoundException;
import com.bricks.challanger.utils.exceptions.NameNotFoundException;
import com.bricks.challanger.utils.exceptions.SaveException;
import com.bricks.challanger.utils.mappers.CategoryMapper;
import com.bricks.challanger.utils.mappers.ProductMapper;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class ProductServiceImpl implements ProductService {

    private CategoryService categoryService;

    private ProductRepository productRepository;

    private ProductMapper mapper;

    private CategoryMapper categoryMapper;

    private final String KEY = this.getClass().getSimpleName() + " ->";

    @Override
    public List<ProductDTO> readAll() {

        return productRepository.findAllByState(State.ENABLED)
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO created(ProductDTO request) {
        Product product = null;
        var category = categoryService.findByNameAndCode(request.getCategory().getName(),request.getCategory().getCode());
        try {
            request.setCategory(category);
            request.setState(State.ENABLED);
            product = productRepository.save(mapper.toEntity(request));

        } catch (Exception e) {
            log.error("{} Registration could not be saved in products", KEY);
            throw new SaveException(GlobalConstants.PRODUCT_TABLE);
        }
        return mapper.toModel(product);
    }

    @Override
    public ProductDTO read(Long id) {
        var product = productRepository.findByIdAndState(id,State.ENABLED).orElseThrow(()-> {
        log.error("{} Error reading the product with the id {}", KEY,id);
        throw new IdNotFoundException(GlobalConstants.PRODUCT_TABLE);});
        return mapper.toModel(product);
    }

    @Override
    public ProductDTO update(ProductDTO request) {
        var product =  productRepository.findByNameAndState(request.getName(),State.ENABLED).orElseThrow(()-> {
            log.error("{} Error reading the product with the name {}", KEY,request.getName());
            throw new NameNotFoundException(GlobalConstants.PRODUCT_TABLE); });

        var category = categoryService.findByNameAndCode(request.getCategory().getName(),request.getCategory().getCode());
        BeanUtils.copyProperties(request, product);
        product.setCategory(categoryMapper.toEntity(category));
        product.setState(State.ENABLED);
        productRepository.save(product);
        return request;

    }

    @Override
    public void delete(Long id) {
        var product = productRepository.findById(id).orElseThrow(()-> {
            log.error("Error reading the product with the id {}", id);
            throw new IdNotFoundException(GlobalConstants.PRODUCT_TABLE);});
        product.setState(State.DISABLED);
        productRepository.save(product);
    }

}
