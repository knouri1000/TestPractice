import java.util.Scanner;

/**
 * This program counts how many instances of a certain character can be found in
 * an inputed string
 * 
 * 8/8/16
 * 
 * @author Kevin
 */
public class Practice2 {
	public static void main(String[] args) {
		// Create an instance of the scanner
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a word
		System.out.println("Enter the word");
		String x = scanner.nextLine();

		// Prompt the user to enter a character to search for
		System.out.println("Enter a character");
		String y = scanner.nextLine();
		char c = y.charAt(0);

		// close the scanner
		scanner.close();

		// Print the final count value from the total function below
		System.out.println(total(x, c));

	}

	/**
	 * This method counts the number instances of a character y in a string x
	 * 
	 * @param x User inputed string
	 * @param y User inputed character to search for
	 * @return # of times y appears in x
	 */
	public static int total(String x, char y) {
		// Create a variable to keep track of the count
		int count = 0;

		// Create a for loop starting at 0 and ending at the strings length
		for (int i = 0; i < x.length(); i++) {

			// Check if the character at each position is equal to y
			if (x.charAt(i) == y) {

				// if so, increment the count by 1
				count++;
			}
		}

		// Return the total count value
		return count;
	}
}
