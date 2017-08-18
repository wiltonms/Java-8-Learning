// Java 8 - How to program 10th Ed.
/*  Date: 08/08/2017 (dd-mm-yyyy)
 	2.24 (Largest and Smallest Integers) Write an application that reads five integers and determines and prints the largest and smallest integers in the group. 
 	Use only the programming techniques you learned in this chapter.
*/

// Declaring package
package Chapter2;

// Importing Scanner class
import java.util.Scanner;

// Creating exercise 2.24 class
public class Exercise_02_24
{
	// Creating main methoed to execute the Java program
	public static void main(String[] args)
	{
		//Creating a Scanner to obtain typed values from command window
		Scanner input = new Scanner(System.in);
		
		// Declaring variables to get the numbers
		int num1, num2, num3, num4, num5; // Variables to hold values
		int smallest, largest; // Variables that will be use to display the results
		
		// Prompting five integers to user
		System.out.println("This is a program that takes five integers and prints the largest and smallest integers in the group.");
		System.out.print("Please type the first number: ");
		num1 = input.nextInt();
		
		System.out.print("Please type the second number: ");
		num2 = input.nextInt();
		
		System.out.print("Please type the third number: ");
		num3 = input.nextInt();
		
		System.out.print("Please type the forth number: ");
		num4 = input.nextInt();
		
		System.out.print("Please type the fifth number: ");
		num5 = input.nextInt();
		
		// Building the logic and displaying smallest and largest
		// Defining smallest
		smallest = num1;
		if (num2 < smallest)
			smallest = num2;
		if (num3 < smallest)
			smallest = num3;
		if (num4 < smallest)
			smallest = num4;
		if (num5 < smallest)
			smallest = num5;
		
		// Defining largest
		largest = num1;
		if (num2 > largest)
			largest = num2;
		if (num3 > largest)
			largest = num3;
		if (num4 > largest)
			largest = num4;
		if (num5 > largest)
			largest = num5;
		
		// Printing smallest and largest
		System.out.println("The smallest number in the group is: " + smallest + " and the largest number in the group is: " + largest);
		
		// Closing Scanner input
		input.close();
		
	} // End of main method
} // End of class Exercise_02_24