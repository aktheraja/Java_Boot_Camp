
public class assignment5 {

	public static void main(String[] args) {
		float [] first_array = {6.7f, 5.9f, 10, 23, 44, 4.6f, 9.1f};
		float [] second_array = {11, 12, 13, 14, 15, 16, 4.6f};
		float []b = new float [7];
		float []a = new float [7];
		boolean v =true;
		boolean w =false;
		b = SwapArrays(first_array, second_array, v );
		a = SwapArrays(first_array, second_array, w );
		for(int j=0; j<b.length; j++) {
			System.out.print(a[j]+ "  ");
			}
		System.out.println(" ");
			
		for(int q=0; q<a.length; q++) {
			System.out.print(b[q]+  "  ");		
		}
	}
	public static float [] SwapArrays(float []a , float[] b,boolean m) {
		float []c = new float [7];
		for(int i=0; i<a.length; i++) {
			if (a.length != b.length) {			//to check if arrays are not equal
				System.out.println("operation couldn’t be done");
			}
			if (a.length ==b.length) {    //copying a and b
				if (m==true) {			//copying array a 
				c[i] = a[i];
				}
				if (m==false) {			//copying array b
				c[i] = b[i];
				}				
			}
		}	
		return c;	
	}
}
