
public class LinkedList <I extends Comparable<I>> 
implements ListInterface<I> {
	
	/*
	 * count keeps track of the amount of the 
	 * elements currently being stored in the 
	 * linked list.
	 */
	private int count = 0;
	
	/*
	 * head stores the address of the first node
	 * in the linked list. (If the linked list has no values
	 * head is going to contain null
	 */
	Node<I> head = null;
	
	/*
	 * tail contains the address of the last node in the 
	 * linked list. If the linked list is currently
	 * empty, then tail will have null as a value.
	 */
	Node<I> tail = null;
	
	public LinkedList() {
		this.count = 0;
		this.head = null;
		this.tail = null;
	}

	@Override
	public int size() {
		return this.count;
	}

	@Override
	public boolean isEmpty() {
		return (this.count == 0);
	}

	@Override
	public void add(I element) throws IllegalArgumentException {
		
		if(element == null){
			throw new IllegalArgumentException("element cannot be null");
		}
		
		/*
		 * create a node for the given element
		 */
		Node<I> node = new Node<I>(element);
		
		/* We need to link this newly created node to the 
		 * linked list.
		 */
		
		if(this.isEmpty()) {
			/*
			 * If the linked list is currently empty,
			 * then the just newly created node becomes
			 * the head and the tail
			 */
			this.head = node;
			this.tail = node;
			this.count++;
		}else {
			this.tail.setNext(node);
			/*
			 * Update the tail to be the just newly created node
			 */
			this.tail = node;
			this.count++;
		}
	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(I element) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public I replace(I element, int index) throws IndexOutOfBoundsException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

}
