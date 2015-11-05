package is.ru.TicTacToe;

public class TicTacToeService {
// Travi Traviss	
	private char board[][];
	private char currentPlayer;
	private int SIZE_OF_BOARD = 3;
	
	private final char PLAYER1 = 'X';
	private final char PLAYER2 = 'O';
	private final char EMPTY = ' ';
	
	public TicTacToeService(){
		board = new char[SIZE_OF_BOARD][SIZE_OF_BOARD];
		currentPlayer = PLAYER1;
		initializeBoard();
	}
	
	public void initializeBoard(){
		for(int x = 0; x < SIZE_OF_BOARD; x++){
			for(int y = 0; y < SIZE_OF_BOARD; y++){
				board[x][y] = EMPTY;
			}
		}
	}
	
	// For testing purposes
	public char[][] getBoard(){
		return board;
	}
	
	public char getCell(int x, int y){
		return board[x][y];
	}
	
	public void setCell(int x, int y, char player){
		board[x][y] = player;
	}
      
       public boolean cellIsEmpty(int x, int y){
		return board[x][y] == ' ';
	}

        public boolean inputIsValid(int x, int y){
		if(x < 0 || x > 2){
			return false;
		}
		if(y < 0 || y > 2)
		{
			return false;
		}
		return true;
	}

        public boolean inputIsANumber(String x, String y){
		try{
		    Integer.parseInt(x);
		    Integer.parseInt(x);
		}catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

	public char getCurrentPlayer(){
		return currentPlayer;
	}
        
        public void changePlayer(){
		if(getCurrentPlayer() == PLAYER1){
			currentPlayer = PLAYER2;
		}
		else{
			currentPlayer = PLAYER1;
		}
	}

                public boolean checkWinner(){	
		char player = PLAYER1;
		int numberOfPlayers = 2;
		// Check if any player has won
		for(int i = 0; i < numberOfPlayers; i++){
			// Check horizontal winner
			for(int x = 0; x < SIZE_OF_BOARD; x++){
				if(getCell(x, 0) == player && getCell(x, 1) == player && getCell(x, 2) == player){
					return true;
				}
			}
			// Check vertical winner
			for(int y = 0; y < SIZE_OF_BOARD; y++){
				if(getCell(0, y) == player && getCell(1, y) == player && getCell(2, y) == player){
					return true;
				}
			}
			
			// Check diagonal winner
			if(getCell(0, 0) == player && getCell(1, 1) == player && getCell(2, 2) == player){
				return true;
			}
			else if(getCell(2, 0) == player && getCell(1, 1) == player && getCell(0, 2) == player){
				return true;
			}
			
			player = PLAYER2;
		}		
		return false;
	}
   
	public boolean isBoardFull() {
		for (int x = 0; x < SIZE_OF_BOARD; x++) {
			for (int y = 0; y < SIZE_OF_BOARD; y++) {
				if (board[x][y] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
 
}

