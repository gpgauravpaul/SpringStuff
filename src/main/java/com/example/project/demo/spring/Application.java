package com.example.project.demo.spring;

import com.implementation.businessLogic.BinarySearch;
import com.implementation.businessLogic.ScopeLearn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = "com.implementation")
@PropertySource("var.properties")
public class Application {

	public static void main(String[] args) {
		       ApplicationContext context = SpringApplication.run(Application.class, args);
//         ScopeLearn scopeLearn = context.getBean(ScopeLearn.class);
//		System.out.println(scopeLearn);
//		System.out.println(scopeLearn.getJdbcConnection());
//		ScopeLearn scopeLearn1 = context.getBean(ScopeLearn.class);
//		System.out.println(scopeLearn1);
//		System.out.println(scopeLearn1);
//		System.out.println(scopeLearn1.getJdbcConnection());

		BinarySearch search = context.getBean(BinarySearch.class);
		System.out.println(search.logic());
		System.out.println(search);
//		BinarySearch search1 = context.getBean(BinarySearch.class);
//		System.out.println(search1);

	}

}
