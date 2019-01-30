import java.util.Scanner;

public class WhileLoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		
        int total=0,i=1;
		
		while( i<= 2 )
		{
			System.out.println("Enter integer "+ i+ ":");
			int x= input.nextInt();
			
			while(!(x > 0))
			{
				System.out.println("Error: "+x+" is not > 0");
				System.out.println("Try again");
				x= input.nextInt();
			} 
			
			total += x;
			i++;
		}
		double average= ((double)total)/2;
		System.out.println("Average is "+average);	
				
		input.close();
	}

}
