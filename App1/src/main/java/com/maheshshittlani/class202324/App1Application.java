package com.maheshshittlani.class202324;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
		
		int[] arr1 = {33,22,66,34,12,89,67};
		
		CustomBinarySearch searchAlgo1 = new CustomBinarySearch(new BubbleSort());
		searchAlgo1.search(arr1, 34);
		
		
		int[] arr2 = {33,21,61,341,112,189,617};
		
		CustomBinarySearch searchAlgo2 = new CustomBinarySearch(new SelectionSort());
		searchAlgo2.search(arr2, 112);
	}

}
