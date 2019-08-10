
public class AverageCalculator {

	public static void main(String[] args) {
		double n =0; 
		double sum = 0;
		System.out.print("The"+args.length+"numbers are");
		for (int i=0 ;i<args.length;i++) {
			n= Double.parseDouble(args[i]);
			sum = sum +n;
			
		}
		double	average = sum/(args.length);
		System.out.println("and their average is" +average);
}
}