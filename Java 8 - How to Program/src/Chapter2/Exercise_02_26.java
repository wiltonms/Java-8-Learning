// Java 8 - How to program 10th Ed.
/*  Date: 08/08/2017 (dd-mm-yyyy)
 	2.26 (Multiples) Write an application that reads two integers, determines whether the first is a multiple of the second and prints the result. [Hint: Use the remainder operator.] 
*/

// Declaring package
package Chapter2;

// Importing Scanner class
import java.util.Scanner;

//Creating exercise 2.26 class
public class Exercise_02_26
{
	// Creating main method to execute the Java program
	public static void main(String[] args)
	{
		//Creating a Scanner to obtain typed values from command window
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int number1, number2;

		System.out.println("This program determines whether the first is a multiple of the second and prints the result.");
		// Prompting a integer to user
		System.out.print("Please type the first number: ");
		number1 = input.nextInt();
		
		// Prompting a integer to user
		System.out.print("Please type the second number: ");
		number2 = input.nextInt();
		
		// Checking if first is a multiple of the second and printing the result
		
		if ( number1 % number2 == 0)
			System.out.println("The number " + number1 + " is a multiple of the number " + number2 + " and its product is: " + (number1 * number2)); // display their result
		
		if ( number1 % number2 != 0)
			System.out.println("The number " + number1 + " is NOT a multiple of the number " + number2); // display their result
		
		// Closing the Scanner input
		input.close();
		
	} // End of main method
} // End of class Exercise_02_25