package com.example.repository;

import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Primary;

@Primary
@Repository
public class MyRepository {
    public String getData() {
        return "Data from MyRepository (Primary)";
    }
}
