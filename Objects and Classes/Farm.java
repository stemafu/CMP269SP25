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
	
	/** 
	 * The following method is used to add 
	 * a new animal to the farm.
	 */
	public void add(Animal animal1) {
		animals[numAnimals] = animal1;
		numAnimals++;
	}
	
	public void display() {
		for(int i = 0; i <numAnimals; i++) {
			System.out.println(animals[i].getName());
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
	
	

}
