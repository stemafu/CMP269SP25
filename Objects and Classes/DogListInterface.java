
/*
 * 
 */



/**
 * 
 * @author Steven Fulakeza
 * 
 * This interface will be implemented by the DogList.java class.
 *
 */
public interface DogListInterface {
	
	
	
	
	
	/**
	 * The following method is used to add the given dog to the
	 * list of dogs.
	 * 
	 * If the parameter is null, the item is not added to the list.s
	 * @param dog
	 */
	public void add(Dog dog);
	
	/**
	 * The following method returns if two dogs being compared are
	 * the same. Otherwise, return false.
	 * @param obj
	 * @return
	 */
	public boolean equals(Object obj);
	
	/**
	 * This removes and return the last dog in the list of dogs.
	 * If the list is empty, return null.
	 * @return
	 */
	public Dog remove();
	
	/**
	 * This method is used get and return the dog at the specified
	 * index. If the index is not valid, return null.
	 * If the list is empty, return null.
	 * @param index
	 * @return
	 */
	public Dog get(int index);

}
