
public class NodeDemo {
	public static void main(String [] args) {
		Node<String> firstNode = new Node<String>("Dune");
		Node<String> secondNode = new Node<String>("1984");
		
		firstNode.setLink(secondNode);
		
		Node<String> thirdNode = new Node<String>("Brave New World");
		
		secondNode.setLink(thirdNode);
		
		//use a while loop to loop through the nodes starting at first node
		//and print out the data stored in each node to the screen
		//do not create an int variable to do this task
		Node<String> currentNode = firstNode;
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getLink();
		}
	}

}
