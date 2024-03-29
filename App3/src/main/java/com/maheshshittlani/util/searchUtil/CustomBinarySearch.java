package com.maheshshittlani.util.searchUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maheshshittlani.util.sorting.SortAlgo;

@Component
public class CustomBinarySearch {
	@Autowired
	private SortAlgo sortAlgo;
	
	public CustomBinarySearch(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
	
	public CustomBinarySearch() {
		super();
	}




	public void search(int[] arr, int item) {
		sortAlgo.sort(arr);
		System.out.println(sortAlgo);
		
		int pos = searchItem(arr, item);
		
		if(pos != -1) {
			System.out.println("Item found on position: " + pos);
		}else {
			System.out.println("Item not found");
		}
	}

	private int searchItem(int[] arr, int item) {
		int lb = 0;
		int ub = arr.length - 1;
		
		while(lb <= ub) {
			int mid = (lb + ub) / 2;
			
			if(item == arr[mid]) {
				return mid;
			}
			
			if(item > arr[mid]) {
				lb = mid + 1;
			} else {
				ub = mid - 1;
			}
		}
		return -1;
	}
}
