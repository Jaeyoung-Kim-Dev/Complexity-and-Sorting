package controllers;

import java.util.*;

import shapes.Polygon;

public class BubbleSortController extends Controller {
	public void sort(Comparable[] items, Comparator comparator) {

		for (int i = 0; i < items.length - 1; i++) {
			for (int j = 0; j < items.length - 1 - i; j++) {
				// do the swap if required
				if (comparator.compare(items[j], items[j + 1]) == 1) {
					Polygon tmp = (Polygon) items[j + 1];
					items[j + 1] = items[j];
					items[j] = tmp;
				}
			}
		}
	}
}