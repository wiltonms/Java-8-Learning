// Filename: ContaTest.java
// Manipulating Conta class

package Chapter1;
import java.util.Scanner;

public class ContaTest 
{

	public static void main(String[] args) 
	{
		// Creating a scanner object to get the input from the command window
		Scanner input = new Scanner(System.in);
		
		// Create an Account and assigning to minhaConta object
		Conta minhaConta = new Conta();
	
		// Displaying current value from nome (null)
		System.out.printf("Initial value from nome: %s%n%n", minhaConta.getName());
		
		// Prompt user name and assigning to the "nome" object.
		System.out.println("Please type your name:");
		String oNome = input.nextLine(); // Reading typed value
		minhaConta.setName(oNome); // setting name to the instance variable
		System.out.println();
		
		// Displaying the name stored in the variable
		System.out.printf("Name in the object is: %n%s%n", 
				minhaConta.getName());
		
		input.close();
		
	}

}
