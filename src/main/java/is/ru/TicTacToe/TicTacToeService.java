package is.ru.TicTacToe;

public class TicTacToeService {
	
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
	
	private void initializeBoard(){
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
}

