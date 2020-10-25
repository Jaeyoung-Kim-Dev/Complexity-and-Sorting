package controllers;

import java.util.*;

import shapes.Polygon;

public class QuickSortController extends Controller {

	public void sort(Comparable[] items, Comparator comparator) {
		quicksort(items, 0, items.length - 1, comparator);
	}

	public void quicksort(Comparable[] items, int start, int end, Comparator comparator) {
		if (start < end) {
			int pivotIndex = partition(items, start, end, comparator);
			quicksort(items, start, pivotIndex - 1, comparator);
			quicksort(items, pivotIndex + 1, end, comparator);
		}
	}

	private int partition(Comparable[] items, int start, int end, Comparator comparator) {
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