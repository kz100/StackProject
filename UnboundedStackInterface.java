
public interface UnboundedStackInterface<T> extends StackInterface<T> {
	
	//places an item on top of the stack
	//override the push method from the StackInterface
	public void push(T item);

}
