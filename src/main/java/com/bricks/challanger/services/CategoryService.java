package com.bricks.challanger.services;

import com.bricks.challanger.models.dtos.CategoryDTO;

import java.util.List;

public interface CategoryService {

    CategoryDTO findByNameAndCode(String name, String code);

    void updateCategories(List<CategoryDTO> categories);

    List<CategoryDTO> readAll();

}
