package multipleElements;

import java.util.Arrays;
//Import scanner util
import java.util.Scanner;

public class multiples {

	public static void main(String[] args) {

		// Welcome message to the program
		System.out.println("Welcome to the multi-line multiples program.");

		// Ask user for the first input
		System.out.println("\n\nPlease enter a positive integer number?");
		// Declare scanner and save the input integer
		Scanner userInputNumber = new Scanner(System.in);
		int userNumber = userInputNumber.nextInt();

		// Set the array size for 4 number
		int[][] numbers = new int[3][4];

		// Store the 4 values entered in the correct positions of the array
		for (int columns = 0; columns < 4; columns++) {
			numbers[0][columns] = userNumber;
			// Do not ask a 5th value - only 4 times
			if ((columns + 1) < 4) {
				System.out.println("Please enter a positive integer number?");
				userNumber = userInputNumber.nextInt();
			}
		}
		;
		// Close the scanner function
		userInputNumber.close();

		// Create a for loop for each row to fill in the array
		for (int rows = 1; rows < 3; rows++) {
			// Create a for loop inside the for loop to add the multiple from each column
			// that is found in the first row.
			for (int columns = 0; columns < 4; columns++) {
				numbers[rows][columns] = (numbers[(rows - 1)][columns] + numbers[0][columns]);
			}
		}
		;

		// Create a for loop to print out all the values
		for (int rows = 0; rows < 3; rows++) {
			// Print the value for each row
			System.out.println(
					numbers[rows][0] + "  " + numbers[rows][1] + "  " + numbers[rows][2] + "  " + numbers[rows][3]);
		}
		// Other way to display array
		System.out.println("Can also be displayed as: \n" + Arrays.deepToString(numbers));
	}
}