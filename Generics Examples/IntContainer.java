
public class IntContainer {
	private int data;
	
	
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void display() {
		System.out.println(this.getData());
	}



	public static void main(String [] args) {
		IntContainer box = new IntContainer();
		box.setData(90);
		box.display();
		
		IntContainer box2 = new IntContainer();
		box2.setData("String");
		box2.display();
		
	}
}
