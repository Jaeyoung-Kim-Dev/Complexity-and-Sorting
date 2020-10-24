import problemdomain.*;

/**
 * This is the application driver for the CPRG311 assignment 2.
 * @author Nick Hamnett
 *
 */
public class AppDriver {

	/**
	 * Entry point for program.
	 * @param args Arguments passed in command line.
	 */
	public static void main(String[] args) {
		for (String arg : args) {
			if (!arg.startsWith("-") || arg.length() < 3)
				continue;
			
			System.out.println(arg);
			
			char option = arg.charAt(1);
			String value = arg.substring(2);
			
			System.out.println("Option: " + option + ", value: " + value);
		}
	}

}
