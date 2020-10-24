package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import problemdomain.*;

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

		for (String arg : args) {
			if (!arg.startsWith("-") || arg.length() < 3)
				continue;

			System.out.println(arg);

			char option = arg.charAt(1);
			String value = arg.substring(2);

			System.out.println("Option: " + option + ", value: " + value);

			switch (option) {
			case 'f': // load a file
				filename = value;
				break;
			case 't': // compare type
				switch (value) {
				case "h": // height
					break;
				case "v": // volume
					break;
				case "a": // base area
					break;
				}
				break;
			case 's': // sort type
				switch (value) {
				case "b": // bubble
					break;
				case "s": // selection
					break;
				case "i": // insertion
					break;
				case "m": // merge
					break;
				case "q": // quick
					break;
				case "z": // my sort
					break;
				}
				break;
			}
		}

		if (filename != null) {
			try {
			      File file = new File("filename.txt");
			      Scanner sc = new Scanner(file);
			      while (sc.hasNext()) {
			        String data = sc.nextLine();
			        System.out.println(data);
			      }
			      sc.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
		}

	}

}
