
public class assignment6 {

	public static void main(String[] args) {
		int[]b = {3,5,4,20,10};
		boolean t =allUnique(b);
		if (t == true) {
			System.out.print("This array is unique:");
		}
		if (t == false) {
			System.out.print("This array is NOT unique:");
		}
	}
	public static boolean allUnique(int [] a) {
		
		for (int i = 0;i <a.length;i++) {		//to check if content of array is not same
			for (int j=i+1; j<a.length; j++) {			
				 if (a[i] == a[j]) {			//to check if content of array is same
				return false;}
			}	
		}
		return true;
	}	
}
