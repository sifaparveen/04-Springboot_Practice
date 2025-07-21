package com.example.springboot_practice.Service;

import com.example.springboot_practice.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void add(Laptop laptop) {
        System.out.println("method called");
    }
    public boolean isGoodForProg(Laptop lap) {
        return true;
    }

}
