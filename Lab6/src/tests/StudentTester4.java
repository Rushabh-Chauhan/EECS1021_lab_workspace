package tests;

import model.CourseRecord;
//import model.Faculty;
import model.Student;

public class StudentTester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		CourseRecord cr1 = new CourseRecord("2030"); 
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("3311");
		
		Student s1 = new Student("sunHye");
		Student s2 = new Student("sunHye");
		
		
		// Link student to recourds
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
//		System.out.println(s1.courses[0] == s2.courses[1]);
//		System.out.println(s1.courses[1] == s2.courses[0]);
//		System.out.println(s1.courses[2] == s2.courses[2]);
//		System.out.println(s1.courses[0].instructor == s2.courses[0].instructor);
//		
		System.out.println(s1.getMarks("2030"));
		System.out.println(s1.getMarks("1021"));
		System.out.println(s1.getMarks("3311"));
		s1.setMarks("2030", 60);
		s1.setMarks("1021", 90);
		System.out.println("After setting marks");
		System.out.println(s1.getMarks("1021"));
		System.out.println(s1.getMarks("2030"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
