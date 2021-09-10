import java.util.Scanner;

public class StackDemo2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//StackInterface<Book> myStack = new ArrayBasedStack<Book>(2);
		UnboundedStackInterface<Book> myStack = new NodeBasedStack<Book>();
		
		//StackInterface<Magazine> myStack2 = new ArrayBasedStack<Magazine>(2);	
		//StackInterface<CD> myStack3 = new ArrayBasedStack<CD>(2);
		int option;
		
		do {
			System.out.println("Press 1 to push something onto the top of the stack");
			System.out.println("Press 2 to pop the top of the stack");
			System.out.println("Press 3 to peek at the top of the stack");
			System.out.println("Press 4 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("What is the name of the book?");
				String newName = keyboard.nextLine();
				
				System.out.println("Who is the author?");
				String newAuthor = keyboard.nextLine();
				
				Book currentBook = new Book(newName,newAuthor);
				
				//try {
					//myStack.push(currentBook);
				//}
				//catch(StackFullException e) {
					//System.out.println(e.getMessage());
				//}
			}
			else if(option == 2) {
				try {
					myStack.pop();
				}
				catch(StackEmptyException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(option == 3) {
				System.out.println(myStack.peek());
			}
			else if(option == 4) {
				System.out.println("Thank you for using our program!");
			}
			else {
				System.out.println("Error, Invalid option! Try again!");
			}
		}while(option != 4);
	}

}
