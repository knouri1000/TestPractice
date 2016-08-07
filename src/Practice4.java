import java.util.Scanner;

/**
 * This programs calculates the slope and y intercept of a line given two
 * inputed points 8/8/16
 * 
 * @author Kevin
 */
public class Practice4 {
	public static void main(String[] args) {
		// Create an instance of the scanner
		Scanner scanner = new Scanner(System.in);
		// Prompt the user for the coordinates of the points
		System.out.print("Enter x1: ");
		double x1 = scanner.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = scanner.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = scanner.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = scanner.nextDouble();

		// close the scanner
		scanner.close();

		// Print the slope and intercept using the function below
		System.out.println(slopeAndIntercept(x1, y1, x2, y2));
	}

	/**
	 * This program calculates the slope and the y intercept of a line using the
	 * coordinates of two inputed points
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	private static SlopeInterceptValues slopeAndIntercept(double x1, double y1, double x2, double y2) {
		// calculate the slope
		double slope = (y2 - y1) / (x2 - x1);

		// calculate the y intercept
		double intercept = y1 - slope * x1;

		// return the values
		return new SlopeInterceptValues(slope, intercept);
	}

	/**
	 * This class creates a data transfer object to hold the slope and intercept
	 * 8/8/16
	 * 
	 * @author Kevin
	 */
	private static class SlopeInterceptValues {
		double slope, intercept;

		public SlopeInterceptValues(double slope, double intercept) {
			super();
			this.slope = slope;
			this.intercept = intercept;
		}

		@Override
		public String toString() {
			return "SlopeInterceptValues [slope=" + slope + ", intercept=" + intercept + "]";
		}

		@SuppressWarnings("unused")
		public double getSlope() {
			return slope;
		}

		@SuppressWarnings("unused")
		public double getIntercept() {
			return intercept;
		}

	}
}
