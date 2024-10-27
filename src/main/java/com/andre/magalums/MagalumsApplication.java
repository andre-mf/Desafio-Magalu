package com.andre.magalums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MagalumsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagalumsApplication.class, args);
    }

}
