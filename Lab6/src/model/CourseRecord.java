package model;

public class CourseRecord {
	
	String title;
	int marks; //final raw marks out of 100
	public Faculty instructor;
	
	 public CourseRecord()
	 {
		 //v1: no attribute will be initialized.
		 // all the attribute have defalt value
		 //int :0;
		 //boolean: false
	 }
	 
	 public CourseRecord(String title)
	 {
		 this.title = title;
		 // all other attributes will have there defalt value.
	 }
	 
	 public CourseRecord(String title, int marks)
	 {
		 this.title = title;
		 this.marks = marks;
		 // other value will have their defalt values.
	 }
	 
	 public String getTitle() {
		return title;
	}

	public int getMarks() {
		return marks;
	}

	public Faculty getInstructor() {
		return instructor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	
	
	public String getLetterGrade()
	{
		String lg = "";
		if(this.marks >=90)
		{
			lg = "A+";
		}
		else if(this.marks >=80)
		{
			lg = "A";
		}
		else if(this.marks >=70)
		{
			lg = "B";
		}
		else if(this.marks >=60)
		{
			lg = "C";
		}
		else if(this.marks >=50)
		{
			lg = "D";
		}
		else
		{
			lg = "E";
		}
		
		return lg;
	}

	public String getDescription()
	 {
		//String dec = "";
		// v1
		 //return "Course "+this.title+" (raw marks: "+this.marks+ ") has instructor " +this.instructor;
		 
		 //v2
		if (this.instructor == null)
		{
			return "Course "+this.title+" (raw marks: "+this.marks+" and letter grade "+ this.getLetterGrade() + ") has no instructor ";
		}
		else
		{
			return "Course "+this.title+" (raw marks: "+this.marks+" and letter grade "+ this.getLetterGrade() + ") has no instructor ";
		}
	 }
	
	 
}
