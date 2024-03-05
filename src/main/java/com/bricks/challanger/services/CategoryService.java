package com.bricks.challanger.services;

import com.bricks.challanger.models.dtos.CategoryDTO;

import java.util.List;

public interface CategoryService extends AbstractService<CategoryDTO, Long> {

    void updateCategories(List<CategoryDTO> categories);

}
