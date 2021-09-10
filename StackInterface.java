
public interface StackInterface<T> {
	//T is a type parameter which is a placeholder for a data type
	//T will receive its value from a type argument
	//interfaces or classes that use type parameters are sometimes referred to as generics or parameterized over types or parameterized types
	
	//interface is a set of requirements for a class to implement
	//interface are not classes and they do not have instance variables, constructors, or methods
	
	//method headings for methods that must be implemented by a class
	//that choose to implement this interface
	
	//places the item at the top of the stack if there is room
	//otherwise throws StackFullException
	public void push(T item) throws StackFullException;
	
	//removes the item from the top of the stack if there is one
	//otherwise throws StackEmptyException
	public void pop() throws StackEmptyException;
	
	//returns the item at the top of the stack without changing the stack
	public String peek();
}
