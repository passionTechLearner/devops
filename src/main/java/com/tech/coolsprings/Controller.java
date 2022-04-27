package com.tech.coolsprings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class Controller {

    @GetMapping("greeting")
    public String greeting() {
        return "Hello World";
    }
}
