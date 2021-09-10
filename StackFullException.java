
public class StackFullException extends Exception {
	//instance variables
	//none
	
	//default constructor
	public StackFullException() {
		super();  //calls the default constructor of the parent class (Exception)
	}
	
	//overloaded constructor
	public StackFullException(String message) {
		super(message); //calls the overloaded constructor of the parent class (Exception)
	}
	
	//non-static methods
	//none
}
