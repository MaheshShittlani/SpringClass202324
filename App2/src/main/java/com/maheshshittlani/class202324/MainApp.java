package com.maheshshittlani.class202324;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MainApp {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(MainApp.class)) {
		
		BusinessLogic obj = context.getBean(BusinessLogic.class);
		
		System.out.println(obj);
		
		String[] beans = context.getBeanDefinitionNames();
		
		for(String bean: beans) {
			System.out.println(bean);
		}
		
		
		}
		
		
	}
}
