import java.util.Scanner;

public class PrintBetweenNumbers3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int k1=1,k2;
		
		while(k1==1)
		{
			System.out.println("Enter a Lower bound: ");
			int lb = input.nextInt();
			System.out.println("Enter a Upper bound: ");
			int ub = input.nextInt();
			input.nextLine();
			
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
		  k2=1;
		  while(k2==1)
		  {  
		    System.out.println("Would you like to continue printing?( Enter Y for yes; N for no )");
		    String a= input.nextLine();
		    if(a.equals("Y"))
		    {
		    	k2=0;	    
		    } 
		    else if(a.equals("N"))
		    {
			    k1=0;
			    k2=0;
			    System.out.println("Bye!");
			  
		    }
		    else if (!a.equals("N") && !a.equals("Y"))
		    {
		    	System.out.println("Invalid indication on continuation: "+a);
		    }
		  }
			  	      
		  
		}
		input.close();
		

	}

}
