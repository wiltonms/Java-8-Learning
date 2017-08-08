// Java 8 - How to program 10th Ed.
// Exercise 2.14 from Java 8 How to program
// Checking output of print funcions

// Declaring package
package Chapter2;

// Creating a public class
public class Exercise_02_14
{
	// Creating main method
	public static void main(String[] args)
	{
		// Displaying number on the screen
		
	// A)
		System.out.println("12 34");
	// B)
		System.out.print("1");
			System.out.print("2 ");
			System.out.print("3");
			System.out.print("4");
	// C)	
		System.out.printf("%d%d% d%d", 1,2,3,4);
	}
}



/*  TASK 2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of adjacent numbers separated by one space. Use the following techniques:

a) Use one System.out.println statement.

b) Use four System.out.print statements.

c) Use one System.out.printf statement.
*/