package com.bricks.challanger.utils.scheduleds;


import com.bricks.challanger.clients.CategoryClient;
import com.bricks.challanger.services.CategoryService;
import com.bricks.challanger.utils.exceptions.CategoriesNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;




@Component
@EnableAsync
@AllArgsConstructor
@Slf4j
public class CategoriesScheduledTask {

    private CategoryService categoryService;
    private CategoryClient categoryClient;
    private final String KEY = this.getClass().getSimpleName() + " ->";

    @Async
    @Scheduled(fixedRateString = "${scheduled.task.fixed-rate}")
    public void getCategoriesTask() {
        var categories = categoryClient.getCategories();
        if(categories.isEmpty()){
            String msg = "Categories not founds";
            log.error(KEY  + msg);
            throw new CategoriesNotFoundException(msg);
        }
        categoryService.updateCategories(categories);
        log.info("{} The categories were updated", KEY);
    }
}
