package controllers;

import java.util.*;

public class MySortController extends Controller {
	public void sort(Comparable[] items, Comparator comparator) {
		while (!isSorted(items, comparator)) {
			randomize(items);
		}
	}

	private static void randomize(Comparable[] items) {
		for (int i = 0; i < items.length; i++) {
			swapElements(items, i, (int) Math.floor(Math.random() * i + 1));
		}
	}

	private static void swapElements(Comparable[] items, int i, int j) {
		Comparable temp = items[i];
		items[i] = items[j];
		items[j] = temp;
	}

	private static <T> boolean isSorted(Comparable[] items, Comparator comparator) {
		for (int i = 0; i < items.length - 1; i++) {
			if (comparator.compare(items[i], items[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}

}