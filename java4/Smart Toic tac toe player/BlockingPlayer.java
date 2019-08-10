

import java.util.Random;

public class BlockingPlayer extends RandomPlayer implements Constants {

	public BlockingPlayer(String name, char p) {
		super(name, p);
		// TODO Auto-generated constructor stub
	}
	public void play() {
		makeMove();
	}@Override
	public void makeMove() {

	boolean check = false;
			a:
			for (int col = 0;col<3 ;col++ ) {
				for (int row = 0; row<3;row++) {
			if(board.getMark(row, col)== SPACE_CHAR) {
				if (find(row,col)==true) {
					check =true;
				board.addMark(row, col, mark);
				board.display();
				break a;
				
				}	
				}}}
	if (check==false){super.makeMove();}}
	
	private boolean find(int row, int col) {
		boolean check = false;
		board.addMark(row, col, opponent.getMark());
		if (board.xWins()==true) {
		check= true;}
		if (board.xWins()==false) {
			check =false;}
		board.addMark(row, col, SPACE_CHAR);
		return check;

	}
	}
