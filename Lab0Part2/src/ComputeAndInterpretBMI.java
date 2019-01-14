import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is your name?");
		String n=input.nextLine();
		
		System.out.println(n+", Enter your height in inches: ");
		int h1=input.nextInt();
		double h=h1/39.37;
		System.out.println(n+", Enter your weight in pounds:");
		int w1=input.nextInt();
		double w=w1/2.205;
		
		double hh=h*h;
		double bmi= w/hh;
		System.out.println(n+", your BMI is "+bmi);
		
		
		
		if(bmi < 18.5)
		{
			System.out.println("underweight");
		}
		else if(bmi >= 18.5 && bmi <25.0)
		{
			System.out.println("normal");
		}
		else if(bmi >= 25.0 && bmi <30.0)
		{
			System.out.println("overweight");
		}
		else if(bmi >=30.0)
		{
			System.out.println("obese");
		}
		
		
		
		input.close();
	}

}
