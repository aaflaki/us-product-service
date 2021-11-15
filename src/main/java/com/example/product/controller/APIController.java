package com.example.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class APIController {
    @Value("${author.name:nobody has claimed it yet}")
    private String author;
    @GetMapping("status")
    String sendStatus(){
        return "I'm working very hard!\nCreated by: " + author;
    }
}
