package com.storycreator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }

}
