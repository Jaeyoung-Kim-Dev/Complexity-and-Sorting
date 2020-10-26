package controllers;

import java.util.*;

import shapes.Polygon;

public class QuickSortController extends Controller {

	public void sort(Comparable[] items, Comparator comparator) {
		quicksort(items, comparator, 0, items.length - 1);
	}

	public void quicksort(Comparable[] items, Comparator comparator, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(items, comparator, start, end);
			quicksort(items, comparator, start, pivotIndex - 1);
			quicksort(items, comparator, pivotIndex + 1, end);
		}
	}

	private int partition(Comparable[] items, Comparator comparator, int start, int end) {
		Polygon pivot = (Polygon) items[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (comparator.compare((Polygon) items[j], pivot) < 0) {
				Polygon tmp = (Polygon) items[i];
				items[i] = items[j];
				items[j] = tmp;
				i++;
			}
		}
		items[end] = items[i];
		items[i] = pivot;
		return i;
	}
}