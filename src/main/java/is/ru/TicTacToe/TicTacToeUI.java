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
}
