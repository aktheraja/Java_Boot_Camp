



import java.util.Scanner;

abstract public class Player {

protected String name;
protected Board board;
protected Player opponent;
protected char mark;

//Player constructor to construct the xPlayer and oPlayer
public Player(String name, char p) {
	this.name=name;
	this.mark = p;
	
} public abstract void play();
//	makeMove();
//}
abstract void makeMove() ;
	// Getting input to from both players on console 
	//System.out.print(" Player "+getMark()+ " :enter your row number  ");
	//Scanner row1 = new Scanner(System.in);
	//String row2=row1.nextLine();
	//System.out.print(" Player "+getMark()+ " :enter your column number  ");
	//Scanner column1 = new Scanner(System.in);
	//String column2=column1.nextLine();
	//int row = Integer.parseInt(row2);
	//int col = Integer.parseInt(column2);
	//board.addMark( row, col,getMark());
	//board.display();

	
//}//Setting xPlayer opponent to oPlayer and vice versa

public void setOpponent(Player p) {
	opponent=p;
}
//Setting board to theBoard in Board
public void setBoard(Board theBoard) {
	board=theBoard;
}
public Player getOpponent() {
	return opponent;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public char getMark() {
	return mark;
}

public void setMark(char mark) {
	this.mark = mark;
}
}
