package is.ru.TicTacToe;

public class TicTacToeUI{
TicTacToeService service = new TicTacToeService();
	
	public void displayBoard(){
		System.out.println("Current Tic-Tac-Toe status");
		System.out.print("--------------");
		System.out.println();
		System.out.println();
		for(int x = 0; x<3; x++){
			System.out.print("| ");
			for(int y = 0; y<3; y++){
				System.out.print(service.getCell(x, y) + " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("--------------");
		System.out.println();
	}
	public void greetingMessage(){
		System.out.println("         Welcome to the ultimate TicTacToe Game!");
		System.out.println("--------------------------------------------------------");
		System.out.println("TicTacToe is a game for two players, X and O,");
		System.out.println("who take turns marking the spaces in a 3x3 grid.");
		System.out.println("The player who succeeds in placing 3 of their marks in a");
		System.out.println("horizontal, vertical, or diagonal row wins the game.");
		System.out.println();
		System.out.println("Player one is X and player 2 is O");
		System.out.println("Player one starts");
		System.out.println();
		System.out.println("LET THE GAME BEGIN !");
		System.out.println();
		System.out.println();
	}

	public void invalidInputNumber(){
		System.out.println("The input you entered is not a number");
		System.out.println("Please enter a number");
	}
	
	public void invalidMove(){
		System.out.println("The move you made is invalid");
		System.out.println("Please try a move within the valid range");
	}
	
	public void invalidCellPosistion(){
		System.out.println("The cell you entered is occupied");
		System.out.println("Please try another cell");
	}
	public void winnerMessage(){
		char currentPlayer = service.getCurrentPlayer();
		boolean checkWinner = service.checkWinner();
		if(checkWinner){
			if(currentPlayer == 'X'){
				System.out.println("Congratulation Player 1 You Won !");
				System.out.println();
				}
			else{
				System.out.println("Congratulation Player 2 You Won !");
				System.out.println();
			}
		}
		else{
			System.out.println("Boring draw :/");
			System.out.println();
		}
	}
}
