package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AnotherRepository {
    public String getData() {
        return "Data from AnotherRepository";
    }
}
