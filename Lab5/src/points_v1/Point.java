package points_v1;

public class Point 
{
	 double x;
	 double y;
	 
	 /* this start a constructor.
	  * it has a same name as class name. 
	  */
	 
	 Point (double newX,double newY)
	 {
		 x = newX;
		 y= newY;
	 }
	 
	 Point (char axis, double distance)
	 {
		 if (axis == 'x')
		 {
			 x= distance;
			 y=0;
		 }
		 else 
		 {
			 x=0;
			 y=distance;
		 }
	 }
}
