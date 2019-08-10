

public class SmartPlayer extends BlockingPlayer implements Constants {

	public SmartPlayer(String name, char p) {
		super(name, p);
	}

	public void play() {
		makeMove();
	}

	@Override
	public void makeMove() {

		boolean check = false;
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 3; row++) {
				if (board.getMark(row, col) == SPACE_CHAR) {
					if (find(row, col) == true) {
						check = true;
						board.addMark(row, col, mark);
						board.display();
						break;
					}
				}
			}
		}
		if (check == false) {
			super.makeMove();
		}
	}

	private boolean find(int row, int col) {
		boolean check = false;
		board.addMark(row, col, mark);
		if (board.xWins() == true) {
			check = true;
		}
		if (board.xWins() == false) {
			check = false;
		}
		board.addMark(row, col, SPACE_CHAR);
		return check;
	}
}
