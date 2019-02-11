

import java.util.Scanner;

public class StringArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
		
		 System.out.println("How manney people do you want to great?");
		 int howMany =input.nextInt();
		 input.nextLine();
		 
		 String[] names = new String[howMany];
		 
		 for (int i=0; i<howMany;i++)
		 {
			 System.out.println("Enter the name "+(i+1)+ ":");
			 String name =input.nextLine();
			 names[i] = name;
		 }
		 
		 for (int i=0;i<names.length;i++)
		 {
			 System.out.println("Hellow "+names[i]+ "!");
		 }
		 
		 
		 
		 input.close();
	}

}
