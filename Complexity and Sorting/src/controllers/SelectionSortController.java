package controllers;

import java.util.*;

public class SelectionSortController extends Controller {  
    public void sort(Comparable[] items, Comparator comparator) { 
    	for (int i=0; i < items.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < items.length; j++) {
				if (comparator.compare(items[j], items[minIndex]) < 0) {
					minIndex = j;
				}
			}
			Comparable tmp = items[minIndex];
			items[minIndex] = items[i];
			items[i] = tmp;
		} 
    } 
}