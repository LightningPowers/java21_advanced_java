import java.util.Scanner;

public class TicTacToe {

	String a1, a2, a3, b1, b2, b3, c1, c2, c3;
	String line = " -----";
	String playerTurn = "x";

	// Resets values of tiles
	public void clearScore() {
		a1 = " ";
		a2 = " ";
		a3 = " ";
		b1 = " ";
		b2 = " ";
		b3 = " ";
		c1 = " ";
		c2 = " ";
		c3 = " ";
	}

	public void changePlayer() {
		if (playerTurn.equals("x")) {
			playerTurn = "o";
		} else {
			playerTurn = "x";
		}

	}

	// Checks board if any player has reach win condition or draw
	public void whoWon() {
		String winString = playerTurn + " WON! \\n To play again";

		// Horizontal win
		if (a1.equals(playerTurn) && a2.equals(playerTurn) && a3.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		} else if (b1.equals(playerTurn) && b2.equals(playerTurn) && b3.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		} else if (c1.equals(playerTurn) && c2.equals(playerTurn) && c3.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		}

		// Vertical win
		else if (a1.equals(playerTurn) && b1.equals(playerTurn) && c1.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		} else if (a2.equals(playerTurn) && b2.equals(playerTurn) && c2.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		} else if (a3.equals(playerTurn) && b3.equals(playerTurn) && c3.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		}

		// Diagonal win
		else if (a1.equals(playerTurn) && b2.equals(playerTurn) && c3.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		} else if (a3.equals(playerTurn) && b2.equals(playerTurn) && c1.equals(playerTurn)) {
			System.out.println(winString);
			clearScore();
		}

		// Tie
		else if (!a1.equals(" ") && !a2.equals(" ") && !a3.equals(" ") && !b1.equals(" ") && !b2.equals(" ")
				&& !b3.equals(" ") && !c1.equals(" ") && !c2.equals(" ") && !c3.equals(" ")) {
			System.out.println(" IT'S A DRAW!\n To play again");
			clearScore();
		}

	}

	public void play() {
		while (true) {

			System.out.println(" choose spot for " + playerTurn + "");
			Scanner input = new Scanner(System.in);

			String playerInput = input.nextLine();
			switch (playerInput) {
			case "a1":
				a1 = playerTurn;
				changePlayer();
				break;

			case "a2":
				a2 = playerTurn;
				changePlayer();
				break;

			case "a3":
				a3 = playerTurn;
				changePlayer();
				break;

			case "b1":
				b1 = playerTurn;
				changePlayer();
				break;

			case "b2":
				b2 = playerTurn;
				changePlayer();
				break;

			case "b3":
				b3 = playerTurn;
				changePlayer();
				break;

			case "c1":
				c1 = playerTurn;
				changePlayer();
				break;

			case "c2":
				c2 = playerTurn;
				changePlayer();
				break;

			case "c3":
				c3 = playerTurn;
				changePlayer();
				break;

			default:
				System.out.println("Incorrect position, try another spot!");
			}

			printBoard();
			whoWon();
		}
	}

	// Renders the board
	public void printBoard() {
		System.out.println(" a |" + a1 + "|" + a2 + "|" + a3 + "|\n b |" + b1 + "|" + b2 + "|" + b3 + "|\n c |" + c1
				+ "|" + c2 + "|" + c3 + "|\n    1  2  3\n -----------");
	}

}
