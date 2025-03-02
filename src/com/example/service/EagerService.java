package com.example.service;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class EagerService {
    @PostConstruct
    public void init() {
        System.out.println("EagerService initialized!");
    }

    public String getEagerMessage() {
        return "Hello from EagerService!";
    }
}
