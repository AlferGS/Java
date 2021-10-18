package com.bsuir.birukov;

import com.bsuir.birukov.controller.ReallyUselessController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringRunApplication {
    @Autowired
    private static ReallyUselessController reallyUselessController;

    public static void main(String[] args) {
        SpringApplication.run(SpringRunApplication.class, args);
    }
}
