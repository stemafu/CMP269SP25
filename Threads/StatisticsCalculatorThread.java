
public class StatisticsCalculatorThread {

	private int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	int max;
	int min;
	
	class MaxNum implements Runnable{

		@Override
		public void run() {
			
			max = nums[0];
			
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] > max) {
					max = nums[i];
				}
			}
			
		}
		
	}
	
	
	class MinNum implements Runnable{

		@Override
		public void run() {
			min = nums[0];
			
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] < min) {
					min = nums[i];
				}
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		StatisticsCalculatorThread stats = new StatisticsCalculatorThread();
		
		MaxNum max = stats.new MaxNum();
		MinNum min = stats.new MinNum();
		
		Thread thread1 = new Thread(max);
		Thread thread2 = new Thread(min);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();	
			thread2.join();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(stats.max);
		System.out.println(stats.min);

	}

}
