/*
  Write statements to accomplish each of the following tasks:
	a) Declare variables c, thisIsAVariable, q76354 and number to be of type int.
	b) Prompt the user to enter an integer.
	c) Input an integer and assign the result to int variable value. Assume Scanner variable
	input can be used to read a value from the keyboard.
	d) Print "This is a Java program" on one line in the command window. Use method
	System.out.println.
	e) Print "This is a Java program" on two lines in the command window. The first line
	should end with Java. Use method System.out.printf and two %s format specifiers.
	f) If the variable number is not equal to 7, display "The variable number is not equal to 7". 
  
 */

package Chapter1;
import java.util.Scanner;

public class chapter3se01 
{

	public static void main(String[] args) 
	{
		// Scanner class to capture input
		Scanner input = new Scanner(System.in);
		
		// Declaring variables
		int c;
		int thisIsAVariable;
		int q76354;
		int number;
		
		// Prompt user for a number
		System.out.println("Please type a number");
		number = input.nextInt();
		
		//Displaying java message
		System.out.println("This is a Java program");
		// Using printf
		System.out.printf("%s%n%s%n", "This is a Java", "Program");

		// Using conditions
		if (number != 7) 
		{
			System.out.println("The variable number is not equal to 7");
		}
		
		if (number == 7)
		{
			System.out.println("The variable number is 7");	
		}
		input.close();
	}

}