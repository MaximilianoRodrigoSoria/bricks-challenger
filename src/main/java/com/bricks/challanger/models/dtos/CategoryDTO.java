package com.bricks.challanger.models.dtos;
import com.bricks.challanger.utils.enums.State;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    @Schema(description = "Unique record identifier", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private int id;
    @Schema(description = "Code for category", example = "GAS")
    private String code;
    @Schema(description = "Name for category", example = "Gastronomía")
    private String name;
    @Schema(description = "Description for category", example = "This is a category", accessMode = Schema.AccessMode.READ_ONLY)
    private String description;
    @Schema(description = "Icon for category", example = "<img> .... </img>", accessMode = Schema.AccessMode.READ_ONLY)
    private String icon;
    @Schema(description = "Category status",  accessMode = Schema.AccessMode.READ_ONLY, allowableValues = {"ENABLED", "DISABLED"})
    private State state;
}
