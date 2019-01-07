package lab0part1;

import java.util.Scanner;

public class ConvertSecoundsIntoMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	 key=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String n=key.nextLine();
		
		System.out.println("Enter an integer for seconds:");
		int t=key.nextInt();
		
		
		int m=t/60;
		int s= t-(m*60);
		
		System.out.print(n+", ");
		System.out.print("your input "+t+" secounds can be divided into "+m+ " minutes and "+s+" secounds.");
		
		key.close();

	}

}
