// Filename: Adicao.java
// Program that takes two values and sums them.

package Chapter1;

import java.util.Scanner; // Program will use the Scanner method.

public class Adicao 
{
	// main method starts the execution of the program.
	public static void main(String[] args)
	{
		// Creating a Scanner to capture the values from user
		Scanner input = new Scanner(System.in);
		
		// Declaring variables
		int number1;
		int	number2;
		int sum;
		
		// Requesting numbers to sum them
		System.out.print("Please enter the first number: ");
		number1 = input.nextInt(); //Capturing first Variable to do the calculation

		System.out.print("Please enter the second number: ");
		number2 = input.nextInt(); //Capturing first Variable to do the calculation

		sum = number1 + number2; // Calculation 
		System.out.printf("The sum is %d%n", sum); //Displaying the results 
		
		// Closing input Scanner method
		input.close();
	}
}
