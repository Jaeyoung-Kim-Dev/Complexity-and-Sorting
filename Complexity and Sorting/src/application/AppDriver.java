package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import comparators.*;
import controllers.*;
import shapes.*;
import utilities.*;

/**
 * This is the application driver for the CPRG311 assignment 2.
 * 
 * @author Jaeyoung Kim
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

			System.out.println(arg);

			char option = arg.charAt(1);
			String value = arg.substring(2);

			System.out.println("Option: " + option + ", value: " + value);

			switch (option) {
			case 'f': // load a file
			case 'F':
				filename = value;
				break;
			case 't': // compare type
			case 'T':
				switch (value) {
				case "h": // height
				case "H":
					// Polygon polygon1 = new Polygon();
					// Polygon polygon2 = new Polygon();
					// comparator = polygon1.compareTo(polygon2);
					break;
				case "v": // volume
				case "V":
					comparator = new VolumeComparator();
					break;
				case "a": // base area
				case "A":
					comparator = new BaseAreaComparator();
					break;
				}
				break;
			case 's': // sort type
			case 'S':
				sortAlgorithm = value.charAt(0);
				switch (sortAlgorithm) {
				case 'b': // bubble
				case 'B':
					controller = new BubbleSortController();
					// bubbleSort(items, comparator);
					break;
				case 's': // selection
				case 'S':
					// selectionSort(items, comparator);
					break;
				case 'i': // insertion
				case 'I':
					// selectionSort(items, comparator);
					break;
				case 'm': // merge
				case 'M':
					// selectionSort(items, comparator);
					break;
				case 'q': // quick
				case 'Q':
					// selectionSort(items, comparator);
					break;
				case 'z': // my sort
				case 'Z':
					// selectionSort(items, comparator);
					break;
				}

				break;
			}
		}

		if (filename != null) {
			try {
				File file = new File(filename);
				Scanner sc = new Scanner(file);
				int arraySize = sc.nextInt();
				int index = 0;

				Comparable[] comparables = new Comparable[arraySize];

				// Polygon poly = (Polygon) comparables[0];
				// poly.getHeight();

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

				// MyArrays.sort(comparables, controller, comparator);
				
				for (int i = 0; i < comparables.length; i++) {
					if (i == 0)
						System.out.println("The first value: " + ((Polygon) comparables[i]).getHeight());
					else if (i == comparables.length - 1)
						System.out.println("The last value: " + ((Polygon) comparables[i]).getHeight());
					else if (i % 1000 == 0)
						System.out.println("The " + i + "th value: " + ((Polygon) comparables[i]).getHeight());
				}
				System.out.println("done");
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

		}

	}

}
