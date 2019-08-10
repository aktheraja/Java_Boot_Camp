
import java.util.Random;
import java.util.Scanner;


public class RandomPlayer extends Player implements Constants {
	
	private RandomGenerator r;
	public RandomPlayer(String name, char p) {
		super(name, p);
		// TODO Auto-generated constructor stub
	}
	public void play() {
		makeMove();
	}
	public void makeMove() {
		 r = new RandomGenerator();
		while (true) {
		int row=r.discrete(0, 2);
			int col=r.discrete( 0,  2);
		if(board.getMark(row, col)== SPACE_CHAR&&board.getMark(row, col)!=LETTER_O &&board.getMark(row, col)!=LETTER_X){
			board.addMark(row, col, getMark());				
			board.display();
			break;}
		else  r = new RandomGenerator();
		}}

	public void setBoard(Board theBoard) {
		board=theBoard;
	}
	
	
}
