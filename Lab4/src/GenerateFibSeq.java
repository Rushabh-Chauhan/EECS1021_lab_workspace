import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    System.out.println("Bye");
		Scanner input = new Scanner(System.in);
		
		int k=0;
		String yn;
		while (k==0)
		{
			System.out.println("Enter the size of fibonacci Sequence: ");
			int n=input.nextInt();
			input.nextLine();
			if(n <= 0)
			{
				System.out.println("Error: Fibonacci Sequence must have size >= 1");
				System.out.println("Would you like to continue? (Y/N)");
				yn = input.nextLine();
				if(yn.equals("N"))
				{
					k=1;
					System.out.println("Bye");
				}					
			}
			else
			{
				 if (n==1)
				 {
					 System.out.println("<1>");
					 System.out.println("Would you like to continue? (Y/N)");
						yn = input.nextLine();
						if(yn.equals("N"))
						{
							k=1;
							System.out.println("Bye");
						}					
				 }
				 else if (n==2)
				 {
					 System.out.println("<1, 1>");
					 System.out.println("Would you like to continue? (Y/N)");
						yn = input.nextLine();
						if(yn.equals("N"))
						{
							k=1;
							System.out.println("Bye");
						}					
				 }
				 else
				 {
					 System.out.print("<1, 1, ");
					 int a=1,b=1,c;
					 for(int i=3;i<=n;i++)
					 {
						 c=a+b;
						 if(i!=n)
						 {
							 System.out.print(c+", ");
						 }
						 else
						 {
							 System.out.print(c);
						 }
						 a=b;
						 b=c;
						 
					 }
					 System.out.println(">");
					 System.out.println("Would you like to continue? (Y/N)");
						yn = input.nextLine();
						if(yn.equals("N"))
						{
							k=1;
							System.out.println("Bye");
						}					
				 }
			}
		}
			
		
		
		
		
		input.close();
	}

}
