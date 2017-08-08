// Exercise 2.7 from Java 8 How to program
// This program will calculate the product of three integers.

package Chapter2;
//Importing Scanner class
import java.util.Scanner;

// for tracking matters this is called Exercise3 but it would make more sense to call the class as "Calc"
public class Exercise_02_07 
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
	} // End of main class

} // End of class



/*  Task:
a) State that a program will calculate the product of three integers.
b) Create a Scanner called input that reads values from the standard input.
c) Declare the variables x, y, z and result to be of type int.
d) Prompt the user to enter the first integer.
e) Read the first integer from the user and store it in the variable x.
f) Prompt the user to enter the second integer.
g) Read the second integer from the user and store it in the variable y.
h) Prompt the user to enter the third integer.
i) Read the third integer from the user and store it in the variable z.
j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result.
k) Use System.out.printf to display the message "Product is" followed by the value of the variable result.
*
2.6 Using the statements you wrote in Exercise 2.5, write a complete program that calculates and prints the product of three integers.
*/