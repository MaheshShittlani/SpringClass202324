package com.maheshshittlani.class202324;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
		
		int[] arr = {33,22,66,34,12,89,67};
		
		CustomBinarySearch searchAlgo = new CustomBinarySearch();
		searchAlgo.search(arr, 34);
	}

}
