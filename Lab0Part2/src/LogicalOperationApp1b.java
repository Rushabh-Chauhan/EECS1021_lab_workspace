import java.util.Scanner;

public class LogicalOperationApp1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the integer");
		Scanner input=new Scanner(System.in);
		
		int i=input.nextInt();
		boolean isLessThanOrEqualToZero= i<=0;
		System.out.println("the number you entered was +ve "+!isLessThanOrEqualToZero);
		
		
		
		
		
		input.close();
	}

}
