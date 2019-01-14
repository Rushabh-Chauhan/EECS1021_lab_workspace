import java.util.Scanner;

public class LogicalOperationApp3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer which is not in between 1 and 10");
		int i = input.nextInt();
		boolean isNotBetween1and10= i<1 || i>10;
		System.out.println("The nub u entered is"+i+ "is not in between 1 & 10:"+isNotBetween1and10);
		
		
		
		
		
		
		
		
		input.close();
	}

}
