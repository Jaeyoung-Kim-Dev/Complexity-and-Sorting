package utilities;

import java.util.*;

import comparators.*;
import controllers.*;
import shapes.Polygon;

public class MyArrays {
	public static void sort(Comparable[] items, Controller controller, Comparator comparator) {
		long start, stop, timeTaken;
		double sorted = 0;

		start = System.currentTimeMillis();

		controller.sort(items, comparator);
		
		stop = System.currentTimeMillis();

		timeTaken = stop - start;

		for (int i = 0; i < items.length; i++) {
			if (comparator instanceof BaseAreaComparator) {
				sorted = ((Polygon) items[i]).getBaseArea();
			} else if (comparator instanceof VolumeComparator) {
				sorted = ((Polygon) items[i]).getVolume();
			} else {
				sorted = ((Polygon) items[i]).getHeight();
			}

			if (i == 0)
				System.out.println("The first value: " + sorted);
			else if (i == items.length - 1)
				System.out.println("The last value: " + sorted);
			else if (i % 1000 == 999) {
				System.out.println("The " + (i + 1) + "th value: " + sorted);				
			}			
		}
		System.out.println("This is the time for sorting: " + timeTaken + "ms");
	}
}
