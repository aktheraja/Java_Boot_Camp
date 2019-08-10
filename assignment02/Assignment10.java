import java.util.ArrayList;
import java.util.Scanner;

public class Assignment10 {
	private static final int x = 0;
	public static void main(String[] args) {
		// Define two array lists here to store the names and the running times
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> time = new ArrayList<Integer>();
		String sin;
		Scanner scan = new Scanner(System.in);
		while (true)
		{
		System.out.println("Please enter the name of the participant");
		sin = scan.nextLine();		 // Read user input
		if(sin.toUpperCase().equals("QUIT"))
		break;
		names.add(sin);
		// Add the name to your ArrayList
		System.out.println("Please enter the running time of the participant");
		sin = scan.nextLine(); 		// Read user input
		int output = Integer.parseInt(sin);
		time.add(output);			// Add the running time to your array list
		}
		// Call the function findFastestRunner and pass the running times array list to it
		int idx = findFastestRunner(names, time); 
		// Print the name of the fastestrunner to the console
		System.out.println("The fatest runner is: "+ names.get(idx)); 
		System.out.println("And his run time is: "+ time.get(idx));
		scan.close();
		}
		
	public static int  findFastestRunner(ArrayList<String> name, ArrayList<Integer> tims) {
		for(int j=0; j<name.size();j++) {
			if (tims.get(j)<tims.get(j+1)){
				int x = j;
				return x;
			}
		}
		return 0;	
	}}