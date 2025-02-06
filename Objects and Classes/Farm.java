/**
 * 
 * 
 * A farm is used to store animals.
 * 
 *
 * @author Steven Fulakeza.
 *
 */
public class Farm {
	
	private Animal [] animals;
	private final int inital_farm_capacity = 10;
	private int numAnimals;
	
	// We are missing something
	
	
	public Farm() {
		animals = new Animal[inital_farm_capacity];
		 numAnimals = 0;
	}
	
	
	public Farm(int capacity) {
		animals = new Animal[capacity];
		 numAnimals = 0;
	}
	
	
	public int getNumAnimals() {
		return this.numAnimals;
	}
	/** 
	 * The following method is used to add 
	 * a new animal to the farm.
	 */
	public void add(Animal animal1) {
		if(isFull()){
			// Store the old animals into a new array.
			
			//Animal [] animalsCopy = new Ani
			
			// resize;
			Animal [] animalsCopy = new Animal[animals.length * 2];
		
			for(int i = 0; i<numAnimals; i++) {
				animalsCopy[i] = animals[i];
			}
			
			animals = animalsCopy;
		
		}
		animals[numAnimals] = animal1;
		numAnimals++;
	}
	
	/*
	 * This method is used to remove an animal from the
	 * farm at the specified index.
	 * If the index is invalid, the method 
	 * returns a null.
	 * 
	 * if the index is valid, the method return the 
	 * animal at the specified index.
	 */
	public Animal remove(int index) {
		if(this.isEmpty() || (index < 0 || index >= numAnimals)) {
			return null;
		}else {
			Animal removedAnimal = animals[index];		
			
			// Shift values
			for(int i = index; i < numAnimals -1; i++) {
				animals[i] = animals[i + 1];
			}
			
			numAnimals--;
			
			return removedAnimal;
		}
	}
	
	/*
	 * This method is used to remove the last 
	 * animal to be added in the farm.
	 * If the farm has no animals, the method return a'
	 * null.
	 */
	public Animal remove() {
		if(isEmpty()) {
			return null;
		}else {
			
			Animal removedAnimal = animals[numAnimals -1];		
			numAnimals--;
			return removedAnimal;
		}
	}
		
	
	/*
	 * the keyword this.
	 * 
	 * 
	 */
	
	public void display() {
		for(int i = 0; i <numAnimals; i++) {
			System.out.println("Name: " + animals[i].getName());
		}
	}
	
	/**
	 * The following method returns the oldest animal
	 * in the farm.
	 */
	public Animal getOldestAnimal() {
		if(isEmpty()) {
			return null;
		}
		
		// Search for the oldest animal
		int indexOfOldestAnimal = 0;
		
		
		for(int i = 1; i <numAnimals; i++) {
			if(animals[i].getAge() > animals[indexOfOldestAnimal].getAge() ) {
				indexOfOldestAnimal = i;
			}
		}
		
		return animals[indexOfOldestAnimal];
		
	}
	
	/**
	 * This method returns true if there are no animals
	 * in the farm.
	 * @return
	 */
	
	public boolean isEmpty() {
		/*if(numAnimals == 0) {
			return true;
		}else {
			return false;
		}*/
		return numAnimals == 0;
	}
	
	private boolean isFull() {
		return numAnimals == animals.length;
	}
	
	

}
