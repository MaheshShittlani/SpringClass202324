package com.maheshshittlani.util.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("bubbleSortAlgo")
public class BubbleSort implements SortAlgo {
	public void sort(int[] arr) {
		int n = arr.length;
		int t;
		
		for(int i = 1; i < n -1 ;i++) {
			for(int j = 0; j < n - i; j++) {
				if(arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
			
		}
	}
}