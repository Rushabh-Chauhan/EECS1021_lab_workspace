import java.util.Scanner;

public class IfStatementApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an int:");
		int balance= input.nextInt();
		
		System.out.println("enter the withdraw amount:");
		int amount = input.nextInt();
		
		if(balance < 0 || amount<0 || amount <= balance)
		{
			System.out.println("Error");
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
