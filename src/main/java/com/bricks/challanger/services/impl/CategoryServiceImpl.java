package com.bricks.challanger.services.impl;


import com.bricks.challanger.models.dtos.CategoryDTO;
import com.bricks.challanger.models.entities.Category;
import com.bricks.challanger.repositories.CategoryRepository;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.utils.GlobalConstants;
import com.bricks.challanger.utils.enums.State;
import com.bricks.challanger.utils.exceptions.IdNotFoundException;
import com.bricks.challanger.utils.exceptions.SaveException;
import com.bricks.challanger.utils.mappers.CategoryMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class CategoryServiceImpl  implements CategoryService {

   private CategoryMapper categoryMapper;
   private CategoryRepository categoryRepository;
   private CategoryMapper mapper;
   private final String KEY = this.getClass().getSimpleName() + " ->";

    @Override
    public void updateCategories(List<CategoryDTO> categories) {
        categories.stream().map(categoryMapper::toEntity).map(categoryRepository::save);
    }


    @Override
    public List<CategoryDTO> readAll() {
        return categoryRepository.findAll()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO created(CategoryDTO request) {
        Category category = null;
        try {
            category = categoryRepository.save(mapper.toEntity(request));
        } catch (Exception e) {
            log.error("{} Registration could not be saved in Category", KEY);
            throw new SaveException(GlobalConstants.CATEGORY_TABLE);
        }
        return mapper.toModel(category);
    }

    @Override
    public CategoryDTO read(Long id) {
        var product = categoryRepository.findById(id).orElseThrow(()-> {
            log.error("{} Error reading the category with the id: {}", id, KEY);
            throw new IdNotFoundException(GlobalConstants.CATEGORY_TABLE);});
        return mapper.toModel(product);
    }

    @Override
    public CategoryDTO update(CategoryDTO request, Long id) {
        var category = categoryRepository.findById(id);
        if (category.isEmpty()){
            log.error("{} Error updating the category with the id: {}", id, KEY);
            throw new IdNotFoundException(GlobalConstants.CATEGORY_TABLE);
        }
        created(request);
        return request;
    }

    @Override
    public void delete(Long id) {
        var category = categoryRepository.findById(id).orElseThrow(()-> {
            log.error("{} Error reading the category with the id {}", id, KEY);
            throw new IdNotFoundException(GlobalConstants.CATEGORY_TABLE);});
        category.setState(State.DISABLED);
        categoryRepository.save(category);

    }
}
