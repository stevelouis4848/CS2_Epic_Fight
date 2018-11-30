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
	
	public static void State(){
	   
	    int xorvier_Stamina;
	    int ruffus_Stamina;
		int ruffus_Cost_Second_0;
		int xorvier_Cost_Second_0;
		int ruffus_Damage_Second_1;
		int xorvier_Damage_Second_1;
	    
		state(int a, int b, int c, int d){
			
			ruffus_Cost_Second_0 = a;
			xorvier_Cost_Second_0 = b;	
			
			ruffus_Damage_Second_1= c;
			xorvier_Damage_Second_1 = d;
		}
	}
	
	 public static void main(String[] args){
	    
		int ruffus_Cost_Damage;
		int xorvier_Cost_Damage;
		int[] intital_Ruffus_Cost;
		int[] intital_xorvier_Cost;
		int[] ruffus_Damage;
		int[] xorvier_Damage
		
		
        // Read in fight duration
	    fight_Duration = input.nextInt();
	    
	    // Read in Xovier info
	    xorvier_Num_Moves = input.nextInt();
	    xorvier_Init_Stamina = input.nextInt();
	    
	    xorvier_Moves = new int[ xorvier_Num_Moves][2];
		
		State[][] move_Combinations;
		
	    
	    for(int i = 0; i < xorvier_Num_Moves; i++){
	        
	        xorvier_Moves[i][0] = input.nextInt();
	        xorvier_Moves[i][1] = input.nextInt();
	    }
	    
	    // Read in Rufus info
        ruffus_Num_Moves = input.nextInt();
	    ruffus_Init_Stamina = input.nextInt();
	    
		ruffus_Moves = new int[ruffus_Num_Moves][2];
	    
	    for(int i = 0; i < ruffus_Num_Moves; i++){
	        
	        ruffus_Moves[i][0] = input.nextInt();
	        ruffus_Moves[i][1] = input.nextInt();
	    }
		
		// Calculating and storing the outcomes of all the 1 move combinations by themselves.
		move_Combinations = new State[ruffus_Num_Moves][xorvier_Num_Moves];
		MovesToCost
	  
		// Stores the states of every move in term of stamina after 0 and 1 second.
		for(int i = 0; i < ruffus_Num_Moves; i++){
			
			for(int j = 0; j < xorvier_Num_Moves; j++){
				
				ruffus_Cost_Second_0 = ruffus_Moves[i][0];
				xorvier_Cost_Second_0 = xorvier_Moves[j][0];
				
				ruffus_Damage_Second_1 = xorvier_Moves[j][1];			
				xorvier_Damage_Second_1 = ruffus_Moves[i][1];
				
				move_Combinations[i][j] = new State(ruffus_Cost_Second_0, xorvier_Cost_Second_0, 
					ruffus_Damage_Second_1, xorvier_Damage_Second_1);
			}
		}
		
	    // Run the algorithm and print the output
	   // System.out.print(Algo());
	    
    }

	public static int Algo(){
	    
	    int fight_Variations;
    	int num_Moves_In_Fight;
    	int xorvier_Curr_Stamina;
    	int ruffus_Curr_Stamina;
		int xorvier_Temp_Stamina;
    	int ruffus_Temp_Stamina;
        int curr_State[][];
        int health_Xorvier[];
        int health_ruffus[];
        int[] possible_Moves;
		
    	// The cost of the moves are instantenaous but the damages take 1 second.
    	// So the states would have to br checked after each move
    	// the amount of moves are the same just have to check and update states more often
    	// the fight cannot end prematurely on picking a move but can end prematurely if the opponent cost to himself or you have no options
		// Divide the length of the fight by 2 and round that up to get number of moves.
		int num_Moves_In_Fight = fight_Duration / 2;
		
		if( fight_Duration % 2  != 0 )
            num_Moves_In_Fight++;
            
		possible_Moves = new int [num_Moves_In_Fight];
        // Structure to hold states 
        
        
        for(int i = 0; i < number_Moves_In_Fight; i++){
                
            for(int j = 0; j < xorvier_Num_Moves; j++){
                
                // pick a move for xorvier
                             
                for(int k = 0; j < ruffus_Num_Moves; k++){
                    
                    // pick a move for ruffus
                    
                    // Store the info of that move combination
					
                }
            }
        }
        
      
        
		return 0;
	}
}
