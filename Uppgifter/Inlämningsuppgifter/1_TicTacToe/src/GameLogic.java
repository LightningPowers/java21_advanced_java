
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

	// Checks if move contains valid characters
	public boolean checkValidMove(String moveToCheck) {
		moveToCheck = moveToCheck.toUpperCase();

		String letterToCheck = moveToCheck.substring(0, 1);

		boolean isValid = letterToCheck.equals("A") || letterToCheck.equals("B") || letterToCheck.equals("C")
				|| letterToCheck.equals("D");

		if (!isValid) {
			System.out.println("Sorry, your move was invalid try again! Example: d3");
		}
		return isValid;
	}

}