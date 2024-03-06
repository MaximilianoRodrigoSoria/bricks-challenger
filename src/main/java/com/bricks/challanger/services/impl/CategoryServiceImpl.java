package com.bricks.challanger.services.impl;


import com.bricks.challanger.models.dtos.CategoryDTO;
import com.bricks.challanger.repositories.CategoryRepository;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.utils.exceptions.CategoriesNotFoundException;
import com.bricks.challanger.utils.mappers.CategoryMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
@Slf4j
public class CategoryServiceImpl  implements CategoryService {

   private CategoryRepository categoryRepository;
   private CategoryMapper mapper;
   private final String KEY = this.getClass().getSimpleName() + " ->";

    @Override
    public CategoryDTO findByNameAndCode(String name, String code) {

        var category = categoryRepository.findByNameAndCode(name,code).orElseThrow(()-> {
            log.error("{} Error reading the category with the code: {}  name: {}", KEY, code,name);
            throw new CategoriesNotFoundException("Category not found");
        });

        return mapper.toModel(category);
    }

    @Override
    public void updateCategories(List<CategoryDTO> categories) {
        categories.forEach(categoryDTO -> {
            var category =  categoryRepository
                    .findByNameAndCode(categoryDTO.getName(),categoryDTO.getCode())
                    .orElse(categoryRepository.save(mapper.toEntity(categoryDTO)));
            if(Objects.nonNull(category)){
                BeanUtils.copyProperties(categoryDTO, category);
                categoryRepository.save(category);
            }
        });

    }

}
