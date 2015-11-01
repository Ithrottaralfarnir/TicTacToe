package is.ru.TicTacToe;

import java.util.Scanner;

public class TicTacToeUI{

	private TicTacToeService service = new TicTacToeService();
	private int SIZE_OF_BOARD = 3;
	private final char PLAYER1 = 'X';	

	public void displayBoard(){
		System.out.println("Current Tic-Tac-Toe status");
		System.out.print("--------------");
		System.out.println();
		System.out.println();
		for(int x = 0; x < SIZE_OF_BOARD; x++){
			System.out.print("| ");
			for(int y = 0; y < SIZE_OF_BOARD; y++){
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
			if(currentPlayer == PLAYER1){
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

	public void startGame() {
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		String row;
		String column;
		String playAgain = "y";
		greetingMessage();
		do {
			while (true) {
				displayBoard();
				if (service.getCurrentPlayer() == PLAYER1) {
					System.out.println("Player1 make your move!");
				} else {
					System.out.println("Player2 make your move!");
				}

				System.out.println("Enter row number (0-2): ");
				row = in.nextLine();
				System.out.println("Enter column number (0-2): ");
				column = in.nextLine();

				// Check if input is a number
				if (service.inputIsANumber(row, column)) {
					x = Integer.parseInt(row);
					y = Integer.parseInt(column);
				} else {
					invalidInputNumber();
					continue;
				}
				// Check if the cell is within the board
				if (!service.inputIsValid(x, y)) {
					invalidMove();
					continue;
				}
				// Check if the cell is empty
				if (!service.cellIsEmpty(x, y)) {
					invalidCellPosistion();
					continue;
				} else {
					break;
				}
			}

			service.setCell(x, y, service.getCurrentPlayer());
			
			if (service.checkWinner() || service.isBoardFull()) {
				displayBoard();
				winnerMessage();
				System.out.println("Play again? (y/n)");
				playAgain = in.nextLine().toLowerCase();
				service.initializeBoard();
			} else {
				service.changePlayer();
			}
		} while(playAgain.equals("y") || playAgain.equals("yes"));
		
		in.close();
	}
}
