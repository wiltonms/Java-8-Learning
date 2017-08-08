// Java 8 - How to program 10th Ed.
/*  Date: 08/08/2017 (dd-mm-yyyy)
 *  Exercise 2.17 from Java 8 How to program 10th Ed.:
 *  2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the user and displays the sum, average, product, smallest and largest of the numbers. 
 *	Use the techniques shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer representation of the average. 
 *	So, if the sum of the values is 7, the average should be 2, not 2.3333....]
 */

// Declaring package
package Chapter2;

// Importing Scanner class
import java.util.Scanner;

// Creating exercise 2.16 class
public class Exercise_02_17
{
	// Creating main method to begin execution of the Java program
	public static void main(String[] args)
	{
		// Creating Scanner input
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables to hold numbers
		
				int firstInt; 	// To take first typed number
				int secondInt;	// To take second typed number
				int thirdInt; 	// To take third typed number
				int sum, average, product, smallest, largest;		// To hold the calculation results
				
				//Prompt user to type the numbers 
				System.out.println("Please type three integer to get their sum, average, product, smallest and largest.");
				System.out.print("Fisrt number: ");
				firstInt = input.nextInt(); 
				
				System.out.print("Second number: ");
				secondInt = input.nextInt();
				
				System.out.print("Third number: ");
				thirdInt = input.nextInt();
				
				// Doing the math
				sum = firstInt + secondInt + thirdInt;
				average = sum / 3;
				product = firstInt * secondInt * thirdInt;
				
				// Displaying results
				System.out.println("---------------------------------------"); // Line Separator
				System.out.printf("The sum of the typed numbers is: %d%n", sum); 				// Display Sum
				System.out.printf("The average of the typed numbers is: %d%n", average);		// Display average
				System.out.printf("The product of the typed numbers is: %d%n", product); 	// Display product
				
				
				// Comparing numbers to check the smallest and largest
				 smallest = firstInt; // assume smallest is the first number
			        if (secondInt < smallest)
			            smallest = secondInt;
			        if (thirdInt < smallest)
			            smallest = thirdInt;
			         
			        largest = firstInt; // assume largest is the first number
			        if (secondInt > largest)
			            largest = secondInt;
			        if (thirdInt > largest)
			            largest = thirdInt;
				
				
				System.out.println("The smallest number of the set is: " + smallest + " and the largest number is: " + largest );
				
			/*	Also works but not the best way to do it.
			 * // Checking which number is the smallest.
				if (firstInt < secondInt && (firstInt < thirdInt))
					System.out.printf("The smallest number is: %d\n", firstInt);
				if (secondInt < firstInt && (secondInt < thirdInt))
					System.out.printf("The smallest number is: %d\n", secondInt);
				if (thirdInt < firstInt && (thirdInt < secondInt))
					System.out.printf("The smallest number is: %d\n", thirdInt);
				
				// Checking which number is the largest.
				if (firstInt > secondInt && (firstInt > thirdInt))
					System.out.printf("The largest number is: %d\n", firstInt);
				if (secondInt > firstInt && (secondInt > thirdInt))
					System.out.printf("The largest number is: %d\n", secondInt);
				if (thirdInt > firstInt && (thirdInt > secondInt))
					System.out.printf("The largest number is: %d\n", thirdInt);
			*/
				
		// Closing Scanner class.
		input.close();
		
	} // End of main method
} // End of class Exercise_02_17


/* Output: 
 * Please type three integer to get their sum, average, product, smallest and largest.
 *	Fisrt number: 233
 *	Second number: 423
 *	Third number: 111
 *	---------------------------------------
 *	The sum of the typed numbers is: 767
 *	The average of the typed numbers is: 255
 *	The product of the typed numbers is: 10940049
 *	The smallest number is: 111
 *	The largest number is: 423
*/