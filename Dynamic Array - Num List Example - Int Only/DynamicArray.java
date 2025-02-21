import java.util.ArrayList;

public class DynamicArray implements ListInterface {
	/*
	 * We need an array that will be used to store the numbers.
	 * We will also need a variable that will keep track of the
	 * total number of elements inside our array above.
	 * 
	 */
	private int [] elements;
	private int numElements;
	private final int default_array_size = 10;

	/*
	 * We need constructors.
	 * A constructor is special method that has the same name as
	 * the class but has not return type.
	 * A constructor is used to create a new object and provide it
	 * with default values as defined in the constructor.
	 */
	public DynamicArray() {
		this.elements = new int[default_array_size];
		this.numElements = 0;
	}

	public DynamicArray(int initial_array_size) {
		this.elements = new int[initial_array_size];
		this.numElements = 0;
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

	@Override
	public void add(int num) {
		if(this.isFull() ) {
			// resize.
			this.resize();
		}
		this.elements[this.numElements] = num;
		this.numElements++;

	}

	@Override
	public int get(int index) {
		// Assumes the index is always valid
		return this.elements[index];
	}

	@Override
	public int remove() {
		if(this.isEmpty()) {
			return -1; // what if -1 is also in the array.
		}

		int removedElement = this.elements[this.numElements -1];
		this.numElements--;

		return removedElement;
	}

	@Override
	public int remove(int index) {
		if(this.isEmpty() || this.isInvalidIndex(index)) {
			return -1; // we will address later
		}else if(this.numElements -1 == index) {
			return this.remove();
		}else {
			int removedElement = this.elements[index];

			for(int i = index; i < (this.numElements - 1); i++) {
				this.elements[i] = this.elements[i + 1];
			}
			this.numElements--;

			return removedElement;
		}
	}

	@Override
	public boolean contains(int num) {
		if(this.isEmpty()) {
			return false;
		}else {
			for(int i = 0; i < this.numElements; i++) {
				if(this.elements[i] == num) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public void clear() {
		this.numElements = 0;
		this.elements = new int[this.elements.length];
	}

	public int replace(int num, int index) {
		if(this.isEmpty() || this.isInvalidIndex(index)) {
			return -1; // we will address later
		}else {
			int replaceElement = this.elements[index];
			this.elements[index] = num;
			
			return replaceElement;
		}
	}



// Helper methods
private boolean isFull() {
	return (this.numElements == this.elements.length);
}

public void resize() {
	int [] numsCopy = new int [this.elements.length * 2];

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








}
