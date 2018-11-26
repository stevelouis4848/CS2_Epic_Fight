import java.util.Scanner;
import java.io.*;

public class CS2EpicFight {
	
	public static Scanner input = new Scanner(System.in);
	
	public static int fight_Duration;
	public static int xorvier_Num_Moves;
	public static int xorvier_Init_Stamina;
	public static int ruffus_Num_Moves;
	public static int ruffus_Init_Stamina;
	public static int[][] xorvier_Moves;
	public static int[][] ruffus_Moves;
	
	 public static void main(String[] args){
	    
        // Read in fight duration
	    fight_Duration = input.nextInt();
	    
	    // Read in Xovier info
	    xorvier_Num_Moves = input.nextInt();
	    xorvier_Init_Stamina =  input.nextInt();
	    
	    xorvier_Moves = new int[ xorvier_Num_Moves][2];
	    
	    for(int i  =  0; i <  xorvier_Num_Moves; i++){
	        
	        xorvier_Moves[i][0] = input.nextInt();
	        xorvier_Moves[i][1] = input.nextInt();
	    }
	    
	    // Read in Ruffus info
        ruffus_Num_Moves = input.nextInt();
	    ruffus_Init_Stamina =  input.nextInt();
	    
	   ruffus_Moves = new int[ruffus_Num_Moves][2];
	    
	    for(int i  =  0; i <  ruffus_Num_Moves; i++){
	        
	        ruffus_Moves[i][0] = input.nextInt();
	        ruffus_Moves[i][1] = input.nextInt();
	    }
	  
	    // Run the algorithm and print the output
	   // System.out.print(Algo());
	    
    }

	public static int Algo(){
	    
	    int fight_Variations;
    	int num_Moves_In_Fight;
    	int xorvier_Curr_Stamina;
    	int ruffus_Curr_Stamina;
    	
    	// The cost of the moves are instantenaous but the damages take 1 second.
    	// So the states would have to br checked after each move
    	// the amount of moves are the same just have to check and update states more often
    	// the fight cannot end prematurely on picking a move but can end prematurely if the opponent cost to himself or you have no options
		// Divide the length of the fight by 2 and round that up to get number of moves.
		int num_Moves_In_Fight = fight_Duration / 2;
		
		if( fight_Duration % 2  != 0 )
            num_Moves_In_Fight++;
     
		return 0;
	}
}
