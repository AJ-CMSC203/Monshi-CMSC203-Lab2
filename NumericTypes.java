
import java.util.Scanner;

public class NumericTypes {

	public static void main(String[] args) {
		//TASK #2 Create a Scanner object here 
				Scanner user = new Scanner(System.in);
		//identifier declarations
				final int NUMBER = 2; // number of scores
				System.out.println("Input test score 1.");
				int score1 = user.nextInt(); // first test score
				
				System.out.println("Input test score 2");
				int score2 = user.nextInt(); // second test score
				
				System.out.println("Input a tempurature in Fahrenheit");
				int BOILING_IN_F = user.nextInt(); // boiling temperature
				double fToC; // temperature in Celsius
				double average; // arithmetic average
				String output; // line of output to print out
				//Task #2 declare a variable to hold the user’s temperature
				//Task #2 prompt user to input score1
				//Task #2 read score1 
				//Task #2 prompt user to input score2
				//Task #2 read score2 
				
				// Find an arithmetic average
				average = score1 + score2 / NUMBER;
				output = score1 + " and " + score2 + " have an average of " + average;	
				System.out.println(output);
				
				// Convert Fahrenheit temperatures to Celsius
				fToC = 5/9 * (BOILING_IN_F - 32);
				output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
				
				System.out.println(output);
				//Task #2 prompt user to input another temperature
				//Task #2 read the user’s temperature in Fahrenheit
				//Task #2 convert the user’s temperature to Celsius
				//Task #2 print the user’s temperature in Celsius
				
				System.out.println("Goodbye"); // to show that the program is ended

	}

}
