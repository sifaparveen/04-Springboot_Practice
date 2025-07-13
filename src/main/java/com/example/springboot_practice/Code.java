package com.example.springboot_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Code {

    @Autowired
    Subject s1;
    public void message() {
        s1.java();
        System.out.println("Coding...");
    }
}

