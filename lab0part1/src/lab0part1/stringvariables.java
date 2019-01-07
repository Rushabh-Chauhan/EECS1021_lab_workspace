package lab0part1;

public class stringvariables {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String firstname="";
		String lastname="";
		int i=0;
		
		System.out.println("person "+i+" : "+lastname+", "+firstname);
		
		firstname="meet";
		lastname="patel";
		i=i+1;
		System.out.println("person "+i+" : "+lastname+", "+firstname);
		
		firstname="jeet";
		lastname="li";
		i=i+1;
		System.out.println("person "+i+" : "+lastname+", "+firstname);
		
		/* Line 12 & 22 are same but produce different results
		 * due to changing variables.
		 */
	}

}
