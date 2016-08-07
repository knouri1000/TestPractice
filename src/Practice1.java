import java.util.Scanner;

/**
 * This program sums all the integers from 0 to an inputed upper bound
 * 
 * 8/8/16
 * 
 * @author Kevin
 */
public class Practice1 {
	public static void main(String[] args) {
		// Create an instance of the scanner pointing towards the console
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the upper bound number
		System.out.println("Please enter a number:");
		int x = scanner.nextInt();

		// Print the result from the Sum function below
		System.out.println(sum(x));

		// Close the scanner
		scanner.close();
	}

	/**
	 * This method sums all the numbers from 0 to the user inputed number
	 * 
	 * @param x top bound of the sum
	 * @return the sum of the numbers from 0 to x
	 */
	private static int sum(int x) {

		// Create an integer to keep track of the sum starting at 0
		int total = 0;

		// Create a for loop starting at 0 and ending at x
		for (int i = 0; i <= x; i++) {

			// add each incremented i to the sum
			total = total + i;
		}

		// return the final sum value
		return total;
	}

}