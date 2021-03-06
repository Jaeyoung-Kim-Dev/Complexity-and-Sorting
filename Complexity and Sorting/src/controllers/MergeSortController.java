package controllers;

import java.util.*;

/**
 * Merge Sort Controller
 * 
 * @author Jaeyoung Kim
 *
 */
public class MergeSortController extends Controller {  
    public void sort(Comparable[] items, Comparator comparator) { 
    	mergeSort(items, comparator, 0, items.length-1);
    }
    
	private void mergeSort(Comparable[] items, Comparator comparator, int start, int end) {
		if (start < end) {
			int mid = (int) Math.floor((start+end)/2);
			mergeSort(items, comparator, start, mid);
			mergeSort(items, comparator, mid+1, end);
			merge(items, comparator, start, mid, end);
		}
	}
	
	private void merge(Comparable[] items, Comparator comparator, int start, int mid, int end) {
		int sizeOfLeft = mid-start+1;
		int sizeOfRight = end - mid;
		Comparable[] left = new Comparable[sizeOfLeft];
		Comparable[] right = new Comparable[sizeOfRight];
		for (int i = 0; i < sizeOfLeft; i++) {
			left[i] = items[start + i];
		}
		for (int j = 0; j < sizeOfRight; j++) {
			right[j] = items[mid + 1 + j];
		}
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			boolean isComparator = comparator != null && ((j >= sizeOfRight) || (i < sizeOfLeft && comparator.compare(left[i], right[j]) <= 0));
			boolean isComparable = comparator == null && ((j >= sizeOfRight) || (i < sizeOfLeft && left[i].compareTo(right[j]) <= 0));
			if (isComparator || isComparable) {
				items[k] = left[i];
				i++;
			} else {
				items[k] = right[j];
				j++;
			}
		}
	}
}
