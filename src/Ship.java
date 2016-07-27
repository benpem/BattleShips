import java.util.Scanner;

public class Ship {
	
	public static void createShip(String[][] board,int size)
    {  
		
		Scanner input = new Scanner(System.in);
		int row, col;
		String pos;
		
		//Get position of boat from player
		System.out.println("Select row to place boat: ");
		row = input.nextInt();

		System.out.println("Select column to place boat: ");
		col = input.nextInt();
		
		System.out.println("Horizontal or Vertical? (H/V): ");
		pos = input.next();
		

		//Try to place ship on board
		try{
			if(pos.equals("h")){
				
				for(int i = 0; i < size; i++){
					
					board[row][col+i] = "#";}
				
			}else if(pos.equals("v")){
				
				for(int i = 0; i < size; i++){
					
					board[row+i][col] = "#";}	
				
			}
			
		//Catch error and restart boat placement
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You can not place your ship here!");
			Board.createBoard(board);
			Ship.createShip(board, 2);
		}
		}
}
