import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double i,p1=0,p2=0,p3=0,k=0,c=0;
		System.out.println("Enter your name:");
		String n=input.nextLine();
		
		System.out.println(n+", enter your filing status (1-Single Filing; 2- Married Filing)");
		int f=input.nextInt();
		
		
		// the filing for unmaried people started.
		if(f==1)
		{
			System.out.println(n+", enter your taxable income:");
			i=input.nextInt();
			k=i;
			c=i;
			if(i<=8350)
			{
				p1=i*0.1;
			}
			else if (i>8350)
			{
				p1=835.0;
				
				
				if(i<=33950)
				{
					i=i-8350.0;
					p2=i*0.15;
				}
				else if (i>33950)
				{
					p2=3840.0;
					c=c-33950;
					p3=c*0.25;
							
				}
			}
		}
		// the filing for unmaried people ends
		
		// the filing for maried people started.
		else if(f==2)
		{
			System.out.println(n+", enter your taxable income:");
			i=input.nextInt();
			k=i;
			c=i;
			if(i<=16700)
			{
				p1=i*0.1;
			}
			else if (i>16700)
			{
				p1=1670.0;
				
				
				if(i<=67900)
				{
					i=i-16700.0;
					p2=i*0.15;
				}
				else if (i>67900)
				{
					p2=7680.0;
					c=c-67900;
					p3=c*0.25;
							
				}
			}
		}
		// filing for maried people end
		else
		{
			System.out.println("Illegal status: "+f);
		}
		
		if(f==1)
		{
			double pay = p1+p2+p3;
			System.out.println(n+", you should pay $"+pay);
			System.out.println("Calculation is based on the scheme of Single Filing: ");
			if (k<=8350)
			{
				System.out.println("Part I: "+p1);
			}
			else if(k>8350 && k<=33950)
			{
				System.out.println("Part I: "+p1);
				System.out.println("Part II: "+p2);
			}
			else if(k>33950)
			{
				System.out.println("Part I: "+p1);
				System.out.println("Part II: "+p2);
				System.out.println("Part III: "+p3);
			}
		}
		
		else if(f==2)
		{
			double pay = p1+p2+p3;
			System.out.println(n+", you should pay $"+pay);
			System.out.println("Calculation is based on the scheme of married Filing: ");
			if (k<=16700)
			{
				System.out.println("Part I: "+p1);
			}
			else if(k>16700 && k<=67900)
			{
				System.out.println("Part I: "+p1);
				System.out.println("Part II: "+p2);
			}
			else if(k>67900)
			{
				System.out.println("Part I: "+p1);
				System.out.println("Part II: "+p2);
				System.out.println("Part III: "+p3);
			}
		}
		
		
		
		
		
		
		input.close();
	}

}
