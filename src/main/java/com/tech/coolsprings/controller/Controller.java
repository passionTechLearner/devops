package com.tech.coolsprings.controller;

import com.tech.coolsprings.model.CustomerData;
import com.tech.coolsprings.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("v1")
public class Controller {

    @Autowired
    private CustomerService customerService;
    @GetMapping("ping")
    public String healthCheck() {
        return "I am alive!!!";
    }

    @GetMapping("all-data")
    public List<CustomerData> getAllData() throws IOException {
        return customerService.getAllData();
    }

    @PostMapping("all-data")
    public List<CustomerData> postAllData() throws IOException {
        return customerService.getAllData();
    }
}
