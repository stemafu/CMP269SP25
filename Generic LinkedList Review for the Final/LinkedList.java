
public class LinkedList <E extends Comparable<E>> {

	private int count;
	private Node<E> head;
	private Node<E> tail;
	
	public LinkedList() {
		this.count = 0;
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}
	
	public int size() {
		return count;
	}
	
	public void add(E element) {
		if(element == null) {
			throw new IllegalArgumentException("The element cannot be null");
		}
		
		Node<E> node = new Node<E>(element);
		
		if(this.isEmpty()) {
			this.head = node;
			this.tail = node;
			this.count++;
		}else {
			this.tail.setNext(node);
			this.tail = node;
			this.count++;	
		}
		
	}
	
	public void clear() {
		this.tail = null;
		this.head = null;
		this.count = 0;
	}
	
	public E remove(int index) {
		if(index < 0 || index >= this.count) {
			throw new ArrayIndexOutOfBoundsException("invalid index");
		}
		E removedElement;
		if(index == 0) {
			removedElement = this.head.getData();
			if(this.count == 1) {
				this.clear();
			}else {
				this.head = this.head.getNext();
				this.count--;
			}
			return removedElement;
		}else {
			Node<E> currentNode = this.head;
			Node<E> previousNode = null;
			int currentNodeIndex = 0;
			
			while(currentNodeIndex != index) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				currentNodeIndex++;
			}
			
			
			previousNode.setNext(currentNode.getNext());
			
			
			if(index == (count - 1)) {
				this.tail = previousNode;
				this.tail.setNext(null);
			}else {
				currentNode.setNext(null);
			}
			removedElement = currentNode.getData();
			count--;
			
			return removedElement;
			
		}
		
		
		
	}
	
	public void print() {
		Node<E> currentNode = this.head;
		System.out.println();
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
	
	
	public LinkedList<E> copy() {
		
		LinkedList<E> myListCopy = new LinkedList<E>();
		
		//myListCopy.count = this.count;
		//myListCopy.head = new Node<E>(this.head.getData());
		
		Node<E> currentNode = this.head;
		
		while(currentNode != null) {
			
			myListCopy.add(currentNode.getData());
			currentNode = currentNode.getNext();
		}
		
		

		return myListCopy;
	}
	
	
	public static void main(String [] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(70);
		list.add(100);
		list.add(130);
		list.add(160);
		list.add(190);
		System.out.println(list.remove(2));
		
		
		
		LinkedList<Integer> c = list.copy();
		list.add(200);
		list.add(300);
		list.print();
		c.print();
		//System.out.println(.count);
		
		
	}
	
	

}
