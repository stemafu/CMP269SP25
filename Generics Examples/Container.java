
public class Container <I>  implements ContainerInterface<I>{
	
	private I data;
	
	@Override
	public void setData(I data) {
		this.data = data;
	}

	@Override
	public I getData() {
		return this.data;
	}
	
	public void display() {
		System.out.println(this.getData());
	}

	public static void main(String[] args) {
		
		Container <Integer> box = new Container<Integer>();
		box.setData(78);
		box.display();
		
		
		Container <String> box1 = new Container<String>();
		box1.setData("78");
		box1.display();		
		/**/
	}



}
