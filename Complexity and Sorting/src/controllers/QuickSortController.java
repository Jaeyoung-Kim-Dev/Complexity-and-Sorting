package controllers;

import java.util.*;

public class QuickSortController extends Controller {	
	private int swapCount = 0;
	private int comparisonCount = 0;
	private int left = 0;
	private int right = 0;
	
    public void sort(Comparable[] items, Comparator comparator) {
    	this.right = items.length;
    	//quickSort(items, comparator, left, right); 
    } 
    
    public int getSwapCount() {
		return swapCount;
	}

	/**
	 * @return the comparisonCount
	 */
	public int getComparisonCount() {
		return comparisonCount;
	}
    
}