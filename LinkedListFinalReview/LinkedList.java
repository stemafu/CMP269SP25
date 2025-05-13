
public class LinkedList {

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	/*
	 * The following method returns true if our linked is empty.
	 */
	public boolean isEmpty() {
		return (this.size == 0);
	}

	/*
	 * The following method returns the counts of the elements in 
	 * the linked list. If the list is empty, it returns 0.
	 */
	public int size() {
		return this.size;
	}

	public void add(int element) {
		/* To add an element to the linked list, we need to place the 
		 * element into a Node. Then we can add this node to the linked list.
		 */

		Node newNode = new Node(element);

		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
			this.size++;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
			this.size++;			
		}
	}

	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int remove(int index) {
		if(index < 0 || index >= this.size) {
			throw new ArrayIndexOutOfBoundsException("Invalid index");
		}

		/*
		 * If the index is 0, we want to remove the element that is at the front
		 * of the list. If there more elements the head changes to the next one (we decrement size.)
		 *  but if this was the last item, we clear.
		 * 
		 * If the index is the the size - 1, the we want to remove the tail. We also have 
		 * have change the tail to the node that appears before the node that we are removing.
		 * and we decrement size.
		 * 
		 * If the index is not the first or the last, we need to update the the next of the 
		 * previous of the node that is being removed to the next of the node that is being
		 * removed.
		 */
		int removedElement;
		/*if(index == 0 && size == 1) {
			removedElement = this.head.getData();
			this.clear();
			return removedElement;
		}else if (index == 0) {
			removedElement = this.head.getData();

			this.head = this.head.getNext();
			this.size--;
			return removedElement;
		}*/

		/*
		if(index == 0 ) {
			removedElement = this.head.getData();

			if(size == 1) {
				this.clear();
			}else {
				this.head = this.head.getNext();
				this.size--;
			}

			return removedElement;
		}else if(index == (this.size - 1)) {

			Node currentNode = this.head;
			Node previousNode = null;
			int currentNodeIndex = 0;

			while(currentNodeIndex != index) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				currentNodeIndex++;
			}

			this.tail = previousNode;
			this.tail.setNext(null);

			removedElement = currentNode.getData();
			this.size--;
			return removedElement;

		}else {
			Node currentNode = this.head;
			Node previousNode = null;
			int currentNodeIndex = 0;

			while(currentNodeIndex != index) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				currentNodeIndex++;
			}

			previousNode.setNext(currentNode.getNext());

			removedElement = currentNode.getData();
			this.size--;
			return removedElement;
		}*/


		if(index == 0 ) {
			removedElement = this.head.getData();

			if(size == 1) {
				this.clear();
			}else {
				this.head = this.head.getNext();
				this.size--;
			}

			return removedElement;
		}else {

			Node currentNode = this.head;
			Node previousNode = null;
			int currentNodeIndex = 0;

			while(currentNodeIndex != index) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				currentNodeIndex++;
			}


			if(index == (this.size - 1)){
				this.tail = previousNode;
				this.tail.setNext(null);

				removedElement = currentNode.getData();
				this.size--;
				return removedElement;
			}else {
				previousNode.setNext(currentNode.getNext());
				removedElement = currentNode.getData();
				this.size--;
				return removedElement;
			}


		}

		/*}else {
			Node currentNode = this.head;
			Node previousNode = null;
			int currentNodeIndex = 0;

			while(currentNodeIndex != index) {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				currentNodeIndex++;
			}

			previousNode.setNext(currentNode.getNext());

			removedElement = currentNode.getData();
			this.size--;
			return removedElement;
		}*/


	}

}
