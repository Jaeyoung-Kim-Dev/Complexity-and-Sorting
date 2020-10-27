package controllers;

import java.util.*;
import shapes.Polygon;

/**
 * Insersion Sort Controller
 * 
 * @author Jaeyoung Kim
 *
 */
public class InsertionSortController extends Controller {	
	public void sort(Comparable[] items, Comparator comparator) {
		for (int i = 0; i < items.length; i++) {
			Polygon current = (Polygon) items[i];
			int j = i - 1;
			if (comparator != null) {
				while (j >= 0 && comparator.compare(items[j], current) >= 0) {
					items[j + 1] = items[j];
					j--;
				}
			} else {
				while (j >= 0 && (items[j]).compareTo(current) >= 0) {
					items[j + 1] = items[j];
					j--;
				}
			}
			items[j + 1] = current;
		}
	}
}
