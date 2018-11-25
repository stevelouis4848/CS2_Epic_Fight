package Main_Code;

import java.util.Scanner;

public class CS2EpicFight {
	
	Scanner input = new Scanner();
	
	public static int fight_Duration;
	public static int xorvier_Num_Moves;
	public static int xorvier_Init_Stamina;
	public static int ruffus_Num_Moves;
	public static int ruffus_Init_Stamina;
	public static int[][] xorvier_Moves;
	public static int[][] ruffus_Moves;
	
	public void main(){
	    
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
	    
	    // Debugging input reading
	    System.out.print("fight duration: " + fight_Duration + "\n");
        System.out.print("xorvier number of moves: " + xorvier_Num_Moves + "\n");
        System.out.print("xorvier moves\n");
        for(int i  =  0; i <  xorvier_Num_Moves; i++){
    
	       System.out.print( xorvier_Moves[i][0] +  xorvier_Moves[i][1] + "\n");
	    }

        System.out.print("ruffus number of moves: " + ruffus_Num_Moves + "\n");
        System.out.print("ruffus moves\n");
        for(int i  =  0; i < ruffus_Num_Moves; i++){
    
	       System.out.print( ruffus_Moves[i][0] + ruffus_Moves[i][1] + "\n");
	    }
	    
	    // Run the algorithm and print the output
	   // System.out.print(Algo());
	    
    }

	public static int Algo(){
		// Take the time that the fight took divided by 2 and get number of moves each
		// You need enough time for the hits to affect so
		// Take possible moves to choose from and build a storage for the moves that get Ruffus defeated Xavier positive
		//  Personal stamina cost is instantaneous 
		// opponent stamina cost takes one second
		// opponent stamina and moves take place at the same time except for time 0.
		return 0;
	}
}
