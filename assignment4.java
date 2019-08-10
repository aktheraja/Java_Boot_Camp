
public class assignment4 {
	public static void main(String[] args) {
		float [] arr = {6.7f, 5.9f,10,23,44,4.6f,9.1f,100,79};					//array
		float [] b = new float [10];
		int index = 3;						//index
		int value =255;						//value
		b=insertAt(arr,value,index);			//function
		for(int i=0; i<arr.length+1; i++) {
			System.out.print(b[i]+  "  ");			
		}
	}
	public static float [] insertAt(float [] a,int value, int idx) {
		float [] c = new float [10];
		 if (idx>a.length|| idx<0) {
			System.out.println("The operation can not be done");
			System.exit(0);
		}
		 else if ( idx<a.length&& idx>0) {
		for (int j=0;j<10;j++) {
			if (j<idx) {
				c[j] = a[j];
			}
			if (j==idx) {
				 c[3]= value;
			}
			if (j>idx) {
				c[j]=a[j-1];
			}		
		}	}
		
		return c ;	
	}		
}
