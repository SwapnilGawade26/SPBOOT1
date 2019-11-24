package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootExapmleApplication {
	
	
	/*
	 * @Bean public EmaiUser getAdmin() { return new EmaiUser("admin","apass"); }
	 */
	
	
	@Bean
	public EmaiUser getHr() {
		return new EmaiUser("HR","apass");
	}
	

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootExapmleApplication.class, args);
		
		
	ApplicationContext applicationContext = SpringApplication.run(SpringBootExapmleApplication.class, args);
	
	
	
	String[] beanNames= applicationContext.getBeanDefinitionNames();
	
	Arrays.parallelSort(beanNames);
	for (String string : beanNames) {
		System.out.println(string);
	}
		
		
		
		
	}

}
