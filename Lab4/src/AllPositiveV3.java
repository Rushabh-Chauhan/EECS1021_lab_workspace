
public class AllPositiveV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ns= {2,3,23,4,5};//{2,3,-2,4,5};
		
		boolean allPos=true;
		for (int i=0;i<ns.length && allPos;i++)
		{
			allPos = allPos && ns[i]>0;
		}
		
		System.out.println("All elements in array are possitive: "+allPos);

	}

}
