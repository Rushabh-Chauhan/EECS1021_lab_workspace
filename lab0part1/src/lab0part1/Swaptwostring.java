package lab0part1;

public class Swaptwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p1="alan",p2="tom";
		
		System.out.println("before swap");
		System.out.println("person1 is: "+p1);
		System.out.println("person2 is: "+p2);
		
		//swap
		String temp=p1;
		p1=p2;
		p2=temp;
		
		System.out.println("after swap");
		System.out.println("person1 is: "+p1);
		System.out.println("person2 is: "+p2);
		
		

	}

}
