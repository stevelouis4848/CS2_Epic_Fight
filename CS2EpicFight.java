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
	    
	    //arraylist of arraylist of size number of moves
	    // 2d array but inside size is all the moves for that position by index. is not know outside size is the number of movrs
	}
	
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
        int curr_State[][];
        int health_Xorvier[];
        int health_ruffus[];
        
    	// The cost of the moves are instantenaous but the damages take 1 second.
    	// So the states would have to br checked after each move
    	// the amount of moves are the same just have to check and update states more often
    	// the fight cannot end prematurely on picking a move but can end prematurely if the opponent cost to himself or you have no options
		// Divide the length of the fight by 2 and round that up to get number of moves.
		int num_Moves_In_Fight = fight_Duration / 2;
		
		if( fight_Duration % 2  != 0 )
            num_Moves_In_Fight++;
            
        // Structure to hold states 
        
        
        for(int i = 0; i < number_Moves_In_Fight; i++){
                
            for(int j = 0; j < xorvier_Num_Moves; j++){
                
                // pick a move for xorvier
                
                
                for(int k = 0; j < ruffus_Num_Moves; k++){
                    
                    // pick a move for ruffus
                    
                    // check if the state is possible if it is add it to our possible states
                    
                    if(i != number_Moves_In_Fight - 1){
                        
                        
                    }
                    else{
                        
                    }
                }
            }
        }
        
      
        
		return 0;
	}
	
	public static void Permute_Algo(int number_Moves, int current_Move, int number_Moves_Xorvier, int num_Moves_Ruffus){
	   
	    if(current_Move == number_Moves)
	        return;
	        
	    
       while(xavier_Current_Move <  number_Moves_Xorvier && ruffus_Number_Moves < num_Moves_Ruffus ){
           
           // choose a move for xavier
           
           
           // choose a move for ruffus
           
           
        }
        
        
	}
}
