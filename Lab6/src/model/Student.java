package model;

public class Student {
	public String name;
	final int MAX_NUM_COURSES = 5;
//	CourseRecord cr1;
//	CourseRecord cr2;
//	CourseRecord cr3;
//	CourseRecord cr4;
//	CourseRecord cr5;
	
	public CourseRecord[] courses; // each element in array stores the address of some CourseRecourd .
	int noc; //number of courses.
	
	public Student(String name)
	{
		this.name = name;
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc=0;
	}
	
	public void addCourse(CourseRecord c)
	{
		this.courses[this.noc] = c;
		this.noc++;
	}
	
	public void addCourse(String title) {
		CourseRecord c = new CourseRecord(title);
		this.courses[this.noc] = c;
		this.noc++;
	}
	
	public String getDescription()
	{
		String result = "";
		
		// version 2:
//		result += "Student "+ this.name+" has required "+this.noc+" course:\n";
//		for (int i=0; i<this.courses.length;i++)
//		{
//			result += this.courses[i] + "\n";
//		}
		
		 //version 2 this will also run;
		result += "Student "+ this.name+" has required "+this.noc+" course:\n";
		for (int i=0; i<this.courses.length;i++)
		{
			if(this.courses[i] == null)
			{
				
			}
			else
			{
				result += this.courses[i].getDescription() + "\n";
			}
		}
		
		// version 3 this will also run;
//		result += "Student "+ this.name+" has required "+this.noc+" course:\n";
//		for (int i=0; i<this.noc;i++)
//		{
//			result += this.courses[i] + "\n";
//		}
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
