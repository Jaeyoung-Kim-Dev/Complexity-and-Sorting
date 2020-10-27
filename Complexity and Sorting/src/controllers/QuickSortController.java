package controllers;

import java.util.*;
import shapes.Polygon;

/**
 * Quick Sort Controller
 * 
 * @author Jaeyoung Kim
 *
 */
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
			boolean isComparator = comparator != null && comparator.compare((Polygon) items[j], pivot) < 0;
			boolean isComparable = comparator == null && ((Polygon) items[j]).compareTo(pivot) < 0;
			if (isComparator || isComparable) {
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