package com.example.springboot_practice.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    @Override
    public void code(){
        System.out.println("compilling with desktop");
    }

}