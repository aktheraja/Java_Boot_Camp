
public class Assgnment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", 
				"John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
		Marathon(names,times);
		
	}
	public static void Marathon(String [] b, int [] c) {
		int temp ;
		String temp1 ; 
		for (int j=0; j<c.length-1;j++) {
			for(int i=0;i<c.length-1;i++) {
				if(c[i]>c[i+1]){
					temp =c[i+1];
					c[i+1]=c[i];
					c[i]=temp;
					temp1 =b[i+1];
					b[i+1]=b[i];
					b[i]=temp1;
				}
			}
		}	System.out.print(b[0]+ ": ");
			System.out.print(c[0]+ "minutes ");
			
	}
}
