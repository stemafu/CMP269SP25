
public class PersonDriver {

	public boolean testGetAge() {
		
		Person p1;
		String testName = "Drink Water";
		int testAge = 20;
		
		try {
			p1 = new Person(testName, testAge);
		}catch(Exception e) {
			System.out.println("Constructor not defined");
			return false;
		}
		
		
		try {
			
			if(p1.getAge() != testAge) {
				System.out.println("getAge or your constructor is not working properly");
				return false;
			}
			
		}catch(Exception e) {
			System.out.println("getAge is not defined");
			return false;
		}
		
		
		System.out.println("Successful");
		return true;
	}
	public static void main(String[] args) {
		

	}

}
