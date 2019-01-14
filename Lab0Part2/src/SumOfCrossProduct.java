import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 1st Integer in sequence 1:");
		int i11= input.nextInt();
		System.out.println("Enter 2nd Integer in sequence 1:");
		int i21= input.nextInt();
		System.out.println("Enter 3rd Integer in sequence 1:");
		int i31= input.nextInt();
		System.out.println("Enter 4th Integer in sequence 1:");
		int i41= input.nextInt();
		
		System.out.println("Enter 1st Integer in sequence 2:");
		int i12= input.nextInt();
		System.out.println("Enter 2nd Integer in sequence 2:");
		int i22= input.nextInt();
		System.out.println("Enter 3rd Integer in sequence 2:");
		int i32= input.nextInt();
		System.out.println("Enter 4th Integer in sequence 2:");
		int i42= input.nextInt();
		
		int sum = (i11*i12)+(i21*i22)+(i31*i32)+(i41*i42);
		System.out.println("sum(["+i11+","+i21+","+i31+","+i41+"] * ["+i12+","+i22+","+i32+","+i42+"]) ="+sum);
		
		
		input.close();
	}

}
