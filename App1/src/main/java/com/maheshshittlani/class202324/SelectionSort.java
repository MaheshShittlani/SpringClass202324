package com.maheshshittlani.class202324;

public class SelectionSort implements SortAlgo {
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
}