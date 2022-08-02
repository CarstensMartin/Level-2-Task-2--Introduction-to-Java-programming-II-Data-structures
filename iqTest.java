package iq;

public class iqTest {

	public static void main(String[] args) {
		// Create and array that stores 5 IQ results
		int[] testResults = new int[5];
		// Set the 5 results
		testResults[0] = 50;
		testResults[1] = 140;
		testResults[2] = 117;
		testResults[3] = 92;
		testResults[4] = 135;

		// Declare the integer to add up all the IQ results
		int grandTotal = 0;
		// Add up all the IQ results by using a for loop to get each value
		for (int count = 0; count < testResults.length; count++) {
			grandTotal += testResults[count];
		};

		// Calculate the average - use a double variable if the total is not divisible
		// by 5
		double averageIQ = grandTotal / testResults.length;

		// Use if statements to determine which description fits the IQ score average
		// the best
		// Display the description that best suits the score with the score amount
		if (averageIQ >= 130) {
			System.out.println("The average IQ was very superior with a score of: " + averageIQ);
		} else if (averageIQ >= 120) {
			System.out.println("The average IQ was superior with a score of: " + averageIQ);
		} else if (averageIQ >= 110) {
			System.out.println("The average IQ was a high average with a score of: " + averageIQ);
		} else if (averageIQ >= 90) {
			System.out.println("The average IQ was average with a score of: " + averageIQ);
		} else if (averageIQ >= 80) {
			System.out.println("The average IQ was low average with a score of: " + averageIQ);
		} else if (averageIQ >= 70) {
			System.out.println("The average IQ was borderline with a score of: " + averageIQ);
		} else {
			System.out.println("The average IQ was extremely low with a score of: " + averageIQ);
		};
	}
}
