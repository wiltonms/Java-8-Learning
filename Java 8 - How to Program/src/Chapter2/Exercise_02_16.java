// Java 8 - How to program 10th Ed.
/*  Date: 08/08/2017 (dd-mm-yyyy)
 *  Exercise 2.16 from Java 8 How to program 10th Ed.:
 *  (Comparing Integers) Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number followed by the words "is larger".
 * 	If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
 */

// Declaring package
package Chapter2;

// Importing Scanner class
import java.util.Scanner;

// Creating exercise 2.16 class
public class Exercise_02_16
{
	// Creating main method to begin execution of the Java program
	public static void main(String[] args)
	{
		// Creating Scanner input
		Scanner input = new Scanner(System.in);
		
		// Creating variables to hold numbers for evaluation
		int num1;  // Hold first integer typed by user
		int num2;  // Hold second integer typed by user
				
		// Prompt user for integers
		System.out.println("Please type to numbers to compare them.");
		System.out.print("Fist integer: ");
		num1 = input.nextInt();
		
		System.out.print("Second integer: ");
		num2 = input.nextInt();
		
		if (num1 > num2)
			System.out.printf("Number => %d is larger.\n", num1);
		if (num2 > num1)
			System.out.printf("Number => %d is larger.\n", num2);
		if (num1 == num2)
			System.out.printf("Numbers => %d and %d are equal.\n", num1, num2);
		
		// Closing input.
		input.close();
		
	} // End of main method
} // End of class Exercise_02_16