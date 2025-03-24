
public class CountThread implements Runnable{

	private int count = 5;
	
	public synchronized void increament() {
		this.count++;
	}

	@Override
	public void run() {
		increament();
	}
	
	public static void main(String[] args) {
	
		for(int i = 0; i < 10000; i++) {
		CountThread runnable = new CountThread();
		
		Thread thread0 = new Thread(runnable);
		Thread thread1 = new Thread(runnable);
		
		thread0.start();
		thread1.start();
		
		try {
			thread0.join();
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(runnable.count != 7) {
			System.out.println(runnable.count);
		}
		
		}
		System.out.println("Done");
		

	}

}
