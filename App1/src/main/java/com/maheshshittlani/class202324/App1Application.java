package com.maheshshittlani.class202324;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.maheshshittlani.util.searchUtil.CustomBinarySearch;
import com.maheshshittlani.util.searchUtil.FindNthSmallest;

@Configuration
@ComponentScan(".;com.maheshshittlani.util.searchUtil;com.maheshshittlani.util.sorting;")
public class App1Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(App1Application.class, args);
		
		int[] arr1 = {33,22,66,34,12,89,67};
		
		CustomBinarySearch searchAlgo1 = context.getBean(CustomBinarySearch.class);
		searchAlgo1.search(arr1, 34);
		
		
		int[] arr2 = {33,21,61,341,112,189,617};
		
		CustomBinarySearch searchAlgo2 = context.getBean(CustomBinarySearch.class);
		searchAlgo2.search(arr2, 112);
		
		
		int[] arr3 = {5,1,9,8,7,65,81};
		
		FindNthSmallest smallestAlgo = context.getBean(FindNthSmallest.class);
		int result =  smallestAlgo.find(arr3, 3);
		
		System.out.println("Third smallest value: " + result);
	}

}
