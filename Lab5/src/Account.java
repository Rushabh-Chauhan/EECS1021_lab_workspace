public class Account 
{
	String name;
	char type;
	double balance;
	Account(String name,char type, double balance)
	{
		if (type == 'i')
		{
			this.name = name;
			this.balance = balance;
			this.type = 'i';
		}
		else
		{
			this.name = name;
			this.balance = balance;
			this.type = 'd';
		}
	}
	
	
	Account (String name,char type)
	{
		if (type == 'i')
		{
			this.name = name;
			this.balance = 0.0;
			this.type = 'i';
		}
		else
		{
			this.name = name;
			this.balance = 0.0;
			this.type = 'd';
		}
	}
	
	
	double getBalance()
	{
		return this.balance;
	}
	
	String getDescription()
	{
		String s = "";
		if (this.type == 'i')
		{
			s = "International account with owner "+ this.name + "has current balance "+this.balance;         
		}
		else
		{
			s = "Domestic account with owner "+ this.name + "has current balance "+this.balance;
		}
		return s;
	}
	
	
	void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	void deposit(double balance)
	{
		
		if (this.type == 'i')
		{
			this.balance += balance - ((balance*10)/100);
		}
		else 
		{
			this.balance += balance;
		}
	}
	
	
	
	
	
	void withdraw(double balance)
	{
		
		if (this.type == 'i')
		{
			this.balance -= balance + ((balance*10)/100);
		}
		else
		{
			this.balance -= balance;
		}
	}
	
	void transferTo(Account a1, double balance)
	{
		this.balance -= balance;
		a1.balance += balance;
	}
	
	
	
	
}
