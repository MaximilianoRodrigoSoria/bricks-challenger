package com.bricks.challanger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BricksChallengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BricksChallengerApplication.class, args);
    }

}
