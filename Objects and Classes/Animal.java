
public class Animal {
	
	private String name;
	private int age;
	
	/**
	 * The following is an example of a no-argument 
	 * constructor. This is also called a default
	 * constructor.
	 */
	public Animal() {
		this.name = "no name";
		this.age = 0;
	}
	
	
	/**
	 * Method overloading allows us to define multiple 
	 * methods with the same name but different parameters.
	 * 
	 * Similarly, we do have constructor overloading.
	 * This allows us to define multiple constructors
	 * with same as the class but different parameters.
	 */
	
	
	public Animal(int age) {
		//this.age = age;
		this();
		setAge(age);
		setName("no name");
		
	}
	
	
	public Animal(String name, int age) {
		this.setAge(age);
		this.setName(name);
		
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
	public void setName(String name) {
		if(name == null || name.trim().length() == 0) {
			System.out.println("You did not provide any name");
		}else {
			this.name = name;
		}
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("Age cannot negative");
		}else {
			this.age = age;
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
	
	public void sound() {
		System.out.println("Sound");
	}
	
	
	/*
	 * the following method will return true
	 * if the two animals being compared are the same.
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
		
		// instance of check
		if(! (obj instanceof Animal)) {
			return false;
		}
		
		
		Animal otherAnimal = (Animal)obj;
		
		if(this.age != otherAnimal.age) {
			return false;
		}else if(this.name == null && otherAnimal.name != null) {
			return false;
		}else if(!this.name.equalsIgnoreCase(otherAnimal.name)) {
			return false;
		}
		
		/* return ((this.age == otherAnimal.age)  && 
		(this.name == null && otherAnimal.name != null) &&
		(this.name.equalsIgnoreCase(otherAnimal.name)));
		*/ 
		
		return true;
	}

}
