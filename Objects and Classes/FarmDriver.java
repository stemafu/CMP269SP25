
public class FarmDriver {

	public static void main(String[] args) {
		
		Farm myFarm = new Farm();
		
		Animal myPet1 = new Animal("One" , 2);
		Animal myPet2 = new Animal("Pet Two" , 3);
		
		myFarm.add(myPet1);
		myFarm.add(myPet2);
		
		myFarm.display();

	}

}
