
public class EnumExample implements EnumExampleInterface {
	

	
	public void runProgram(EnumExampleInterface.Algorithm name) {
		if(name == EnumExampleInterface.Algorithm.bubble) {
			
		}else if(name == EnumExampleInterface.Algorithm.insertion) {
			System.out.println("insertion is working");
		}else if(name == EnumExampleInterface.Algorithm.selection) {
			
		}
	}
	public static void main(String[] args) {
		
		EnumExample e = new EnumExample();
		e.runProgram(Algorithm.insertion);

	}

}
