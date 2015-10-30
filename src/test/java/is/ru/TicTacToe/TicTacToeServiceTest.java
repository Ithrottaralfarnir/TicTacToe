package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeServiceTest{

  public static void main(String args[]) {
    org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeServiceTest");
  }
 
        private char board[][];
	private char currentPlayer;
	private int SIZE_OF_BOARD = 3;
	
	private final char PLAYER1 = 'X';
	private final char PLAYER2 = 'O';
	private final char EMPTY = ' ';

  @Test
  public void testInitializeBoard() {
        TicTacToeService service = new TicTacToeService();
        boolean allEmpty = true;
        board = service.getBoard();
        for(int x = 0; x < SIZE_OF_BOARD; x++){
        	for(int y = 0; y < SIZE_OF_BOARD; y++){
        		if(board[x][y] != ' '){
        			allEmpty = false;
        		}
        	}
        }
        assertEquals(true, allEmpty);
  }
  
  @Test
  public void testGetCell() {
        TicTacToeService service = new TicTacToeService();
        board = service.getBoard();
        board[1][2] = PLAYER1;        
        assertEquals(PLAYER1, service.getCell(1, 2));
  }
  
  @Test
  public void testSetCell() {
        TicTacToeService service = new TicTacToeService();
        board = service.getBoard();
        service.setCell(0,0, PLAYER2);        
        assertEquals(PLAYER2, board[0][0]);
  }

  @Test
  public void testCelIsEmpty() {
        TicTacToeService service = new TicTacToeService();
        assertEquals(true, service.cellIsEmpty(0, 2));
  }

  @Test
  public void testCelIsNotEmpty() {
        TicTacToeService service = new TicTacToeService();
        board = service.getBoard();
        board[0][2] = PLAYER2;
        assertEquals(false, service.cellIsEmpty(0, 2));
  }
}
