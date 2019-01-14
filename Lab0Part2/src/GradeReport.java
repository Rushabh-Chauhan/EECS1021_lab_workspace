import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("What is your name?");
		String n=input.nextLine();
		
		System.out.println(n+", What is your Score for Quiz 1(out of 100)?");
		int q1=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 2(out of 100)?");
		int q2=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 3(out of 100)?");
		int q3=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 4(out of 100)?");
		int q4=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 5(out of 100)?");
		int q5=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 6(out of 100)?");
		int q6=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 7(out of 100)?");
		int q7=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 8(out of 100)?");
		int q8=input.nextInt();
		System.out.println(n+", What is your Score for Quiz 9(out of 100)?");
		int q9=input.nextInt();
		
		
		System.out.println(n+", What is your Score for Assignment 1(out of 100)?");
		int a1=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 2(out of 100)?");
		int a2=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 3(out of 100)?");
		int a3=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 4(out of 100)?");
		int a4=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 5(out of 100)?");
		int a5=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 6(out of 100)?");
		int a6=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 7(out of 100)?");
		int a7=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 8(out of 100)?");
		int a8=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 9(out of 100)?");
		int a9=input.nextInt();
		System.out.println(n+", What is your Score for Assignment 10(out of 100)?");
		int a10=input.nextInt();
		
		
		
		System.out.println(n+", What is your Score for Lab Test 1(out of 100)?");
		int lt1=input.nextInt();
		System.out.println(n+", What is your Score for Lab Test 2(out of 100)?");
		int lt2=input.nextInt();
		System.out.println(n+", What is your Score for Lab Test 3(out of 100)?");
		int lt3=input.nextInt();
		
		System.out.println(n+", What is your Midterm Score (out of 100)?");
		int m=input.nextInt();
		
		System.out.println(n+", What is your final exam Score (out of 100)?");
		int f=input.nextInt();
		input.nextLine();
		
		System.out.println(n+", What course are you talking about ?");
		String c=input.nextLine();
		
		System.out.println(n+", here is your grading report for "+c);
		System.out.println("----------------------------------------------------------------- ");
		System.out.println("Quiz 1: "+q1);
		System.out.println("Quiz 2: "+q2);
		System.out.println("Quiz 3: "+q3);
		System.out.println("Quiz 4: "+q4);
		System.out.println("Quiz 5: "+q5);
		System.out.println("Quiz 6: "+q6);
		System.out.println("Quiz 7: "+q7);
		System.out.println("Quiz 8: "+q8);
		System.out.println("Quiz 9: "+q9);
		System.out.println("-------------------------------------------------------------------- ");
		System.out.println("Assignment 1: "+a1);
		System.out.println("Assignment 2: "+a2);
		System.out.println("Assignment 3: "+a3);
		System.out.println("Assignment 4: "+a4);
		System.out.println("Assignment 5: "+a5);
		System.out.println("Assignment 6: "+a6);
		System.out.println("Assignment 7: "+a7);
		System.out.println("Assignment 8: "+a8);
		System.out.println("Assignment 9: "+a9);
		System.out.println("Assignment 10: "+a10);
		System.out.println("---------------------------------------------------------------------- ");
		System.out.println("Lab Test 1: "+lt1);
		System.out.println("Lab Test 2: "+lt2);
		System.out.println("Lab Test 3: "+lt3);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Midterm Test : "+m);
		System.out.println("Final test : "+f);
		
		double aq= (q1+q2+q3+q4+q5+q6+q7+q8+q9)/9;
		double aa=(a1+a2+a3+a4+a5+a6+a7+a8+a9+a10)/10;
		double alt=(lt1+lt2+lt3)/3;
		double rawfinal= ((0.18)*aq)+((0.20)*aa)+((0.12)*alt)+((0.15)*m)+((0.35)*f);
		System.out.println("------------------------------------------------------------------------- ");
		System.out.println("Average of quizzes: "+aq);
		System.out.println("Average of assignments: "+aa);
		System.out.println("Average of lab tests: "+alt);
		System.out.println("Final raw marks: "+rawfinal);
		
		
		
		input.close();
		
	}

}
