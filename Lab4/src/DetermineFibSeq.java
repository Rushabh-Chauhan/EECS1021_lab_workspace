import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   System.out.println("");
		Scanner input = new Scanner (System.in);
		int m[]=new int[20];
		int k=0,k1=0,i=0,check=0;
		String yn;
		while (k==0)
		{//main loop
			k1=0;
			i=0;
			while(k1==0)// array input st
			{
				System.out.println("Enter a positive integer value, or -1 to stop:");
				m[i]=input.nextInt();
				if (m[i]==-1)
				{
					k1=1;
				}
				i++;
			}// array input cl
			input.nextLine();
			System.out.print("The sequence you entered <");
			for (int j=0;j<(i-1);j++)
			{
				if(m[j]==0)
				{
					break;
				}
				else
				{
					if((j+1)!=(i-1))
					 {
						 System.out.print(m[j]+", ");
					 }
					 else
					 {
						 System.out.print(m[j]);
					 }
				}
			}			
			System.out.println(">");
			
			// checking the serice
			
			
			if (m[0]!=1)
			{
				System.out.println("       is not the first "+(i-1)+" numbers in the Fibonacci sequence.");
				System.out.println("Would you like to continue? (Y/N)");
				yn = input.nextLine();
				if(yn.equals("N"))
				{
					k=1;
					System.out.println("Bye");
				}					
			}
			else if (m[1]!=1)
			{
				System.out.println("       is not the first "+(i-1)+" numbers in the Fibonacci sequence.");
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
				for (int j=2;j<(i-1);j++)
				{
					if ((m[j-2]+m[j-1])!=m[j])
					{
						check=1;
					}							
				}
				if (check == 1)
				{
					System.out.println("       is not the first "+(i-1)+" numbers in the Fibonacci sequence.");
				}
				else 
				{
					System.out.println("       is the first "+(i-1)+" numbers in the Fibonacci sequence.");
				}
				System.out.println("Would you like to continue? (Y/N)");
				yn = input.nextLine();
				if(yn.equals("N"))
				{
					k=1;
					System.out.println("Bye");
				}					
				
			}			
				
			
			
			
			
			
		}// main loop close
		
		
		
		
		
		
		
		
		input.close();

	}

}
