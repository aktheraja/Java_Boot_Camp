

public class Referee {

	private Player xPlayer, oPlayer;
	Board board;
	
	
	public Referee() {
		
	}
	public void runTheGame() {
		xPlayer.setOpponent(getoPlayer());// Setting both xPlayer and oPlayer through the opponent 
		oPlayer.setOpponent(getxPlayer());// Setting both xPlayer and oPlayer through the opponent 
		System.out.println("Referee started the game...");
		board.display();
		while(true) {
			//conditional loop to check after each turn if any of the Players wins 
			if (( board.xWins()==false) &&(board.isFull()==false)&&(board.oWins()==false) ) {
		xPlayer.play();// xPlayer turn
			}if ((board.xWins()==true)) {
				System.out.println("THE GAME IS OVER: "+xPlayer.getName() +" is the winner!");
				System.out.println("Game Ended ...");
				break;
			}
		oPlayer.play();//oPlayer turn
		if(board.oWins()==true){
			System.out.println("THE GAME IS OVER: "+oPlayer.getName() +" is the winner!");
			System.out.println("Game Ended ...");
			break;
		}
		// to check if the both tie
		else if (board.isFull()==true){
			System.out.println("The game is a tie");
			break;}
			}

	}
	public void setBoard(Board b) {// this is to reference the board creted in Board class to board n Board
		board=b;
	}
	public Player getxPlayer() {
		return xPlayer;
	}
	public void setxPlayer(Player xPlayer) {
		this.xPlayer = xPlayer;
	}
	public Player getoPlayer() {
		return oPlayer;
	}
	public void setoPlayer(Player oPlayer) {
		this.oPlayer = oPlayer;
	}
	
}

