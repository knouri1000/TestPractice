import java.util.Scanner;

/**
 * This program checks if an inputed number is prime or composite
 * 
 * 8/8/16
 * 
 * @author Kevin
 */
public class Practice5 {
	public static void main(String[] args) {
		// Create an instance of the scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.println("Please enter a number:");
		int x = scanner.nextInt();

		// close the scanner
		scanner.close();

		// Check if the number is prime
		if (isPrime(x)) {
			System.out.println(x + " is prime");
		} else {
			System.out.println(x + " is not prime");
		}

	}

	/**
	 * This function checks if the inputed number is prime
	 * 
	 * @param x inputed value
	 * @return true if prime / false if not
	 */
	public static boolean isPrime(int x) {
		// Check if x is less than two
		if (x < 2) {
			return false;
		}
		// Check if x is equal to two
		if (x == 2) {
			return true;
		}
		// Check if x is even
		if (x % 2 == 0) {
			return false;
		}
		// Create a for loop starting at 3 and ending at the sqrt of x checking
		// only odd numbers
		for (int i = 3; i * i <= x; i += 2) {

			// Check if x is divisible by the current i value
			if (x % i == 0) {
				// if so, it is not prime
				return false;
			}
		}
		// All possibilities have been checked at this point so x is only
		// divisible by 1 and itself
		return true;

	}
}