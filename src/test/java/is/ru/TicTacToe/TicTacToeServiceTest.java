package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeServiceTest{

  public static void main(String args[]) {
    org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeServiceTest");
  }
 
	private TicTacToeService service = new TicTacToeService();
        private char board[][] = service.getBoard();
	private char currentPlayer;
	private int SIZE_OF_BOARD = 3;
        private final char PLAYER1 = 'X';
	private final char PLAYER2 = 'O';
	private final char EMPTY = ' ';
        
 
  @Test
  public void testInitializeBoard() {
        boolean allEmpty = true;
        for(int x = 0; x < SIZE_OF_BOARD; x++){
        	for(int y = 0; y < SIZE_OF_BOARD; y++){
        		if(board[x][y] != EMPTY){
        			allEmpty = false;
        		}
        	}
        }
        assertEquals(true, allEmpty);
  }
  
  @Test
  public void testGetCell() {
        board[1][2] = PLAYER1;        
        assertEquals(PLAYER1, service.getCell(1, 2));
  }
  
  @Test
  public void testSetCell() {
        service.setCell(0,0, PLAYER2);        
        assertEquals(PLAYER2, board[0][0]);
  }

  @Test
  public void testCelIsEmpty() {
        assertEquals(true, service.cellIsEmpty(0, 2));
  }

  @Test
  public void testCelIsNotEmpty() {
        board[0][2] = PLAYER2;
        assertEquals(false, service.cellIsEmpty(0, 2));
  }
}
