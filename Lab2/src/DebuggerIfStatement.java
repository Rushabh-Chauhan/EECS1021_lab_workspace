import java.util.Scanner;

public class DebuggerIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		if(x<0)
		{
			System.out.println("x is negative");
		}
		else
		{// x>=0
			if (5<= x && x <=10)
			{
				System.out.println("x is between 5 and 10");
			}
			else if (15<= x && x <=20)
			{
				System.out.println("x is between 15 and 20");
			}
			else 
			{
				System.out.println("x is not in [5,10] and not in [15,20]");
			}
		}
		
		input.close();
		
		
	}

}
