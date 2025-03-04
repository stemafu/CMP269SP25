
public class FarmDriver {

	public static void main(String[] args) {
		
		Farm myFarm = new Farm();
		
		//Animal myPet1 = new Animal("One" , 2);
		//Animal myPet2 = new Animal("Pet Two" , 3);
		
		//myFarm.add(myPet1);
		//myFarm.add(myPet2);
		
		Animal [] testAnimals = new Animal[200];
		
		for(int i = 0; i < testAnimals.length; i++ ) {
			
			testAnimals[i] = new Animal("Animal " + i, (i + 1));

			myFarm.add(testAnimals[i]);
		}
		
		System.out.println(myFarm.getNumAnimals());
		//for(int i = 0; i < testAnimals.length; i++ ) {
			myFarm.remove(7);
			myFarm.remove(10);
		//}
		System.out.println(myFarm.getNumAnimals());
		myFarm.display();

	}

} 
