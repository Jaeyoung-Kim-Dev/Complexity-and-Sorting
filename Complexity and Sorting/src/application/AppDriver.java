package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import comparators.*;
import controllers.*;
import shapes.*;
import utilities.*;

/**
 * This is the application driver for the Complexity and Sorting. There are six
 * sorting algorithms that bubble, insertion, selection, merge, quick and a sort
 * of my choice which is shell sorting. It sorts by three type of shape
 * (height, volume and base area) from the largest to smallest (descending
 * order).
 * 
 * @author Jaeyoung Kim
 * @version 1.0, October 26, 2020
 *
 */
public class AppDriver {

	/**
	 * Entry point for program.
	 * 
	 * @param args Arguments passed in command line.
	 */
	public static void main(String[] args) {
		String filename = null;
		char sortAlgorithm;
		Controller controller = null;
		Comparator comparator = null;

		for (String arg : args) {
			if (!arg.startsWith("-") || arg.length() < 3)
				continue;

			char option = arg.charAt(1);
			String value = arg.substring(2);
			String displayOption = "";

			switch (option) {
			case 'f': // file name to load
			case 'F':
				displayOption = "File name: " + value;
				filename = value;
				break;
			case 't': // compare type
			case 'T':
				switch (value) {
				case "h": // height
				case "H":
					comparator = null;
					displayOption = "Compare Type: Height";
					break;
				case "v": // volume
				case "V":
					comparator = new VolumeComparator();
					displayOption = "Compare Type: Volume";
					break;
				case "a": // base area
				case "A":
					comparator = new BaseAreaComparator();
					displayOption = "Compare Type: Base Area";
					break;
				}
				break;
			case 's': // sort type
			case 'S':
				sortAlgorithm = value.charAt(0);
				switch (sortAlgorithm) {
				case 'b': // bubble
				case 'B':
					displayOption = "Sort Type: Bubble Sort";
					controller = new BubbleSortController();
					break;
				case 's': // selection
				case 'S':
					displayOption = "Sort Type: Selection Sort";
					controller = new SelectionSortController();
					break;
				case 'i': // insertion
				case 'I':
					displayOption = "Sort Type: Insertion Sort";
					controller = new InsertionSortController();
					break;
				case 'm': // merge
				case 'M':
					displayOption = "Sort Type: Merge Sort";
					controller = new MergeSortController();
					break;
				case 'q': // quick
				case 'Q':
					displayOption = "Sort Type: Quick Sort";
					controller = new QuickSortController();
					break;
				case 'z': // my sort (Shell Sort)
				case 'Z':
					displayOption = "Sort Type: My (Shell) Sort";
					controller = new MySortController();
					break;
				}

				break;
			}
			System.out.println(displayOption + "\n");
		}

		if (filename != null && controller != null) {
			try {
				File file = new File(filename);
				Scanner sc = new Scanner(file);
				int arraySize = sc.nextInt();
				int index = 0;

				Comparable[] comparables = new Comparable[arraySize];

				while (sc.hasNext()) {
					switch (sc.next()) {
					case "Cylinder":
						Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
						comparables[index] = cylinder;
						index++;
						break;
					case "Cone":
						Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
						comparables[index] = cone;
						index++;
						break;
					case "Pyramid":
						Pyramid pyramid = new Pyramid(sc.nextDouble(), sc.nextDouble());
						comparables[index] = pyramid;
						index++;
						break;
					case "SquarePrism":
						SquarePrism squarePrism = new SquarePrism(sc.nextDouble(), sc.nextDouble());
						comparables[index] = squarePrism;
						index++;
						break;
					case "TriangularPrism":
						TriangularPrism triangularPrism = new TriangularPrism(sc.nextDouble(), sc.nextDouble());
						comparables[index] = triangularPrism;
						index++;
						break;
					case "PentagonalPrism":
						PentagonalPrism pentagonalPrism = new PentagonalPrism(sc.nextDouble(), sc.nextDouble());
						comparables[index] = pentagonalPrism;
						index++;
						break;
					case "OctagonalPrism":
						OctagonalPrism octagonalPrism = new OctagonalPrism(sc.nextDouble(), sc.nextDouble());
						comparables[index] = octagonalPrism;
						index++;
						break;
					}
				}
				sc.close();

				MyArrays.sort(comparables, controller, comparator);

			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

		}

	}

}
