
public class StackDemo3 {
	public static void main(String[] args) {
		NodeBasedStack<String> myStack = new NodeBasedStack<String>();
		myStack.push("Dune");
		myStack.push("1984");
		myStack.push("Brave New World");
		
		System.out.println(myStack.peek());
		
		try {
		myStack.pop();
		}
		catch(StackEmptyException e) {
			System.out.println(e.getMessage());
		}
	}

}
