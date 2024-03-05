package com.bricks.challanger.clients;

import com.bricks.challanger.models.dtos.CategoryDTO;
import com.bricks.challanger.models.dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
    public class CategoryClient {
        private final WebClient webClient;
        public CategoryClient(@Value("${category.service.host}") String percentageUrl) {
            this.webClient = WebClient.create(percentageUrl);
        }
        public List<CategoryDTO> getCategories() {
            List<CategoryDTO> remoteCategories = webClient.get()
                    .uri("/category/producer")
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToFlux(CategoryDTO.class)
                    .collectList()
                    .block();

            return remoteCategories;
        }

}

