package model;


public class StudentManagementSystem {
	final int MAX_STUDENT = 1000;
	public Student  std[];
	public int k=0;
	
	public StudentManagementSystem()
	{
		this.std = new Student[MAX_STUDENT];
	}
	
	public void addStudent(Student s)
	{
		this.std[this.k]=s;
		this.k++;
	}
	
	public void addStudent(String s)
	{
		Student stu=new Student(s);
		this.std[this.k]=stu;
		this.k++;
	}
	
	
	
	public Student[] getStudents()
	{
		Student[] m = new Student[this.k];
		
		for (int i = 0; i<this.k;i++)
		{
			m[i]=this.std[i];
		}
		return m;
	}
	
	public int getMarks(String name,String title)
	{
		int m=0;
		int a=0;
		int result;
		for (int i=0;i<this.k;i++)
		{
			if(this.std[i].name.equals(name))
			{
				m=this.std[i].getMarks(title);
			}
			else 
			{
				a++;
			}
		}
		if (a==this.k)
			{result = -1;}
		else
		{
			result = m;
		}
		return result;
		
	}
	
	
	
	public void setMarks(String name, String title,int mark)
	{
		for(int i=0;i<this.k;i++)
		{
			if(this.std[i].name.equals(name))
			{
				this.std[i].setMarks(title, mark);
			}
		}
	}
	
	
	public double getGPA(String name)
	{
		double m = 0;
		int a = 0;
		double result = 0.0;
		for(int i=0;i<this.k;i++)
		{
			if(this.std[i].name.equals(name))
			{
				m = this.std[i].getGPA();
			}
			else
			{
				a++;
			}
		}
			if(a == this.k)
			{
				result = -1;
			}
			else
			{
				result = m;
			}
			
		
		return result;
	}
	
	
	
	public void addCourse(String name, CourseRecord title)
	{
		for(int i = 0; i<this.k;i++)
		{
			if(this.std[i].name.equals(name))
			{
				this.std[i].addCourse(title);
			}
		}
	}
	
	public String getDescription()
	{
		String result = "";
		
		if(this.k == 0)
		{
			result = "Student management system currently stores no students.";
		}
		else
		{
			result += "Student Student management system currently stores " + this.k + "students: \n";
			for (int i=0;i<this.k;i++)
			{
				result += this.std[i].getDescription() + "\n";
			}
		}
		
		return result;
	}
}
