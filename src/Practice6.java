import java.util.Scanner;

/**
 * This program checks if an inputed year is a leap year 8/8/16
 * 
 * @author Kevin
 */
public class Practice6 {
	public static void main(String[] args) {
		// Create an instance of the scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a year
		System.out.println("Please enter the year:");
		int x = scanner.nextInt();

		// close the scanner
		scanner.close();

		// Check if it is a leap year using the function below
		if (isLeapYear(x)) {
			System.out.println(x + " is a leap year");
		} else {
			System.out.println(x + " is not a leap year");
		}
	}

	/**
	 * This function uses the inputed year to test if it is a leap year
	 * 
	 * @param x the year
	 * @return true if leaf year / false if not
	 */
	public static boolean isLeapYear(int x) {
		// Check if the remainder of x is 0 when divided by 4
		if (x % 4 == 0) {
			// if so, it is a leap year
			return true;
		} else {
			// otherwise, it is not a leap year
			return false;
		}

	}
}
