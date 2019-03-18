package tests;

import model.CourseRecord;
import model.Faculty;
//import model.Faculty;
import model.Student;

public class StudentTester5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		CourseRecord cr1 = new CourseRecord("2030"); 
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("3311");
		
		Faculty f1 = new Faculty("Jackie", "LAS2043",70130);
		cr1.setInstructor(f1);
		cr2.setInstructor(f1);
		cr3.setInstructor(f1);
		
		Student s1 = new Student("sunHye");
		
		
		
		// Link student to recourds
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s1.addCourse(cr3);
		
//		System.out.println(s1.courses[0] == s2.courses[1]);
//		System.out.println(s1.courses[1] == s2.courses[0]);
//		System.out.println(s1.courses[2] == s2.courses[2]);
//		System.out.println(s1.courses[0].instructor == s2.courses[0].instructor);
//		
		System.out.println(s1.getDescription());
		
		
		s1.setMarks("2030", 89);
		s1.setMarks("1021", 67);
		s1.setMarks("3311", 89);
		
		System.out.println(s1.getDescription());
		
		
		
		
		
		
		
		
		
		
	}

}
