import java.util.Scanner;

/**
 * This program solves a quadratic equation using user inputed values
 * 
 * 8/8/16
 * 
 * @author Kevin
 */
public class Practice3 {
	public static void main(String[] args) {
		// Create an instance of the scanner
		Scanner scanner1 = new Scanner(System.in);

		// Prompt the user for the first coefficient
		System.out.println("Enter a");
		double a = scanner1.nextDouble();

		// Prompt the user for the second coefficient
		System.out.println("Enter b");
		double b = scanner1.nextDouble();

		// Prompt the user for the third coefficient
		System.out.println("Enter c");
		double c = scanner1.nextDouble();
		scanner1.close();

		// Create an array of doubles to return the possible solutions. Position
		// zero and one contain the positive and negative solutions if they
		// exist
		double[] solutions = quadraticSolver(a, b, c);

		// Check to see if there is only one solution
		if (solutions[0] == solutions[1]) {
			// print the solution
			System.out.println("Solution:" + solutions[0]);
		} else {
			// otherwise, print both unique solutions
			System.out.println("Solutions:" + solutions[0] + ", " + solutions[1]);
		}
	}

	/**
	 * This function returns the solutions to a quadratic equation using the
	 * inputed values
	 * 
	 * @param a 1st coefficient
	 * @param b 2nd coefficient
	 * @param c 3rd coefficient
	 * @return The solutions to the quadratic equation
	 */
	public static double[] quadraticSolver(double a, double b, double c) {
		// This method utilizes the equation:
		// -b +/- sqrt(b^2 - 4ac)
		// x = ----------------------
		// 2a
		//
		// Create a double to store the value under the square root
		double underSquareRoot = Math.pow(b, 2) - (4 * a * c);

		// Check if the value is negative
		if (underSquareRoot < 0) {
			// If so, throw an exception
			throw new IllegalArgumentException("b^2 - 4ac is negative");
		}

		// Use the stored value to solve the quadratic equation
		double x1 = (-b + Math.sqrt(underSquareRoot)) / (2 * a);
		double x2 = (-b - Math.sqrt(underSquareRoot)) / (2 * a);

		// return the x values in an array of doubles
		return new double[] { x1, x2 };
	}
}