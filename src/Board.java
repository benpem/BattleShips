import java.util.Scanner;

	public class Board
	   {
		//Create Scanner for input
	    Scanner input = new Scanner(System.in);
	      
	    //Create line break
	    public static void lineBreak()
	    {
	    	System.out.println("____________________________");
	    	System.out.println("");
	    }
	      
	      //Create board method
	      public static void createBoard(String[][] board)
	      {
	         for(int r = 0; r < board.length; r++)
	         {
	            for(int c = 0; c < board[0].length; c++)
	            {
	            	board[r][c] = "~";
	            }
	         }
	      }
	      
	      //Display board
	      public static void showBoard(String[][] board)
	      {
	         lineBreak();
	         System.out.println(" 0 1 2 3 4 5 6 7");
	         
	         for(int r = 0; r < board.length; r++)        
	         {
	            for(int c = 0; c < board[0].length; c++)
	               {               
	                     System.out.print(" "+board[r][c]);           
	               }
	               System.out.println("");
	         }
	         lineBreak();
	      }
	      
	
}
