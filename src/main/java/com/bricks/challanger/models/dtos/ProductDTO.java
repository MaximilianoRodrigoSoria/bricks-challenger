package com.bricks.challanger.models.dtos;

import com.bricks.challanger.utils.enums.State;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    @Schema(description = "Unique record identifier", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private int id;

    @Schema(description = "Product name", example = "Product 1")
    private String name;

    @Schema(description = "Price product", example = "10.00")
    private double price;

    @Schema(description = "Stock product", example = "6")
    private int stock;

    @Schema(description = "Category Product", example = "1")
    private int category;

    @Schema(description = "Registration status",  accessMode = Schema.AccessMode.READ_ONLY, allowableValues = {"ENABLED", "DISABLED"})
    private State state;
}
