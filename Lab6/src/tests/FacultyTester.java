package tests;

import model.Faculty;

public class FacultyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty f1 = new Faculty("Jackie","LAS2043",70310);
		Faculty f2 = new Faculty("Jonathan","LAS2045",70209);
		
		System.out.println(f1.getDescription());
		System.out.println(f2.getDescription());
		
		Faculty f3 = new Faculty("Jackie","LAS2043",70310);
		System.out.println("f1 and f3 are same object "+(f1 == f3));
		System.out.println("f1 and f3 have the same contents:"+f1.getDescription() .equals(f3.getDescription()));
		
		Faculty f4 = f1;
		
		System.out.println("f1 and f4 are same object "+(f1 == f4));
		System.out.println("f1 and f4 have the same contents:"+f1.getDescription() .equals(f4.getDescription()));
	}

}
