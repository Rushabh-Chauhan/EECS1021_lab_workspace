package lab0part1;

import java.util.Scanner;

public class scannerinput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the numb");
		
		int i = input.nextInt();
		
		int squre=i*i;
		
		System.out.println("the squre of "+i+" is: "+squre);
		
		input.close();
	}

}
