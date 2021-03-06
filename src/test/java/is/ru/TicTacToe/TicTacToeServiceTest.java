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

  @Test
  public void testInputIsValid() {
        assertEquals(true, service.inputIsValid(2, 2));
  }

  @Test
  public void testInputIsValid2() {
        assertEquals(true, service.inputIsValid(0, 0));
  }

  @Test
  public void testInputIsNotValidYToLarge() {
        assertEquals(false, service.inputIsValid(0, 3));
  }
  
  @Test
  public void testInputIsNotValidYToSmall() {
        assertEquals(false, service.inputIsValid(1, -1));
  }

  @Test
  public void testInputIsNotValidXToLarge() {
        assertEquals(false, service.inputIsValid(3, 2));
  }
  
  @Test
  public void testInputIsNotValidXToSmall() {
        assertEquals(false, service.inputIsValid(-1, 0));
  }
  
  @Test
  public void testInputIsANumber() {
        assertEquals(true, service.inputIsANumber("1", "2"));
  }

  @Test
  public void testInputIsNotANumber() {
        assertEquals(false, service.inputIsANumber("Seven", "7"));
  }

  @Test
  public void testGetCurrentPlayer() {
        assertEquals(PLAYER1, service.getCurrentPlayer());
  }

 @Test
 public void testChangePlayerToPLAYER1(){
  	service.changePlayer();
        service.changePlayer();
        assertEquals(PLAYER1, service.getCurrentPlayer());
  }	

  @Test
  public void testChangeToPLAYER2() {
	service.changePlayer();
        assertEquals(PLAYER2, service.getCurrentPlayer());
  }

  @Test
  public void testCheckWinnerHorizontalPLAYER1() {
	for(int y = 0; y < SIZE_OF_BOARD; y++){
          board[0][y] = PLAYER1;
        }
        assertEquals(true, service.checkWinner());
  }

  @Test
  public void testCheckWinnerHorizontalPLAYER2() {
	for(int y = 0; y < SIZE_OF_BOARD; y++){
          board[2][y] = PLAYER2;
        }
        assertEquals(true, service.checkWinner());
  }

  @Test
  public void testCheckNotWinnerHorizontal() {
	for(int y = 0; y < SIZE_OF_BOARD; y++){
          board[0][y] = PLAYER1;
        }
 	board[0][2] = PLAYER2;       
        assertEquals(false, service.checkWinner());
  }

  @Test
  public void testCheckWinnerVerticalPLAYER1() {
	for(int x = 0; x < SIZE_OF_BOARD; x++){
          board[x][1] = PLAYER1;
        }
        assertEquals(true, service.checkWinner());
  }

  @Test
  public void testCheckWinnerVerticalPLAYER2() {
	for(int x = 0; x < SIZE_OF_BOARD; x++){
          board[x][0] = PLAYER2;
        }
        assertEquals(true, service.checkWinner());
  }

  @Test
  public void testCheckNotWinnerVertical() {
	for(int x = 0; x < SIZE_OF_BOARD; x++){
          board[x][1] = PLAYER1;
        }
 	board[0][1] = PLAYER2;       
        assertEquals(false, service.checkWinner());
  }

  @Test
  public void testCheckWinnerDiagonal() {
        board[0][0] = PLAYER1;
        board[1][1] = PLAYER1;
        board[2][2] = PLAYER1;
        assertEquals(true, service.checkWinner());
  }


  @Test
  public void testCheckNotWinnerDiagonal() {
        board[0][0] = PLAYER1;
        board[1][1] = PLAYER1;
        board[2][2] = PLAYER2;
	assertEquals(false, service.checkWinner());
  }

  @Test
  public void testCheckWinnerDiagonal2() {
        board[2][0] = PLAYER2;
        board[1][1] = PLAYER2;
        board[0][2] = PLAYER2;
        assertEquals(true, service.checkWinner());
  }


  @Test
  public void testCheckNotWinnerDiagonal2() {
        board[2][0] = PLAYER1;
        board[1][1] = PLAYER1;
        board[0][2] = PLAYER2;
	assertEquals(false, service.checkWinner());
  }

  @Test
  public void testIsBoardFull() {
        for(int x = 0; x < SIZE_OF_BOARD; x++){
	  for(int y = 0; y < SIZE_OF_BOARD; y++){
	    board[x][y]	= PLAYER1;
          }
	}
	assertEquals(true, service.isBoardFull());
  }

  @Test
  public void testIsBoardNotFull() {
	assertEquals(false, service.isBoardFull());
  }

}
