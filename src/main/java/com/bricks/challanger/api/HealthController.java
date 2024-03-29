package com.bricks.challanger.api;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name="Health controller", description = "Obtain information on the health of the service", externalDocs = @ExternalDocumentation(description = "Obtain information on the health of the service", url = "http://localhost:8080/health"))
public interface HealthController {
    @GetMapping
    @Operation(summary = "Obtain information on the health of the service")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK")
    })
    ResponseEntity<String> health();
}