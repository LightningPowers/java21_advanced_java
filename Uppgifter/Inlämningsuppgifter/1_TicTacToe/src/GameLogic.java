
public class GameLogic {

	public String decideFirstMove() {
		String returnString = "";

		int randNum = (int) Math.round(Math.random());

		if (randNum == 0) {
			returnString = "Player1";
		} else {
			returnString = "Player2";
		}

		return returnString;
	}
}
