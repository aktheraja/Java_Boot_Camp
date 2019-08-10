


import java.io.*;

//STUDENTS SHOULD ADD CLASS COMMENTS, METHOD COMMENTS, FIELD COMMENTS 


public class Game implements Constants {

	private Board theBoard;
	private Referee theRef;

	//To initiate the object theBoard	
    public Game( ) {
        theBoard  = new Board();
	}
   
    // method to appoint the referee
    public void appointReferee(Referee r) throws IOException {
        theRef = r;
    	theRef.runTheGame();
    }
	
	public static void main(String[] args) throws IOException {
		Referee theRef;
		Player xPlayer, oPlayer;
		BufferedReader stdin;
		Game theGame = new Game();//constructng an object of type Game
		stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nPlease enter the name of the \'X\' player: ");//getting name from the console for xPlayer
		String name= stdin.readLine();
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}

		xPlayer = new Player(name, LETTER_X);//constructing and initializing xPlayer with name and mark
		xPlayer.setBoard(theGame.theBoard);//setting the board to the board in Player class for object xPlayer
		
		System.out.print("\nPlease enter the name of the \'O\' player: ");
		name = stdin.readLine();
		while (name == null) {
			System.out.print("Please try again: ");
			name = stdin.readLine();
		}
		
		oPlayer = new Player(name, LETTER_O);//constructing and initializing oPlayer
		oPlayer.setBoard(theGame.theBoard);//setting the board to the board in Player class for object oPlayer
		
		theRef = new Referee();//constructing theRef 
		theRef.setBoard(theGame.theBoard);//setting the board in referee class
		theRef.setoPlayer(oPlayer);//setting the oPlayer
		theRef.setxPlayer(xPlayer);//setting xPlayer
        
        theGame.appointReferee(theRef);//appointing theRef for the class Game
	}
	

}

