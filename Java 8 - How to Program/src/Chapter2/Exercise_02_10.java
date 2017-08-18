// Java 8 - How to program 10th Ed.
// Exercise 2.10 from Java 8 How to program
// Checking output of printf 

// Declaring package
package Chapter2;

// Creating class
public class Exercise_02_10
	{
		// Creating main method to check printf function
		public static void main(String[] args)
		{
			// Declaring variables:
			int x = 2;
			int y = 3;
			
			//Displaying outputs
			System.out.printf("x = %d%n", x);
			System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
			System.out.printf("x =");
			System.out.printf("%d = %d%n", (x + y), (y + x));	
		
		} // End of main method
	} // End of class





/*  TASK 2.10 Assuming that x = 2 and y = 3, what does each of the following statements display?

a) System.out.printf("x = %d%n", x);
	x = 2
b) System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
	Value of 2 + 2 is 4
c) System.out.printf("x =");
	x =   (*No new line)
d) System.out.printf("%d = %d%n", (x + y), (y + x));
	5 = 5
*/