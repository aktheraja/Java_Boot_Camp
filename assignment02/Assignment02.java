import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) 
	{multiDim();
	}
	public static void multiDim(){
		Scanner words = new Scanner(System.in);
		System.out.println("Enter the three sentences and press enter after each entry");
		String temp = words.nextLine();
		String temp1 = words.nextLine();
		String temp2 = words.nextLine();
		if (temp.length() > 60 || temp1.length() > 60 || temp2.length() > 60){
			System.out.println("You have entered more than 60 words");
			System.exit(0);}
		char[][] dimArray = new char[3][60];
		for (int i = 0; i < temp.length(); i++){
			dimArray[0][i] = temp.charAt(temp.length() - 1 - i);// getting the first array into multiDim
			}
		char[] x = temp1.toCharArray();					// getting the second
		char[] temp3 = new char[temp1.length()];
		int n = 0;
		for (int j = x.length - 1; j >= 0; j--){
			if (x[j] == ' '){							// checking for break 
				for(int k = j + 1; k < temp3.length; k++){
					if (x[k] != ' '){
						temp3[n] = x[k];
						n++;}
					else {
						break;}}
				n++;}
			}for (int i = 0; i < temp3.length; i++){
				if(x[i] != ' '){
					temp3[n] = x[i];
					n++;}
				else {
					break;}
			}
			for (int b = 0; b < temp3.length; b++)
				dimArray[1][b] = temp3[b];		
			for (int y = 0; y < temp2.length(); y++){
				if (y % 5 == 0 && temp2.charAt(y) != ' ')
					dimArray[2][y] = Character.toUpperCase(temp2.charAt(y));
				else
					dimArray[2][y] = temp2.charAt(y);
			}words.close();
		for (int row = 0; row < dimArray.length; row++){
			for (int column = 0; column < dimArray[row].length; column++){
				System.out.print(dimArray[row][column]);
			}
			System.out.println();
		}
	}
}
