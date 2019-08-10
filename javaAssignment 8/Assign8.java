import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assign8 {
	
	public static void main (String [] args) throws IOException {
		if(args.length != 3){
            System.out.println("invalid arguments");
            System.exit(0);
        }
		BinTree tree = new BinTree();	
		String filename= args[0];
		try {
			File file = new File(filename+".txt"); 
			BufferedReader br = new BufferedReader(new FileReader(file));
		
			String st;
			while((st = br.readLine()) != null) {
				String StringClean = st.replaceAll("\\s+","");
				char operationcode = StringClean.charAt(0);
				String number = StringClean.substring(1, 8);
				int endline = 8;
				for(int i = 8; i < StringClean.length(); i++){
				    char ch = StringClean.charAt(i);
				    if(Character.isDigit(ch))
				    	break;
				    else 
				    	endline++;
				}
			    String name = StringClean.substring(8, endline);
			    String home = StringClean.substring(endline, endline + 4);
			    
			    int Start = endline + 4;
			    int End = endline + 4;
			    for(int i = Start; i < StringClean.length(); i++) {
			    	char c = StringClean.charAt(i);
			    	if(Character.isDigit(c))
			    		break;
			    	else
			    		End++;
			    }
			    String program = StringClean.substring(Start, End);
			    char year = StringClean.charAt(End);
				if(operationcode == 'I')		
					tree.insert(number, name, home, program, year);
				else if(operationcode =='D') {
					tree.delete(name);
					if(tree.delete(name))
						System.out.println("Unable to locate " + name);
				}
				else
					System.out.println("Invalid Operation Code");
			}
		
		} catch (IOException e) {
			System.out.println("File can not be found.");
			System.exit(1);
		}	
		tree.inOrder();
		Assign8 t = new Assign8();
		System.out.println("\n\n");
		tree.breadthFirst();
		t.printToFile(args[1],"In Order values\n" + tree.inOrder);
		t.printToFile(args[2],"Breath First values\n" + tree.BreadthFirst);
	}
	public  void printToFile(String filename, String t) {
		try {
			String Output=filename+".txt";
			File file = new File(Output);
		    BufferedWriter output = new BufferedWriter(new FileWriter(file));
		    output.write(t);
		    output.newLine();;
		    output.close();
		} catch (IOException e) {
			System.out.println("Error!writing to file can not be implemeted");
			System.exit(1);
		 	}
		}
}

