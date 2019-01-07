package lab0part1;

import java.util.Scanner;

public class scannerinpot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter the first number");
		Double n1 =input.nextDouble();
		input.nextLine();
		

		System.out.println("enter the secound number");
		Double n2 =input.nextDouble();
		input.nextLine();


		System.out.println("enter your name");
		String n =input.nextLine();
		
		double avg=(n1+n2)/2;
		
		System.out.print(n+", ");
		System.out.print("the numbers you entered are "+n1+" and "+n2+", and");
		System.out.println("there average is: "+avg);
		
		
		
		input.close();
	}

}
