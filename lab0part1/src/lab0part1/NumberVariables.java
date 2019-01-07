package lab0part1;

public class NumberVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("After initializing I's value to 5");
		int i=5;
		System.out.println("i's value is: " +i);
		
		i=7;
		System.out.println("After changing the value of i to 7");
		System.out.println("i's value is: " +i);//7
		
		double x=23.5;
		double y=24.7;
		System.out.println("Average value of x & y is:  " +((x+y)/2));// 5.1
		/* Inflexible solution: every time values of x & y above is changed
		 * we have to modify the contents of the strings below.
		 */
		
		/* Flexible solution: every time the values are changed.
		 * we don't need to modify the solution.
		 */
		 System.out.println("average between"+x+ " and "+y+" is: "+((x+y)/2));//4.1 //24.1
	}

}
