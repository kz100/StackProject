
public class ArrayBasedStack<T> extends Object implements StackInterface<T> {
	//instance variables
	private int top;
	private T [] stack;
	//private String [] stack; //reference to an array of Strings
	
	//default constructor
	public ArrayBasedStack() {
		//super();
		top = -1; //empty stack
		//stack = new String[10];
		stack = (T[])new Object[10];
	}
	
	//overloaded constructor
	public ArrayBasedStack(int size) {
		super();
		top = -1;
		if(size > 0) {
			stack = (T[])new Object[size];
		}
		else {
			stack = (T[])new Object[10];
		}
	}
	
	@Override
	public void push(T item) throws StackFullException {
		// TODO Auto-generated method stub
		if(top < stack.length - 1) {
			top++;
			stack[top] = item;
		}
		else {
			throw new StackFullException("Push was attempted on a full stack!");
	}
}
	
	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top > -1) {
			stack[top] = null;
			top--;
		}
		else {
			throw new StackEmptyException("Pop was attempted on an empty stack!");
		}
	}
	
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		String item;
		if(top > -1) {
			item = stack[top].toString();
		}
		else {
			item = "Stack is Empty!";
		}
		return item;
	}
}
