package com.example.springboot_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootPracticeApplication {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(SpringbootPracticeApplication.class, args);

		Code obj = context.getBean(Code.class);

		obj.message();

	}

}
