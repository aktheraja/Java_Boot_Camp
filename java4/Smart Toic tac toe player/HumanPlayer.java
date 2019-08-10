
import java.util.Scanner;

public class HumanPlayer extends Player {
	private Board board;
	
	public HumanPlayer(String name, char p) {
		super(name, p);
	
	}
public void play() {
	if (( board.xWins()==false) &&(board.isFull()==false)&&(board.oWins()==false) ) {
	makeMove();}
}

public void makeMove() {
	
	System.out.print(" Player "+getMark()+ " :enter your row number  ");
	Scanner row1 = new Scanner(System.in);
	String row2=row1.nextLine();
	System.out.print(" Player "+getMark()+ " :enter your column number  ");
	Scanner column1 = new Scanner(System.in);
	String column2=column1.nextLine();
	int row = Integer.parseInt(row2);
	int col = Integer.parseInt(column2);
	board.addMark( row, col,getMark());
	board.display();
	if ((board.isFull()==true && board.xWins() == false && board.oWins() == false)){
		System.out.println("the game is the tie");
		}
		
}	
public void setBoard(Board theBoard) {
	board=theBoard;
}
}
