
public class Cat extends Animal {
	
	private int numLegs;
	
	public int getNumLegs() {
		return this.numLegs;
	}
	
	public void setNumLegs(int numLegs) {
		if(numLegs < 0) {
			this.numLegs = 0;
		}{
			this.numLegs = numLegs;
		}
	}

	
	public void sound() {
		System.out.println("Meow!!!!!!");
	}
	/**
	 * The following method return true if two
	 * cats being compared are the same. Otherwise, it returns false.
	 */
	public boolean equals(Object obj) {
		// address check
		if(this == obj) {
			return true;
		}
		
		// null check
		if(obj == null) {
			return false;
		}
		
		// Instance of check
		if(!(obj instanceof Cat)) {
			return false;
		}
		
		Cat otherCat = (Cat)obj;
		if(!super.equals(obj)) {
			return false;
		}else if(this.numLegs != otherCat.numLegs) {
			return false;
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
