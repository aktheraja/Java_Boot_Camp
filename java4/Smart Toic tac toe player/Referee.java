



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
		while (true) {

		if ((board.xWins()==false &&(board.oWins()==false)&&board.isFull()==false)) {
			xPlayer.play();
		 if (board.xWins()==true) {
				System.out.println(xPlayer.getName()+" wins");
				break;}
			oPlayer.play();
		 if (board.oWins()==true) {
				System.out.println(oPlayer.getName()+" wins");
				break;}
			if ((board.isFull()==true && board.xWins() == false && board.oWins() == false)){
				System.out.println("the game is the tie");
				break;
			}
		
		}
		
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


