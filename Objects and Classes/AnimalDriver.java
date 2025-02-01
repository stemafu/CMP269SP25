
public class AnimalDriver {

	public static void main(String[] args) {
		// Creating objects
		Animal myPet1 = new Animal("One" , 2);
		
		Animal myPet2 = new Animal("Pet Two" , 3);
		
		
		Animal [] myPets = new Animal[10];
		myPets[0] = myPet1;
		myPets[1] = myPet2;
		
		//myPet1.setAge(10);
		
		System.out.println(myPets[1].getName());
		
		//System.out.println(myPet1.getAge());


	}

}
