
public class StackDemo {
	public static void main(String[] args) {
		ArrayBasedStack<String> bookStack = new ArrayBasedStack<String>(5);
		
		try {
			bookStack.pop();
			bookStack.push("Dune");
			bookStack.push("1984");
			bookStack.push("Brave New World");
			bookStack.push("Animal Farm");
			bookStack.push("Childhood's End");
			bookStack.push("The Hobbitt");
			
		}
		catch(StackFullException e1) {
			System.out.println(e1.getMessage());
		}
		catch(StackEmptyException e2) {
			System.out.println(e2.getMessage());
		}
	}
}
