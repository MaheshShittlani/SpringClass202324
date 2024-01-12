package com.maheshshittlani.util.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Qualifier("selectionSortAlgo")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SelectionSort implements SortAlgo {
	
	@PostConstruct
	public void prerequisite() {
		System.out.println("Executed before");
	}
	
	public void sort(int[] arr) {
		int n = arr.length;
		int t;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i] > arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Last wish");
	}
}