package tests;

import model.CourseRecord;
import model.Faculty;
import model.Student;

public class StudentTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faculty f1 = new Faculty("Jonathan", "LAS2004",70139);
		Faculty f2 = new Faculty("Jackie", "LAS2043",70130);
		
		
		CourseRecord cr1 = new CourseRecord("2030"); 
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("3311");
		
		Student s1 = new Student("sunHye");
		Student s2 = new Student("sunHye");
		
		cr1.setInstructor(f2);
		cr2.setInstructor(f2);
		cr3.setInstructor(f1);
		
		// Link student to recourds
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
		System.out.println(s1.courses[0] == s2.courses[1]);
		System.out.println(s1.courses[1] == s2.courses[0]);
		System.out.println(s1.courses[2] == s2.courses[2]);
		System.out.println(s1.courses[0].instructor == s2.courses[0].instructor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
