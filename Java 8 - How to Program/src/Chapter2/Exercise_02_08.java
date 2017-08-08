// Java 8 - How to program 10th Ed.
// Exercise 2.7 from Java 8 How to program
// This program will calculate the product of three integers.

// Declaring package
package Chapter2;

//Importing Scanner class
import java.util.Scanner;

// for tracking matters this is called Exercise3 but it would make more sense to call the class as "Calc"
public class Exercise_02_08 
{
	// Begin of main class
	public static void main(String[] args) 
	{
		// Creating Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		// Declaring variables to calculate
		int x, y, z, result;  // First, second, third number input from user and the result variables.
		
		// Prompting user for the first integer.
		System.out.print("Please type the first number: ");
		x = input.nextInt();
		
		// Prompting user for the second integer.
		System.out.print("Please type the second number: ");
		y = input.nextInt();
	
		// Prompting user for the third integer.
		System.out.print("Please type the third number: ");
		z = input.nextInt();
		
		// Calculate the product of numbers	
		result = x * y * z ;
		
		// Displaying results of calculation
		 System.out.printf("Product is: %d%n", result);
				
		input.close();
		
	} // End of main method
} // End of class

















/*  TASK 2.8 Write Java statements that accomplish each of the following tasks:

a) Display the message "Enter an integer: ", leaving the cursor on the same line.

b) Assign the product of variables b and c to variable a.

c) Use a comment to state that a program performs a sample payroll calculation.
*/