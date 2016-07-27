public class Game{
      
      public static void main(String[] arg){
		int size = 4;
		int player = 0;
		    	  
		//Number of shots
		int shot = 5;
		    	  
		//Create and Show board
    
		String[][] board = new String[8][8];
		Board.createBoard(board);
		Board.showBoard(board);
		Ship.createShip(board, size);
		
		         
		//Take shots
		while(Shoot.hits < size){
		Board.showBoard(board);
		Shoot.userShoot(board, shot);
		shot --;
           
            }
         Board.showBoard(board);
         System.out.println("");
         System.out.println("SHIP DESTROYED!");
         System.out.println("");
         System.out.println("GAME OVER!!");
      	}
          
      }
      