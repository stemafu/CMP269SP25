
public class SumThread implements Runnable {

	int [] nums = {3, 5, 6, 9, 8, 3, 10, 7, 20, 30};

	int sum = 0;

	@Override
	public void run() {



		if(Thread.currentThread().getName().equals("Sum 1")) {
			//System.out.println(Thread.currentThread().getName());
			for(int i = 0; i < nums.length/2; i++) {
				sum = sum + nums[i];
			}
		}else {
			for(int i = nums.length/2; i < nums.length; i++) {
				sum = sum + nums[i];
			}
		}

	}

	public void display() {
		System.out.println(sum);
	}

	public static void main(String [] args) {
		for(int i =0; i <1000; i++) {

			SumThread sum1 = new SumThread();
			//SumThread sum2 = new SumThread();

			Thread thread1 = new Thread(sum1, "Sum 1");
			Thread thread2 = new Thread(sum1, "Sum 2");

			thread1.start();
			thread2.start();

			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(sum1.sum != 101) {
				sum1.display();
			}
		}
		System.out.println("here");
		
	}

}
