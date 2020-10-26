package controllers;

import java.util.*;

import shapes.Polygon;

public class MySortController extends Controller {
	public void sort(Comparable[] items, Comparator comparator) {
		if (items == null || items.length == 0)
			return;
		
		int knuthNum = maxKnuthSeqNumber(items.length);
		while (knuthNum >= 1) {
			for (int i = 0; i < knuthNum; i++) {
				insertionSortWithGap(items, comparator, i, knuthNum);
			}
			knuthNum = (knuthNum-1)/3; //decrease the gap
		}
	}

	private void insertionSortWithGap(Comparable[] items, Comparator comparator, int startIndex, int gap) {
		int i = startIndex;
		while (i < items.length) {
			Polygon current = (Polygon) items[i];
			int j = i-gap;
			while (j >=0 && comparator.compare(items[j], current) >= 0) {
				items[j+gap] = items[j];
				j = j - gap;
			}
			items[j+gap] = current;
			i = i + gap;
		}
	}
	
	private int maxKnuthSeqNumber(int size) {
		int h = 1;
		while (h < size/3) {
			h = 3 * h + 1;
		}
		return h;
	}
}