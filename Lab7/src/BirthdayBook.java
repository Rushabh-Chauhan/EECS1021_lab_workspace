import java.util.ArrayList;
import java.util.Hashtable;

public class BirthdayBook {
	/*
	 * You are required to use Hashtable to implement a birthday book.
	 */
	Hashtable<String, Birthday> book = new Hashtable<String, Birthday>() ;
	ArrayList<String> months = new ArrayList<String>();
	ArrayList<String> names = new ArrayList<String>();
	
	
	public void addBirthday(String name, Birthday md)
	{
		book.put(name , md);
	}
	
	public void addBirthday(String name, int month , int date)
	{
		Birthday md = new Birthday(month , date);
		book.put(name , md);
	}
	
	public String getReminders(Birthday bh)
	{
		if (book.containsValue(bh))
		{
			
		}
	}
	
	
	
	public String getDescription()
	{
		String result = "";
		
		months.add(1,"january");
		months.add(2,"Febuary");
		months.add(3,"march");
		months.add(4,"april");
		months.add(5,"may");
		months.add(6,"june");
		months.add(7,"jully");
		months.add(8,"august");
		months.add(9,"septunber");
		months.add(10,"octomber");
		months.add(11,"November");
		months.add(12,"dec");
		
		
		if (book.size() == 0)
		{
			result  = "The birthday book is empty";
		}
		else
		{
			result = "The birthday book has 3 entries:\n";
			for (int i=0 ; i<book.size();i++)
			{
				result += names.get(i) + ":" ;  
			}
		}
		
		return result;
	}
	
	
	// Array list starts
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
