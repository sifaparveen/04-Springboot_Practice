package com.example.springboot_practice;

import com.example.springboot_practice.Service.LaptopService;
import com.example.springboot_practice.model.Alien;
import com.example.springboot_practice.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootPracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringbootPracticeApplication.class, args);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		service.add(laptop);



	}

}
