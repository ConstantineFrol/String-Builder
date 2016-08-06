
package Practicing2ndYear;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 */
public class Week_1_Lab_1 {

	public static void main(String[] args) {
		
		// Scanner named userInput
		Scanner userInput = new Scanner(System.in);
		
		// Initialize variables
		int randomNumber = 0;
		int userNumber = 0;
		
		// Using method Math. every time u run this application var randomNumber == random number from 1 to 10
		randomNumber = (int)(Math.random() * 10 + 1);

		// Quick explanation to user what to do
		System.out.println("Try to guess the secret number\n");

		// Using do-while loop to run it once and depends on result execute or run it again
		do{
			// Ask user to input number from 1 to 10
			System.out.println("Plese input numbers from 1 to 10");	
			
			// Read user input from keyboard
			userNumber = userInput.nextInt();
			
			// Conditions, depends on user input in console will be displayed particular string
			if(userNumber > randomNumber)
			{
				System.out.println("Well it looks like your number is too big,try smaller number");
			}
			else if(userNumber < randomNumber)
			{
				System.out.println("Well it looks like your number is too small,try bigger number");
			}
			else
			{
				System.out.println("WoW You Won!!!, the secret number was: " + randomNumber);
			}
		
			// Conditions for loop
		}while(randomNumber!= userNumber);

		// Always close the scanner  
		userInput.close();

	}

}
