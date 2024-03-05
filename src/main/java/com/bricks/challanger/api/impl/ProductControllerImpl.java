package com.bricks.challanger.api.impl;

import com.bricks.challanger.api.ProductController;
import com.bricks.challanger.models.dtos.ProductDTO;
import com.bricks.challanger.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/Product")
@AllArgsConstructor
public class ProductControllerImpl implements ProductController {

    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAll() {
        var response = service.readAll();
        return response.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(response);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDTO> post(@RequestBody ProductDTO request) {
        return ResponseEntity.ok(service.created(request));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductDTO> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.read(id));
    }


    @PutMapping(path = "/{id}")
    public ResponseEntity<ProductDTO> put(@PathVariable Long id, @RequestBody ProductDTO request) {
        return ResponseEntity.ok(service.update(request, id));
    }


    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}