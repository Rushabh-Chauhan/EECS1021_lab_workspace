package points_v2;

public class Point 
{
	 double x;
	 double y;
	 
	 /* this start a constructor.
	  * it has a same name as class name. 
	  */
	 
	 Point (double x,double y)
	 {
		 this.x = x;
		 this.y= y;
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
			 this.x=0;
			 this.y=distance;
		 }
	 }
	 
	 
	 
	 
	 
	 /*
	  *  Accessor: method for inquire the point
	  */
	 double getDistanceFromOrigin()
	 {
		 double result = 0.0;
		 
		 result = Math.sqrt(this.x * this.x + Math.pow(this.y, 2));
		 
		 
		 
		 return result;
	 }
	 
	 
	 String getDescription()
	 {
		String description = "";
		
		description = "(" + this.x + "," + this.y+")";
		
		return description;
	 }
	 
	 double getDistanceFrom(Point other)
	 {
		 double distance = 0.0;
		 
		 distance = Math.sqrt(Math.pow(this.x-other.x,2) + Math.pow(this.y - other.y, 2));
		 
		 return distance;
	 }
	 
	 
	 /*
	  * Mutators: modifying the attriburte values of contex object(this).
	  */
	 
	 void move (char direction, double units)
	 {
		 if (direction == 'U')
		 {
			 this.y = this.y + units;
		 }
		 else if (direction == 'D')
		 {
			 this.y = this.y - units;
		 }
		 else if (direction == 'L')
		 {
			 this.x = this.x - units;
		 }
		 else
		 {
			 this.x = this.x + units;
		 }
	 }
	 
	 
	 
	 
	 
}
