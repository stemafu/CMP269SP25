/*
 * 1. To use the Runnable interface for implements threads
 *
 */
public class HelloWorldThread implements Runnable {

	public static void main(String[] args) {
		
		HelloWorldThread runnable1 = new HelloWorldThread();
		
		Thread thread = new Thread(runnable1);
		//Allocates a new Thread object.
		
		thread.start();
		
		for(int i = 0; i <10; i++) {
			System.out.println("String " + i);
		}

	}

	@Override
	public void run() {
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Number " + i);
		}
		
	}

}
