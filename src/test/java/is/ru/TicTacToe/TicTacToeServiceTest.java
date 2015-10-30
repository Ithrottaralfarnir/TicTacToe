package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeServiceTest{

  public static void main(String args[]) {
    org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeServiceTest");
  }
  
  private int SIZE_OF_BOARD = 3;

  @Test
  public void testInitializeBoard() {
        TicTacToeService service = new TicTacToeService();
        boolean allEmpty = true;
        for(int x = 0; x < SIZE_OF_BOARD; x++){
        	for(int y = 0; y < SIZE_OF_BOARD; y++){
        		if(service.getCell(x, y) != ' '){
        			allEmpty = false;
        		}
        	}
        }
        assertEquals(true, allEmpty);
  }
}
