package com.maheshshittlani.util.searchUtil;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.maheshshittlani.util.sorting.SortAlgo;

@Component
public class FindNthSmallest {
	private SortAlgo sortAlgo;
	
	public FindNthSmallest(@Qualifier("selectionSortAlgo") SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}

	public int find(int[] arr , int n) {
		sortAlgo.sort(arr);
		System.out.println(sortAlgo);
		
		return arr[n - 1];
	}
}
