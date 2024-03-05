package com.bricks.challanger.utils.mappers;


import com.bricks.challanger.models.dtos.ProductDTO;
import com.bricks.challanger.models.entities.Product;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "state", target = "state"),
            @Mapping(source = "category", target = "category")
    })
    ProductDTO toModel(Product entity);

    @InheritConfiguration
    Product toEntity(ProductDTO model);

    Iterable<ProductDTO>toModels(Iterable<Product> userEntities);
    Iterable<Product>toEntities(Iterable<ProductDTO> model);
}
