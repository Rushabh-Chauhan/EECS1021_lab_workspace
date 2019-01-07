package lab0part1;

import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		
		System.out.println("Enter an integer for radius: ");
		int r=key.nextInt();
		key.nextLine();
		
		System.out.println("What is your name? ");
		String n=key.nextLine();
		
		double p= 2*3.14*r,a= 3.14*r*r;
				
		
		System.out.print(n+", ");
		System.out.print("your input circle with radius "+r+" has perimeter "+p+ " and area "+a);
		key.close();
	}

}
