// Java 8 - How to program 10th Ed.
/*  Date: 08/08/2017 (dd-mm-yyyy)
 	2.25 (Odd or Even) Write an application that reads an integer and determines and prints whether it's odd or even. 
	[Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2 leaves a remainder of 0 when divided by 2.]
*/

// Declaring package
package Chapter2;

// Importing Scanner class
import java.util.Scanner;

//Creating exercise 2.25 class
public class Exercise_02_25
{
	// Creating main methoed to execute the Java program
	public static void main(String[] args)
	{
		//Creating a Scanner to obtain typed values from command window
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int number;
				
		// Prompting a integer to user
		System.out.print("Please type a number: ");
		number = input.nextInt();
		
		// Printing if it's and odd or even number.
		
		if ( number % 2 == 0)
			System.out.println("The number " + number + " is even."); // display the integer as even number
		if ( number % 2 != 0)
			System.out.println("The number " + number + " is odd."); // display the integer as odd number
		
		// Closing the Scanner input
		input.close();
		
	} // End of main method
} // End of class Exercise_02_25