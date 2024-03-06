package com.bricks.challanger.api;

import com.bricks.challanger.api.handlers.responses.ErrorsResponse;
import com.bricks.challanger.models.dtos.ProductDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Tag(name = "Product", description = "Operations related to Product")
public interface ProductController {

    @ApiResponse(
            responseCode = "400",
            description = "When the request have a field invalid we response this",
            content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorsResponse.class))
            }
    )
    @Operation(summary = "Return a list with Products")
    public ResponseEntity<List<ProductDTO>> getAll();


    @Operation(summary = "Save a Product")
    public ResponseEntity<ProductDTO> post(@RequestBody ProductDTO request);


    @Operation(summary = "Return a Product")
    public ResponseEntity<ProductDTO> get(@PathVariable Long id);


    @Operation(summary = "Update Product")
    public ResponseEntity<ProductDTO> put(@RequestBody ProductDTO request);


    @Operation(summary = "Delete a Product")
    public ResponseEntity<Void> delete(@PathVariable Long id);
}
