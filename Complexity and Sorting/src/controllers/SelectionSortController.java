package controllers;

import java.util.*;

public class SelectionSortController extends Controller {  
    public void sort(Comparable[] items, Comparator comparator) { 
    	for (int i=0; i < items.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < items.length; j++) {
				boolean isComparator = comparator != null && comparator.compare(items[j], items[minIndex]) < 0;
				boolean isComparable = comparator == null && (items[j]).compareTo(items[minIndex]) < 0;
				if (isComparator || isComparable) {
					minIndex = j;
				}
			}
			Comparable tmp = items[minIndex];
			items[minIndex] = items[i];
			items[i] = tmp;
		} 
    } 
}