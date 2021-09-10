
public class Book extends Object {
	//instance variables
	private String name;
	private String author;
	
	//constructor
	public Book(String newName, String newAuthor) {
		name = newName;
		author = newAuthor;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	
	public String getAuthor() {
		return author;
	}
	
	//override the toString method from the Object class
	public String toString() {
		return "Name: " + name + " Author: " + author;
	}

}
