package com.bricks.challanger.utils.scheduleds;


import com.bricks.challanger.clients.CategoryClient;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.utils.exceptions.CategoriesNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;


@Component
@EnableAsync
@AllArgsConstructor
public class CategoriesScheduledTask {

    private CategoryService categoryService;
    private CategoryClient categoryClient;


    @Async
    @Scheduled(fixedRateString = "${scheduled.task.fixed-rate}")
    public void getCategoriesTask() {
        var categories = categoryClient.getCategories();
        if(categories.isEmpty()){
            String msg = "Categories not founds";
            throw new CategoriesNotFoundException(msg);
        }


        categoryService.updateCategories(categories);
        //UPDATE
        System.out.println("Ejecutando tarea cada dos horas..." + categories.stream().map(c -> c.getName()).collect(Collectors.toList()).toString());
    }
}
