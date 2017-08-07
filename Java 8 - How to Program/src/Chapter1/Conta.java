// File Account.java
// Creating class to get names of users

package Chapter1;
public class Conta 
{
	private String nome; // Instance variable
	
	// Method to set name to the object
	public void setName(String nome)
	{
		this.nome = nome; // Store the name in the object
	}
	
	// Method to retrieve the name from the object
	public String getName()
	{
		return nome; // Return value of name to the caller
	} 
} // End of class
