package com.bricks.challanger.utils.mappers;


import com.bricks.challanger.models.dtos.CategoryDTO;
import com.bricks.challanger.models.entities.Category;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "icon", target = "icon")
    })
    CategoryDTO toModel(Category entity);

    @InheritConfiguration
    Category toEntity(CategoryDTO model);

    Iterable<CategoryDTO>toModels(Iterable<Category> userEntities);
    Iterable<Category>toEntities(Iterable<CategoryDTO> model);
}
