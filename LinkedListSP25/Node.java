
public class Node <I>{
	private I data;
	private Node<I> next;
	
	public Node(I data) {
		this.data = data;
		this.next = null;
	}
	
	
	public void setData(I data) {
		this.data = data;
	}
	
	public I getData() {
		return this.data;
	}
	
	public void setNext(Node<I> next) {
		this.next = next;
	}
	
	public Node<I> getNext(){
		return this.next;
	}

}
