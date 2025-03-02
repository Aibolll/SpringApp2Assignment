package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.example.repository.MyRepository;
import com.example.repository.AnotherRepository;

@Lazy
@Service
public class MyService {
    private final MyRepository myRepository;
    private final AnotherRepository anotherRepository;

    @Autowired
    public MyService(@Qualifier("myRepository") MyRepository myRepository,
                     @Qualifier("anotherRepository") AnotherRepository anotherRepository) {
        this.myRepository = myRepository;
        this.anotherRepository = anotherRepository;
        System.out.println("MyService initialized!");
    }

    public String getServiceMessage() {
        return "Primary: " + myRepository.getData() + " | Qualifier: " + anotherRepository.getData();
    }
}
