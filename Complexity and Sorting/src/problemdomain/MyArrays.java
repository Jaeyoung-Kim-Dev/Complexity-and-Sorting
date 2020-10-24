package problemdomain;

import java.util.*;

public class MyArrays { 
    public static void sort(Comparable[] items, char sortAlgorithm, Comparator comparator) { 
        if (sortAlgorithm == 'B') { 
            bubbleSort(items, comparator);
        }
    }
	
	private static void bubbleSort(Comparable[] items, Comparator comparator) {
		// Write code for bubble sort here...
    }
} 