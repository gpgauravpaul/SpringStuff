package com.example.project.demo.spring;

import com.implementation.businessLogic.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.implementation")
public class Application {

	public static void main(String[] args) {
		       ApplicationContext context = SpringApplication.run(Application.class, args);
			   BinarySearch search = context.getBean(BinarySearch.class);
		System.out.println(search.logic());

	}

}
