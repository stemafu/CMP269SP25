
public class DogDriver {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Laptop");
		dog.setAge(9);
		
		System.out.println(dog.getName());
		

		dog.sound();
	}

}
