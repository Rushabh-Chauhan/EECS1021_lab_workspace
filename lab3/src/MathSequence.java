import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		int k=0;
		while(k==0)
		{
		System.out.println("What kind of processing task would you like to perform");
		System.out.println("1: Generate an arithmetic sequence.");
		System.out.println("2: Generate a geometric sequence.");
		System.out.println("3: Determine an arithmetic sequence.");
		int process= input.nextInt();
		if (process==1)
		{
			System.out.println("Enter the first term in the arithmetic sequence");
			int a1 = input.nextInt();
			System.out.println("Enter the common difference in the arithmetic sequence:");
			int d= input.nextInt();
			System.out.println("Enter the number of terms in the arithmetic sequence:");
			int n=input.nextInt();
			input.nextLine();
			int sum=0;
			int a[]= new int[n];
			a[0]=a1;
			for(int i=1;i<n;i++)
			{
				a[i]= a[i-1]+d;
			}
			System.out.print("<");
			for(int i=0;i<n;i++)
			{
				sum=sum+a[i];
				System.out.print(a[i]+" ");
			}
			System.out.println(">");
			System.out.println("Sum of the arithmetic sequence: "+sum);
			System.out.print("Would you like to process another sequence? (Y/N)");
			String yn=input.nextLine();
			if(yn.equals("Y"))
			{
				
			}
			else if(yn.equals("N"))
			{
				k=1;
				System.out.println("Bye!");
			}
			
			
			
			
		}// process 1 end
		else if(process==2)
		{
			
			System.out.println("Enter the first term in the geometric sequence");
			int g1=input.nextInt();
			System.out.println("Enter the common ratio in the geometric sequence");
			int r= input.nextInt();
			System.out.println("Enter the number of terms in the geometric sequence:");
			int n=input.nextInt();
			int sum=0;
			int g[]=new int[n];
			g[0]=g1;
			for(int i=1;i<n;i++)
			{
				g[i]=g[i-1]*r;
			}
			
			System.out.print("<");
			for(int i=0;i<n;i++)
			{
				sum=sum+g[i];
				System.out.print(g[i]+" ");
			}
			System.out.println(">");
			System.out.println("Sum of the arithmetic sequence: "+sum);
			System.out.print("Would you like to process another sequence? (Y/N)");
			input.nextLine();
			String yn=input.nextLine();
			if(yn.equals("Y"))
			{
				
			}
			else if(yn.equals("N"))
			{
				k=1;
				System.out.println("Bye!");
			}
			
				
			
		}//process 2 end
		else if(process==3)
		{
			int c=0;
			int d=9;
			int m[]=new int[10];
			
			System.out.println("Enter a new number:");
			 m[0]=input.nextInt();
			 System.out.println("You have entered 1 numbers.");
			 System.out.println("You may still enter another 9 numbers.");
			 System.out.println("Would you like to enter another new number? (Y/N)");
			 input.nextLine();
			 String ch = input.nextLine();
			 if(ch.equals("Y"))
			 {
				 for(int i=1;i<10;i++)
				 {
					 
					 d--;
					 System.out.println("Enter a new number:");
					 m[i]=input.nextInt();
					 System.out.println("You have entered "+(i+1)+" numbers.");
					 if(i!=9)
					 {
						 System.out.println("You may still enter another "+d+" numbers.");
						 System.out.println("Would you like to enter another new number? (Y/N)");
						 input.nextLine();
						 String ch2 = input.nextLine();
						 if(ch2.equals("N"))
						 {
							 c=(i+1);
							 break;
							 
						 }
					 }
					 else if(i==9)
					 {
						 c=10;
						 System.out.println("You have entered the maximum number of numbers!");
					 } 
				 }
				 
					 int sum=0;
					 System.out.print("<");
					 for(int i=0;i<10;i++)//printing for
					 {
						 sum=sum+m[i];
						 if(m[i]!=0)
						 {
							 System.out.print(m[i]+" ");
						 }
					 }
					 System.out.println(">");
					 
					
					 // checking for sequence
					 int d1=m[1]-m[0];
					 int d2=m[2]-m[1];
					 if(d1==d2 || c==2)
					 {
						 System.out.print("first term "+m[0]);
						 System.out.print(", common difference "+d1);
						 System.out.print(", length  "+c);
						 System.out.println(",  and sum "+sum);
					 }
					 else
					 {
						 System.out.println("is not an arithmetic sequence");
					 }
				 
				 
				 
				 
			 }// this is the first check for yess.
			 else if(ch.equals("N"))
			 {
				 System.out.println("Error: we cannot infer the common difference from a sequence of size one."); 
			 }
			 
			 
			 System.out.println("Would you like to process another sequence? (Y/N)");
				String yn=input.nextLine();
				if(yn.equals("Y"))
				{
					
				}
				else if(yn.equals("N"))
				{
					k=1;
					System.out.println("Bye!");
					
				}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//process 3 end
		else
		{
			System.out.println("Error: task number must be 1,2,3.");
		}
		}
		
		
		
		
		
		
		
		input.close();
	}

}
