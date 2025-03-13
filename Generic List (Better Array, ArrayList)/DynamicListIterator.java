import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicListIterator implements Iterator {

	DynamicArray vector1;
	
	private int iteratorIndex;
	
	DynamicListIterator(DynamicArray vector1){
		this.vector1 = vector1;
		this.iteratorIndex = 0;
		//for(int i = 0; i<vector1.size(); i++) {
		//	vector1.add((I)elements[i]);
		//}
	}
	
	
	@Override
	public boolean hasNext() {
		
		return iteratorIndex < this.vector1.size();
	}

	@Override
	public Object next() {
		if(this.iteratorIndex == this.vector1.size()) {
			throw new NoSuchElementException("No items in the list");
		}
		Object next = vector1.get(iteratorIndex);
		this.iteratorIndex++;
		
		return next;
	}
	
	public static void main(String [] args) {
		DynamicArray<Integer> list;
		list = new DynamicArray<Integer>();

		list.add(90);
		list.add(100);
		list.add(85);
		
		Iterator iterate = new DynamicListIterator(list);
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
	
	

}
