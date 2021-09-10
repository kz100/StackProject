
public class NodeBasedStack<T> implements UnboundedStackInterface<T> {
	//instance variables
	private Node<T> top; //composition
	
	//default constructor
	public NodeBasedStack() {
		top = null;
	}
	@Override
	public void pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(top != null) {
			top = top.getLink();
		}
		else {
			throw new StackEmptyException("Pop attempted on an empty stack!");
		}
	}
	
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		String item;
		if(top != null) {
			item = top.getData().toString();
		}
		else {
			item = "The Stack is empty";
		}
		return null;
	}
	
	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		Node<T> currentNode = new Node<T>(item);
		if(top == null) {
			top = currentNode;
		}
		else {
			currentNode.setLink(top);
			top = currentNode;
		}
	}

}
