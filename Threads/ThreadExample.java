
/**
 * In this example, we will see how to use the Thread class
 * to create Threads in Java.
 * 
 * Remember that this is not the recommended way of doing threads.
 * The recommended way is to implement the Runnable interface.
 * 
 * To use Thread class, we have to extend the Thread class.
 * We also need to override the run method
 */
public class ThreadExample extends Thread {

	public void run() {
		System.out.println("Run!");
	}
	public static void main(String[] args) {
		
		ThreadExample thread = new ThreadExample();
		thread.start();

	}

}
