// Java 8 - How to program 10th Ed.
// Exercise 2.15 from Java 8 How to program
// Writing a calculator application 

// Declaring package
package Chapter2;

// Importing Scanner class
import java.util.Scanner;

// Declaring public class
public class Exercise_02_15
{
	//Declaring main method
	public static void main(String[] args)
	{
		// Creating a Scanner class to obtain typed values from command window
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables to hold numbers
		
		int firstInt; 	// To take first typed number
		int secondInt;	// To take second typed number
		int sum, product, difference, quotient;		// To hold the calculation results
		
		//Prompt user to type the numbers 
		System.out.println("Please type two integer to get their sum, product, difference and quotient.");
		System.out.print("Fisrt number: ");
		firstInt = input.nextInt(); 
		
		System.out.print("Second number: ");
		secondInt = input.nextInt();
		
		// Doing the math
		sum = firstInt + secondInt;
		product = firstInt * secondInt;
		difference = firstInt - secondInt;
		quotient = firstInt / secondInt;
		
		// Displaying results
		System.out.println("---------------------------------------"); // Line Separator
		System.out.printf("The sum of the typed numbers is: %d%n", sum); 				// Display Sum
		System.out.printf("The product of the typed numbers is: %d%n", product);		// Display product
		System.out.printf("The difference of the typed numbers is: %d%n", difference); 	// Display difference
		System.out.printf("The quotient of the typed numbers is: %d%n", quotient);		// Display quotient
		
		// Closing Scanner class
		input.close();
		
	} // End of main method
} // End of class Exercise_02_15


/*  TASK 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product, difference and quotient (division). 
	Use the techniques shown in Fig. 2.7.
	
	Output: 
	Please type two integer to get their sum, product, difference and quotient.
		Fisrt number: 10
		Second number: 2
		---------------------------------------
		The sum of the typed numbers is: 12
		The product of the typed numbers is: 20
		The difference of the typed numbers is: 8
		The quotient of the typed numbers is: 5
*/