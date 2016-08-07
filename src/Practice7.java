import java.util.Scanner;

/**
 * This program checks to see if the bigger of two inputed number is divisible
 * by the other 8/8/16
 * 
 * @author Kevin
 */
public class Practice7 {
	public static void main(String[] args) {
		// Create an instance of the scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the numbers
		System.out.println("Please enter a");
		int a = scanner.nextInt();
		System.out.println("Please enter b");
		int b = scanner.nextInt();

		// Close the scanner
		scanner.close();

		// Check if the two numbers are the same
		if (a == b) {
			System.out.println("They're equal");
		}

		// Check if the greater is a multiple of the smaller
		else if (multiple(a, b)) {
			System.out.println("The larger is a multiple of the smaller");
		} else {
			System.out.println("The larger is not a multiple of the smaller");
		}
	}

	/**
	 * This function checks if the greater number is divisible by the smaller
	 * number
	 * 
	 * @param a first number
	 * @param b second number
	 * @return true if multiple / false if not
	 */
	public static boolean multiple(int a, int b) {
		// Create variables for the smaller and larger numbers
		int min = Math.min(a, b);
		int max = Math.max(a, b);

		// check if the greater is divisible by the smaller
		return (max % min == 0);

	}
}
