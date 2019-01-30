import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Lower bound: ");
		int lb = input.nextInt();
		System.out.println("Enter a Upper bound: ");
		int ub = input.nextInt();
		
		if(lb <= ub)
		{
			System.out.println("Numbers between "+lb+" and "+ub+":");
			for(int i=lb; i<=ub;i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			System.out.println("Error: Lower bound "+lb+" is not less than or equal to upper bound "+ub);
			
		}
		
		System.out.println("Bye!");
		
		input.close();
		

	}

}
