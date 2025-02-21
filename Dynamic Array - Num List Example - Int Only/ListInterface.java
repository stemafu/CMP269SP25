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
public interface ListInterface {
	
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
	 */
	public void add(int num);
	
	/**
	 * The following method is used to get a number from the list
	 * at the specified location(index).
	 * 
	 * How do we deal with invalid indexes? We will address this later.
	 */
	public int get(int index);
	
	/**
	 * The following method is used to remove and return the last item in 
	 * the list.
	 * 
	 * What if the list is empty? We will address this later.
	 */
	public int remove();

	/**
	 * The following method is used to remove and return an element at the 
	 * specified index in the list.
	 * 
	 * What if the list is empty? We will address this later.
	 */
	public int remove(int index);
	
	/**
	 * The following method return true if the given number is
	 * in the list. Otherwise, false.
	 * 
	 * What happens when the list is empty.
	 * @param num
	 * @return
	 */
	public boolean contains(int num);
	
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
	 */
	public int replace(int num, int index);
	
	
	
	
	
	
}
