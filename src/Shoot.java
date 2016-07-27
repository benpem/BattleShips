import java.util.Scanner;

public class Shoot {
	static int hits;

	public static void userShoot(String[][] board, int shot)
    {
		
    Scanner input = new Scanner(System.in);
    int row,col;
   
    //Find where player wants to shoot
    System.out.println("You have: "+ shot +" shots left!");
    System.out.println("");
    System.out.println("Select a row to fire in: ");
    row = input.nextInt();
    System.out.println("");
    System.out.println("Select a column to fire in: ");
    col = input.nextInt();
	
    try{
    //Check if boat was there
	if(board[row][col].equals("#")){
		System.out.println("");
		System.out.println("HIT!");
		hits ++;
	}else{
		System.out.println("");
		System.out.println("MISS!");
	}
	
	//Change to represent shot
	board[row][col] = "*";

    }catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("You can not shoot here!");
    	
    }

    } 
	
	public void setHits(int hits){
		this.hits = hits;
	}
	
	public int getHits(){
		return hits;
	}
	
}
