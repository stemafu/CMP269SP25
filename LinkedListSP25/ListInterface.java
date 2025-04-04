/**
 * 
 * @author Steven Fulakeza
 * 
 * 
 * List is a collection of elements. Values inside
 * a list a placed at an index or position.
 * 
 * Examples of lists include arrays or arraylist.
 *
 */
public interface ListInterface<I extends Comparable<I>> {
	
	/**
	 * The following method returns the total number of
	 * elements that have been inserted or added to the list.
	 * @return
	 */
	public int size();
	
	/**
	 * The following method return true if the list is empty.
	 * Otherwise, it returns false.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * The following method is used to add the specified 
	 * number to the list.
	 * 
	 * If array (list) where we want to add is full, resize.
	 * @param num
	 * 
	 * What happens when the element is null?
	 * throws IllegalArgumentException
	 */
	public void add(I element) throws IllegalArgumentException;
	
	/**
	 * The following method is used to get an element from the list
	 * at the specified location(index).
	 * 
	 * How do we deal with invalid indexes?.
	 * throws a IndexOutOfBoundsException
	 * 
	 */
	public I get(int index) throws IndexOutOfBoundsException;
	
	/**
	 * The following method is used to remove and return the last item in 
	 * the list.
	 * 
	 * What if the list is empty? We will address this later.
	 */
	//public I remove();

	/**
	 * The following method is used to remove and return an element at the 
	 * specified index in the list.
	 * 
	 * What if the list is empty? We will address this later.
	 * throws an IndexOutOfBoundsException
	 */
	public I remove(int index) throws IndexOutOfBoundsException;
	
	/**
	 * The following method return true if the given element is
	 * in the list. Otherwise, false.
	 * 
	 * What happens when the list is empty.
	 * @param num
	 * @return
	 * What if the element parameter is null.
	 * throws IllegalArgumentException
	 */
	public boolean contains(I element) throws IllegalArgumentException;
	
	/**
	 * This method clear the list. It removes everything
	 */
	public void clear();
	
	/**
	 * The following method replaces at element at the specified
	 * index with the given number.
	 * 
	 * What happens when the index is not valid? Later.
	 * @param num
	 * @param index
	 * @return
	 * What if the index is not valid?
	 * throws IndexOutOfBoundsException
	 * 
	 * What of the element is null?
	 * throws IllegalArgumentException
	 */
	public I replace(I element, int index) 
			throws IndexOutOfBoundsException, IllegalArgumentException;
	
	
	
	
	
	
}
