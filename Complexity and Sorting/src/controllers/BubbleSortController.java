package controllers;

import java.util.*;

import shapes.Polygon;

public class BubbleSortController extends Controller {
	public void sort(Comparable[] items, Comparator comparator) {

		for (int i = 0; i < items.length - 1; i++) {
			for (int j = 0; j < items.length - 1 - i; j++) {
				if (comparator != null && comparator.compare(items[j], items[j + 1]) == 1) {
					this.swap(items, i, j); // swap using comparator			
				} else if (((Polygon) items[j]).compareTo(((Polygon) items[j+1])) < 0) {
					this.swap(items, i, j); // swap using comparable
				}				
			}
		}
	}

	public void swap(Comparable[] items, int i, int j) {
		Polygon tmp = (Polygon) items[j + 1];
		items[j + 1] = items[j];
		items[j] = tmp;
	}
}