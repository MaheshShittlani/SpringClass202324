package com.maheshshittlani.class202324;

public class CustomBinarySearch {
	public void search(int[] arr, int item) {
		BubbleSort sortAlgo = new BubbleSort();
//		SelectionSort sortAlgo = new SelectionSort();
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
