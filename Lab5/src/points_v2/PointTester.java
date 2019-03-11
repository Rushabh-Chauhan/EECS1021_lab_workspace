package points_v2;

public class PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(3,-4);
		Point p2=new Point (-2,-7);
		Point p3=new Point ('y',8);
		Point p4=new Point ('x',-5);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 and p2 store different address: "+(p1 != p2));
		System.out.println("p1 and p2 store same address: "+(p1 == p2));
		System.out.println(p3);
		System.out.println(p4);
		
//		double dist1 = p1.getDistanceFromOrigin();
//		String desc1 = p1.getDescription();
//		
//		double dist2 = p3.getDistanceFromOrigin();
//		String desc2 = p3.getDescription();
//		
//		double dist3 = p1.getDistanceFrom(p3);
//		
//		System.out.println("Description of p1: "+desc1);
//		System.out.println("Description of p3: "+desc2);
//		System.out.println("Distance of p1 from (0,0): "+dist1); 
//		System.out.println("Distance of p3 from (0,0): "+dist2);
//		System.out.println("Distance from p1 to p3: "+dist3);
//		
//		p1.move('R', 3.2);
//		p3.move('D', 4.7);
//		System.out.println("After moving p1 and p3");
//		
//		 dist1 = p1.getDistanceFromOrigin();
//		 desc1 = p1.getDescription();
//		 dist2 = p3.getDistanceFromOrigin();
//		 desc2 = p3.getDescription();
//		 dist3 = p1.getDistanceFrom(p3);
//		
//		System.out.println("Description of p1: "+desc1);
//		System.out.println("Description of p3: "+desc2);
//		System.out.println("Distance of p1 from (0,0): "+dist1); 
//		System.out.println("Distance of p3 from (0,0): "+dist2);
//		System.out.println("Distance from p1 to p3: "+dist3);
		
		
		// this is version 2. print directly withot calling.
		
	
		System.out.println("Description of p1: "+p1.getDescription());
		System.out.println("Description of p3: "+p3.getDescription());
		System.out.println("Distance of p1 from (0,0): "+p1.getDistanceFromOrigin()); 
		System.out.println("Distance of p3 from (0,0): "+p3.getDistanceFromOrigin());
		System.out.println("Distance from p1 to p3: "+p1.getDistanceFrom(p3));
		
		p1.move('R', 3.2);
		p3.move('D', 4.7);
		System.out.println("After moving p1 and p3");
		
		
		 System.out.println("Description of p1: "+p1.getDescription());
			System.out.println("Description of p3: "+p3.getDescription());
			System.out.println("Distance of p1 from (0,0): "+p1.getDistanceFromOrigin()); 
			System.out.println("Distance of p3 from (0,0): "+p3.getDistanceFromOrigin());
			System.out.println("Distance from p1 to p3: "+p1.getDistanceFrom(p3));
		
		
	}

}
