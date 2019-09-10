package model;

public class Student {
	public String name;
	final int MAX_NUM_COURSES = 5;
//	CourseRecord cr1;
//	CourseRecord cr2;
//	CourseRecord cr3;
//	CourseRecord cr4;
//	CourseRecord cr5;0
	
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
		this.addCourse(c);
//		this.courses[this.noc] = c;
//		this.noc++;
	}
	
	public int getMarks(String title)
	{
		int marks = 0;
		int index = this.indexof(title);
		if(index>=0)
		{
			CourseRecord c = this.courses[index];
			marks = c.getMarks();
		}
		else
		{
			marks = -1;
		}
		
		
		
		
		return marks;
	}
	public void setMarks(String title, int marks)
	{
		int index = this.indexof(title);
		if(index>=0)
		{
			CourseRecord c = this.courses[index];
			 c.setMarks(marks);
		}
		else
		{
			marks = -1;
		}

	}
	
	int indexof(String title)
	{
		int index = -1;
		boolean found = false;
		for (int i = 0; i<this.noc && !found;i++)
		{
			if(this.courses[i].getTitle().equals(title))
			{
				found = true;
				index = i;
			}
		}
		
		return index;
	}
	double getGPA()
	{
		double gpa = 0.0;
		double gp = 0.0;
		for(int i=0 ; i<this.noc;i++)
		{
			//CourseRecord c = this.courses[i];
			String lg = this.courses[i].getLetterGrade();
			if(lg.equals("A+"))
			{
				gp += 9;
			}
			else if(lg.equals("A"))
			{
				gp += 8;
			}
			else if(lg.equals("B"))
			{
				gp += 7;
			}
			else if(lg.equals("C"))
			{
				gp += 6;
			}
			else if(lg.equals("D"))
			{
				gp += 5;
			}
			else 
			{
				gp += 0;
			}
				
		}
		gpa = gp / this.noc;
		return gpa;
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
		result += "Student "+ this.name+" has registered "+this.noc+" course ( with GPA " + this.getGPA()+ ")\n";
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
