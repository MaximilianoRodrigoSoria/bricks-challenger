package com.bricks.challanger.services.impl;

import com.bricks.challanger.repositories.ProductRepository;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.services.ProductService;
import com.bricks.challanger.util.Data;
import com.bricks.challanger.utils.mappers.CategoryMapper;
import com.bricks.challanger.utils.mappers.ProductMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Objects;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;


@ContextConfiguration(classes = {ProductServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ProductServiceImplTest {

    @Autowired
    private ProductService productService;


    @MockBean
    private CategoryService categoryService;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private ProductMapper mapper;

    @MockBean
    private CategoryMapper categoryMapper;

    @Test
    @DisplayName("Searching for a product list is tested")
    void readAll() {
        //ASSEMBLE
        when(productRepository.findAllByState(any())).thenReturn(Data.PRODUCT_LIST);
        when(mapper.toModel(any())).thenReturn(Data.PRODUCT_DTO);

        //ACT
        var products = productService.readAll();

        //ASSERT
        assertTrue("Products is null", Objects.nonNull(products));
        assertEquals("Producto not found", "Product 1",products.get(0).getName());

    }

    @Test
    @DisplayName("Create a product is tested")
    void created() {
        //ASSEMBLE
        when(categoryService.findByNameAndCode(any(),any())).thenReturn(Data.CATEGORY_DTO);
        when(productRepository.save(any())).thenReturn(Data.PRODUCT);
        when(mapper.toModel(any())).thenReturn(Data.PRODUCT_DTO);

        //ACT
        var product = productService.created(Data.PRODUCT_DTO);

        //ASSERT
        assertTrue("Products is null", Objects.nonNull(product));
        assertEquals("Producto not found", "Product 1",product.getName());
    }

    @Test
    @DisplayName("Read a product is tested")
    void read() {
        //ASSEMBLE
        when(productRepository.findByIdAndState(any(),any())).thenReturn(Optional.of(Data.PRODUCT));
        when(mapper.toModel(any())).thenReturn(Data.PRODUCT_DTO);

        //ACT
        var product = productService.read(1L);

        //ASSERT
        assertTrue("Products is null", Objects.nonNull(product));
        assertEquals("Producto not found", "Product 1",product.getName());
    }

    @Test
    @DisplayName("Updated a product is tested")
    void update() {
        //ASSEMBLE
        when(productRepository.findByNameAndState(any(),any())).thenReturn(Optional.of(Data.PRODUCT));
        when(categoryService.findByNameAndCode(any(),any())).thenReturn(Data.CATEGORY_DTO);
        when(mapper.toModel(any())).thenReturn(Data.PRODUCT_DTO);

        when(productRepository.save(any())).thenReturn(Data.PRODUCT);
        //ACT
        var product = productService.update(Data.PRODUCT_DTO);

        //ASSERT
        assertTrue("Products is null", Objects.nonNull(product));
        assertEquals("Producto not found", "Product 1",product.getName());
    }

    @Test
    @DisplayName("Delete a product is tested")
    void delete() {
        //ASSEMBLE
        when(productRepository.findById(any())).thenReturn(Optional.of(Data.PRODUCT));

        //ACT
        productService.delete(1L);

        //ASSERT
        verify(productRepository).findById(1L);

    }
}