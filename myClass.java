import javax.swing.JOptionPane;
public class myClass {
	public static void main (String[ ] args) {
		String userInput;
		String termDuration;
			userInput = JOptionPane.showInputDialog("is it open or closed mortage? ");
			termDuration = JOptionPane.showInputDialog("how many years? ");
				//int year = Integer.parseInt(termDuration);
		
			
if ((userInput.equals("open")) && (termDuration.equals("1")))
{
	System.out.println(" your mortgage rate is: 7.10%");
}
else if ((userInput.equals("open")) && (termDuration.equals("3"))) {
	System.out.println(" your mortgage rate is: 7.50%");
}
else if ((userInput.equals("open")) && (termDuration.equals("5"))) {
	System.out.println(" your mortgage rate is: Not Available");
}
else if ((userInput.equals("closed")) && (termDuration.equals("1")))
{
	System.out.println(" your mortgage rate is: 5.30%");
}
else if ((userInput.equals("closed")) && (termDuration.equals("3"))) {
	System.out.println(" your mortgage rate is: 5.00%");
}
else if ((userInput.equals("closed")) && (termDuration.equals("5"))) {
	System.out.println(" your mortgage rate is: 5.75%");
}
else {System.out.println(" error, please enter another input");}
}
	
} 