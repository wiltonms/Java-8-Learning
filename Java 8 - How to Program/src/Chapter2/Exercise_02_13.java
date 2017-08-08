// Java 8 - How to program 10th Ed.
// Exercise 2.13 from Java 8 How to program
// Checking output of printf 

// Declaring package
package Chapter2;

// Creating class
public class Exercise_02_13
	{
		// Creating main method to check printf function
		public static void main(String[] args)
		{
			// Uncomment to validate the results.
		/*	int x = 7 + 3 * 6 / 2 - 1;
			System.out.print(x);
		*/
			
			// Uncomment to validate the results.
		/*	int x = 2 % 2 + 2 * 2 - 2 / 2;
			System.out.print(x);
		*/			
			
			// Uncomment to validate the results.
			int x = (3 * 9 * (3 + (9 * 3 / (3))));
			System.out.print(x);
			
		} // End of main method
	} // End of class


/*  TASK 2.13 State the order of evaluation of the operators in each of the following Java statements, and show the value of x after each statement is performed:

a) x = 7 + 3 * 6 / 2 - 1;
	x = 7 + 18 /2 - 1;
	x = 7 + 9 -1;
	x = 16 - 1;
	x = 15
	
	
b) x = 2 % 2 + 2 * 2 - 2 / 2;
	x = 0 + 4 - 1;
	x = 4 - 1;
	x = 3;


c) x = (3 * 9 * (3 + (9 * 3 / (3))));
	x = (3 * 9 * (3 + ( 27 / 3)));
	x = (3 * 9 * (3 + 9));
	x = (3 * 9 * 12);
	x = (27 * 12);
	x = 324
	
*/