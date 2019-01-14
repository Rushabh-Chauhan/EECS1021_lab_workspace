import java.util.Scanner;

public class IfStatementApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an int:");
		int balance= input.nextInt();
		
		System.out.println("enter the withdraw amount:");
		int amount = input.nextInt();
		
		if(balance < 0  )
		{
			System.out.println("Error");
		}
		else if(amount <= balance)
		{
			System.out.println("Error");
		}
		else if(amount<0 )
		{
			
		}
		else
		{
			int rbalance=balance-amount;
			System.out.println("Initial balance"+balance+"after widh"+amount);
			System.out.println(" has the resulting balance"+rbalance);
		}
		
		
		input.close();
	}

}
