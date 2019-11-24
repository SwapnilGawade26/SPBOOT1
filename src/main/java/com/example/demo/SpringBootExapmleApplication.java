package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootExapmleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootExapmleApplication.class, args);
		
		
	ApplicationContext applicationContext = SpringApplication.run(SpringBootExapmleApplication.class, args);
	
	
	
	String[] beanNames= applicationContext.getBeanDefinitionNames();
	
	Arrays.parallelSort(beanNames);
	for (String string : beanNames) {
		//System.out.println(string);
	}
		
		
		
		
	}

}
