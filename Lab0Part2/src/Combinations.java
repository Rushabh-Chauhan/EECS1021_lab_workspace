import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s1= input.nextLine();
		System.out.println("Enter 2nd string:");
		String s2= input.nextLine();
		System.out.println("Enter 3rd string:");
		String s3= input.nextLine();
		System.out.println("Enter 4th string:");
		String s4= input.nextLine();
		
		System.out.println("Enter 1st Integer:");
		int i1= input.nextInt();
		System.out.println("Enter 2nd Integer:");
		int i2= input.nextInt();
		System.out.println("Enter 3rd Integer:");
		int i3= input.nextInt();
		System.out.println("Enter 4th Integer:");
		int i4= input.nextInt();
		
		System.out.println("Here are all possiable combinations:");
		System.out.println("("+s1+","+i1+")");
		System.out.println("("+s1+","+i2+")");
		System.out.println("("+s1+","+i3+")");
		System.out.println("("+s1+","+i4+")");
		System.out.println("("+s2+","+i1+")");
		System.out.println("("+s2+","+i2+")");
		System.out.println("("+s2+","+i3+")");
		System.out.println("("+s2+","+i4+")");
		System.out.println("("+s3+","+i1+")");
		System.out.println("("+s3+","+i2+")");
		System.out.println("("+s3+","+i3+")");
		System.out.println("("+s3+","+i4+")");
		System.out.println("("+s4+","+i1+")");
		System.out.println("("+s4+","+i2+")");
		System.out.println("("+s4+","+i3+")");
		System.out.println("("+s4+","+i4+")");
		
		
		input.close();
	}

}
