
public class Animal {
	
	private String name;
	private int age;
	
	/**
	 * The following is an example of a no-argument 
	 * constructor. This is also called a default
	 * constructor.
	 */
	public Animal() {
		name = "no name";
		age = 0;
	}
	
	
	/**
	 * Method overloading allows us to define multiple 
	 * methods with the same name but different parameters.
	 * 
	 * Similarly, we do have constructor overloading.
	 * This allows us to define multiple constructors
	 * with same as the class but different parameters.
	 */
	
	
	public Animal(int age1) {
		
		setAge(age1);
		setName("no name");
		
	}
	
	
	public Animal(String name1, int age1) {
		setAge(age1);
		setName(name1);
		
	}	
	
	/**
	 * The following method is used to set the name of an 
	 * animal.
	 * 
	 * A set method is usually called a setter or mutator.
	 * 
	 * Usually a set method is void but has the parameter
	 * that is used to set the variable related to this set.
	 * 
	 * @param args
	 */
	public void setName(String name1) {
		if(name1 == null || name1.trim().length() == 0) {
			System.out.println("You did not provide any name");
		}else {
			name = name1;
		}
	}
	
	public void setAge(int age1) {
		if(age1 < 0) {
			System.out.println("Age cannot negative");
		}else {
			age = age1;
		}
	}
	
	/**
	 * The getters are used to retrieve or view a value
	 * inside a variable.
	 * 
	 * Getters do return a value.
	 * 
	 * Usually getters take no parameters
	 * @param args
	 */
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

}
