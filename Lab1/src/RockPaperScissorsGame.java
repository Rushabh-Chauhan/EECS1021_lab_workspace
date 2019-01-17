import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		int s1=0,s2=0;
		System.out.println("Enter the name of player 1:");
		String p1= input.nextLine();
		System.out.println("Enter the name of player 2:");
		String p2= input.nextLine();
		
		// round one starts here
		System.out.println("===========");
		System.out.println("Round one 1:");
		System.out.println("===========");
		System.out.println("What does "+p1+" plays?(R,P or S)");
		String in1=input.nextLine();
		System.out.println("What does "+p2+" plays?(R,P or S)");
		String in2=input.nextLine();
		if((in1).equals(in2))
		{
			
		}
		else if((in1).equals("R") && (in2).equals("P") )
		{
			s2++;
		}
		else if((in1).equals("R") && (in2).equals("S") )
		{
			s1++;
		}
		else if((in1).equals("P") && (in2).equals("R") )
		{
			s1++;
		}
		else if((in1).equals("P") && (in2).equals("S") )
		{
			s2++;
		}
		else if((in1).equals("S") && (in2).equals("R") )
		{
			s2++;
		}
		else if((in1).equals("S") && (in2).equals("P") )
		{
			s1++;
		}
		
		
		// round one ends here
		
		// round 2 starts.
		System.out.println("===========");
		System.out.println("Round one 2:");
		System.out.println("===========");
		System.out.println("What does "+p1+" plays?(R,P or S)");
		 in1=input.nextLine();
		System.out.println("What does "+p2+" plays?(R,P or S)");
		 in2=input.nextLine();
		if((in1).equals(in2))
		{
			
		}
		else if((in1).equals("R") && (in2).equals("P") )
		{
			s2++;
		}
		else if((in1).equals("R") && (in2).equals("S") )
		{
			s1++;
		}
		else if((in1).equals("P") && (in2).equals("R") )
		{
			s1++;
		}
		else if((in1).equals("P") && (in2).equals("S") )
		{
			s2++;
		}
		else if((in1).equals("S") && (in2).equals("R") )
		{
			s2++;
		}
		else if((in1).equals("S") && (in2).equals("P") )
		{
			s1++;
		}
		
		/* round 2 end here and conclusion start and also
		 * round three. 
		 */
		
		if(s1==2)
		{
			System.out.println("Game over: "+p1+" wins!");
		}
		else if(s2==2)
		{
			System.out.println("Game over: "+p2+" wins!");
		}
		else
		{
			
			// third round starts here 
			
			System.out.println("===========");
			System.out.println("Round one 3:");
			System.out.println("===========");
			System.out.println("What does "+p1+" plays?(R,P or S)");
			 in1=input.nextLine();
			System.out.println("What does "+p2+" plays?(R,P or S)");
			 in2=input.nextLine();
			if((in1).equals(in2))
			{
				
			}
			else if((in1).equals("R") && (in2).equals("P") )
			{
				s2++;
			}
			else if((in1).equals("R") && (in2).equals("S") )
			{
				s1++;
			}
			else if((in1).equals("P") && (in2).equals("R") )
			{
				s1++;
			}
			else if((in1).equals("P") && (in2).equals("S") )
			{
				s2++;
			}
			else if((in1).equals("S") && (in2).equals("R") )
			{
				s2++;
			}
			else if((in1).equals("S") && (in2).equals("P") )
			{
				s1++;
			}
			
			/* third round end and so 
			 * we will have the winner.
			 */
			
			if(s1>s2)
			{
				System.out.println("Game over: "+p1+" wins!");
			}
			else if (s2>s1)
			{
				System.out.println("Game over: "+p2+" wins!");
			}
			else if (s1==s2)
			{
				System.out.println("Game over: A tie between "+p1+" and "+p2);
			}
			
		}
		
		
		
		
		
		input.close();
	}

}
