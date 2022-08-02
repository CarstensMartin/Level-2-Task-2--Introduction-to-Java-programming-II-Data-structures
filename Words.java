package longWords;

//import the functions that are needed
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// Scanner function to get user input
		Scanner wordInputUser = new Scanner(System.in);
		// Display message to user and request input of a word
		System.out.println("Please enter a word - To finish entering words, enter 0");
		String wordInput = wordInputUser.nextLine();

		// Declare array list for all the word and all the words longer than 4 letters
		ArrayList<String> words = new ArrayList<>();
		ArrayList<String> longerWords = new ArrayList<>();

		// Declare integer for the total number of letters entered
		int wordsLettersTotal = (int) 0;
		int longWordsLetterTotal = (int) 0;

		// Declare string word to quit the while loop
		String quitWord = "0";

		// Use a while loop to continue adding words to the array until the user uses
		// the quit word
		while (!(wordInput.equals(quitWord))) {
			// Add the amount of letters in the word to the wordLettersTotal- to use for
			// average calculation
			wordsLettersTotal += wordInput.length();
			// Add the word entered to the array
			words.add(wordInput);

			// If the word is more than 4 letters long
			if (wordInput.length() > 4) {
				// Add the length of the word to lonWordLetterTotal- to use for average
				// calculation
				longWordsLetterTotal += wordInput.length();
				// Add the word to the array if more than 4 letters long
				longerWords.add(wordInput);
			}

			// Ask user for input of a new word or if they want to finish adding words
			System.out.println("Please enter a word - To finish entering words, enter 0");
			// Get new input from user and start/stop while loop based on input
			wordInput = wordInputUser.nextLine();
		}
		// Close the scanner function
		wordInputUser.close();

		// Calculate the average of all the word lengths and all the words longer than 4
		// letters
		int averageLegth = wordsLettersTotal / words.size();
		int averageLengthLongWord = longWordsLetterTotal / longerWords.size();

		// Display to user results of all the long words longer than 4 letters
		System.out.println("There was " + longerWords.size() + " words entered that has more than 4 letters.");
		System.out.println("The average length of all the words longer than 4 letters was " + averageLengthLongWord);
		System.out.println("All the words entered that is longer than 4: " + Arrays.asList(longerWords));

		// Display to user results of all the words entered
		System.out.println("\nThere was " + words.size() + " words entered in total.");
		System.out.println("The average length of all the words entered are " + averageLegth);
		System.out.println("All the words entered: " + Arrays.asList(words));
	}
}
