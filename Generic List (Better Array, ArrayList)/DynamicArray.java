import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class DynamicArray<I extends Comparable<I>> implements ListInterface<I>, Iterator {
	/*
	 * We need an array that will be used to store the numbers.
	 * We will also need a variable that will keep track of the
	 * total number of elements inside our array above.
	 * 
	 */
	private Object [] elements;
	private int numElements;
	private final int default_array_size = 10;
	
	private int iteratorIndex;

	/*
	 * We need constructors.
	 * A constructor is special method that has the same name as
	 * the class but has not return type.
	 * A constructor is used to create a new object and provide it
	 * with default values as defined in the constructor.
	 */
	public DynamicArray() {
		this.elements = new Object[default_array_size];
		this.numElements = 0;
	}

	public DynamicArray(int initial_array_size) {
		this.elements = new Object[initial_array_size];
		this.numElements = 0;
	}	

	
	public Iterator<I> iterator(){
		//Vector vector = new Vector();
		iteratorIndex = 0;
		DynamicArray <I>vector1 = new DynamicArray<I>();
		
		for(int i = 0; i<this.numElements; i++) {
			vector1.add((I)elements[i]);
		}
		
		return vector1;
	}

	@Override
	public int size() {
		return this.numElements;
	}

	@Override
	public boolean isEmpty() {

		/*if(this.numElements == 0) {
			return true;
		}

		return false;*/

		return (this.numElements == 0);
	}
	//throws IllegalArgumentException
	@Override
	public void add(I element) throws IllegalArgumentException {
		
		if(element == null) {
			throw new IllegalArgumentException("You provided a bad parameter");
		}
		
		if(this.isFull() ) {
			// resize.
			this.resize();
		}
		this.elements[this.numElements] = element;
		this.numElements++;

	}

	@Override
	public I get(int index) throws IndexOutOfBoundsException {
		
		if(this.isInvalidIndex(index)) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		
		// Assumes the index is always valid
		return (I)this.elements[index];
	}

	/*
	@Override
	public I remove() {
		if(this.isEmpty()) {
			return null; 
		}

		I removedElement = (I)this.elements[this.numElements -1];
		this.numElements--;

		return removedElement;
	}*/

	@Override
	public I remove(int index) throws IndexOutOfBoundsException {
		
		if(this.isInvalidIndex(index)) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		
		
		if(this.isEmpty()) {
			return null; //
		}else if(this.numElements -1 == index) {
			//re//turn this.remove();
			return null;
		}else {
			I removedElement = (I)this.elements[index];

			for(int i = index; i < (this.numElements - 1); i++) {
				this.elements[i] = this.elements[i + 1];
			}
			this.numElements--;

			return removedElement;
		}
	}

	@Override
	public boolean contains(I element) throws IllegalArgumentException {
		
		if(element == null) {
			throw new IllegalArgumentException("Invalid parameter");
		}
		
		if(this.isEmpty()) {
			return false;
		}else {
			for(int i = 0; i < this.numElements; i++) {
				
				//System.out.println( ); 
				if(((I)this.elements[i]).compareTo(element) == 0) { // We need to fix this
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public void clear() {
		this.numElements = 0;
		this.elements = new Object[this.elements.length];
	}

	public I replace(I element, int index) throws IndexOutOfBoundsException, IllegalArgumentException{
		
		if(this.isInvalidIndex(index)) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		
		if(element == null) {
			throw new IllegalArgumentException("Invalid parameter");
		}
		
		if(this.isEmpty() || this.isInvalidIndex(index)) {
			return null; // we will address later
		}else {
			I replaceElement = (I)this.elements[index];
			this.elements[index] = element;
			
			return replaceElement;
		}
	}



// Helper methods
private boolean isFull() {
	
	return (this.numElements == this.elements.length);
}

private boolean isFull(int index) throws Exception {
	if(index >0 ) {
		throw new Exception("test");
	}
	return (this.numElements == this.elements.length);
}

public void resize() {
	Object [] numsCopy = new Object[this.elements.length * 2];

	for(int i = 0; i <this.numElements; i++) {
		numsCopy[i] = elements[i];
	}
	this.elements = numsCopy;

}

public boolean isInvalidIndex(int index) {
	return (index < 0 || index >= this.numElements );
}

public static void main(String [] args) {
	DynamicArray myList = new DynamicArray();

	int startingNum = 50;

	for(int i = 0; i < 20_000; i++) {
		myList.add(i);
		//startingNum = startingNum  + 10;
	}
	System.out.println("Done");
	myList.replace(10000, 0);
	for(int i = 0; i < 20; i++) {
		System.out.println(myList.get(i));
	}
	
	System.out.println(myList.contains(1000000));
	System.out.println(myList.contains(1000));
	
	ArrayList <Integer> list = new ArrayList<Integer>();
	
	
	ArrayList <Double> listas = new ArrayList<Double>();
	
	//ArrayList <char> listchars = new ArrayList<char>();
	
	
	
	
	
}

@Override
public boolean hasNext() {

	
	return iteratorIndex < this.numElements;
}

@Override
public Object next() {
	if(this.iteratorIndex == this.numElements) {
		throw new NoSuchElementException("No items in the list");
	}
	
	Object next = elements[this.iteratorIndex];
	this.iteratorIndex++;
	
	return next;
}
/**/
public void remove() {
	
}








}
