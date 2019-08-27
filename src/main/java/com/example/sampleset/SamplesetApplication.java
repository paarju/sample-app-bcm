package com.example.sampleset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SamplesetApplication {

    @RequestMapping("/")
    String hello() {
        return "Hello World! Spring Boot Sample App";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SamplesetApplication.class, args);
    }
}