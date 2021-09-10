
public class StackEmptyException extends Exception {
	//instance variables
	//none
	
	//default constructor
	public StackEmptyException() {
		super();  //calls the default constructor of the parent class (Exception)
	}
	
	//overloaded constructor 
	public StackEmptyException(String message) {
		super(message); //calls the overloaded constructor of the parent class (Exception)
	}
	
	//non-static methods
	//none
}
