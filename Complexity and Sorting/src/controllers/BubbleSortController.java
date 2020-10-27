package controllers;

import java.util.*;
import shapes.Polygon;

/**
 * Bubble Sort Controller
 * 
 * @author Jaeyoung Kim
 *
 */
public class BubbleSortController extends Controller {
	public void sort(Comparable[] items, Comparator comparator) {

		for (int i = 0; i < items.length - 1; i++) {
			for (int j = 0; j < items.length - 1 - i; j++) {
				Polygon current = (Polygon) items[j];
				Polygon next = (Polygon) items[j+1];
				boolean isComparator = comparator != null && comparator.compare(current, next) == 1;
				boolean isComparable = comparator == null && (current).compareTo(next) == 1;
				if (isComparator || isComparable) {
					Polygon tmp = next;
					items[j + 1] = current;
					items[j] = tmp;		
				}
			}
		}
	}
}