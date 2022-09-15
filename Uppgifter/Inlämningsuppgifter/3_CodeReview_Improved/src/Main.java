
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n tic tac toe\n \n a |__|__|__|\n b |__|__|__|\n c |__|__|__|\n    1  2  3\n -------------");

		TicTacToe d = new TicTacToe();
		d.clearScore();
		d.play();
		
	}

}
