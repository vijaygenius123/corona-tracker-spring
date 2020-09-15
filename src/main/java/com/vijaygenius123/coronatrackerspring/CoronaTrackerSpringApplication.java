package com.vijaygenius123.coronatrackerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaTrackerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaTrackerSpringApplication.class, args);
    }

}
