import java.util.Scanner;

public class DivisionMath {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = scan. nextInt();
		
		System.out.println("Enter another number");
		int num2 = scan. nextInt();
		
		int ans;
		try {
			ans = num1/num2;
			System.out.println("Answer is " + ans);
		}catch(Exception e) {
			System.out.println("An error occurred during division");
			return;
		}
		//
		System.out.println("yeaaa");

	}

}
