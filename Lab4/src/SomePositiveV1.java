
public class SomePositiveV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ns= {-2,-7,4,5,-1};//{2,3,-2,4,5};
		
		boolean somePos=false;
		for (int i=0;i<ns.length;i++)
		{
			somePos = somePos || ns[i]>0;
		}
		
		System.out.println("some elements in array is possitive: "+somePos);

	}

}
