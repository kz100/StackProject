
public class Node<T> {
	//instance variables
	private T data; //T is a type parameter which is placeholder for a type argument
	private Node<T> link; //reference to a Node object which allows it to connectto other objects of the Node class
	
	//constructor
	public Node(T newData) {
		data = newData;
		link = null;
	}
	
	//non-static methods
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data;
	}
	
	public void setLink(Node<T> otherNode) {
		this.link = otherNode; //connects the two object together
	}
	
	public Node<T> getLink() {
		return link;
	}

}
