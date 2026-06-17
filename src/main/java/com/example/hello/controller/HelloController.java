package com.example.hello.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello API", description = "Sample Hello World API")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Get Hello Message")
    public String hello() {
        return "Hello World from Spring Boot Java 17 and 21";
    }
}