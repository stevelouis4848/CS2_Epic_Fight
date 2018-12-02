import java.util.*;
import java.io.*;

public class Main {
	
	public static Scanner input = new Scanner(System.in);
	
	public static int fight_Duration;
	public static int xorvier_Num_Moves;
	public static int xorvier_Init_Stamina;
	public static int ruffus_Num_Moves;
	public static int ruffus_Init_Stamina;
	public static int[][] xorvier_Moves;
	public static int[][] ruffus_Moves;
	
	
	 public static void main(String[] args){
	    
		int ruffus_Cost_Damage;
		int xorvier_Cost_Damage;
		int[] intital_Ruffus_Cost;
		int[] intital_xorvier_Cost;
		int[] ruffus_Damage;
		int[] xorvier_Damage;
		int[][][] nextstate;
		int[][][] currentstate;
		int ruffus_Curr_Stamina;
		int xorvier_Curr_Stamina;
		
		
        // Read in fight duration
	    fight_Duration = input.nextInt();
	    
	    // Read in Xovier info
	    xorvier_Num_Moves = input.nextInt();
	    xorvier_Init_Stamina = input.nextInt();
	    
	    xorvier_Moves = new int[xorvier_Num_Moves][2];

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
		
		int second = 0;
		// Calculating and storing the outcomes of all the 1 move combinations by themselves.
		nextstate = new int[2][ruffus_Init_Stamina + 1][xorvier_Init_Stamina + 1];
		currentstate = new int[2][ruffus_Init_Stamina + 1][xorvier_Init_Stamina + 1];
	    
        
        while(second <= fight_Duration){
        
            for(int i = 0; i < ruffus_Init_Stamina; i++){
                for(int j = 0; j < xorvier_Init_Stamina; j++){
                    
                    for(int k = 0; k < ruffus_Num_Moves; k++){
                        for(int l = 0; l < xorvier_Num_Moves; l++){
                            
                    	    ruffus_Curr_Stamina = i - ruffus_Moves[k][0];
                    	    xorvier_Curr_Stamina = j - xorvier_Moves[l][0];
                    	
                    	    if(ruffus_Curr_Stamina > ruffus_Init_Stamina)
                    	        ruffus_Curr_Stamina = ruffus_Init_Stamina;
                    	        
                    	    if(xorvier_Curr_Stamina > xorvier_Init_Stamina)
                    	        xorvier_Curr_Stamina = xorvier_Init_Stamina;
                    	        
                    	    if(ruffus_Curr_Stamina < 0)
                    	        ruffus_Curr_Stamina = 0;
                    	        
                    	    if(xorvier_Curr_Stamina < 0)
                    	        xorvier_Curr_Stamina = 0;
                    	    
                            nextstate[0][ruffus_Curr_Stamina][xorvier_Curr_Stamina] += currentstate[1][i][j];
                            
                            if(ruffus_Curr_Stamina > 0 && xorvier_Curr_Stamina > 0){
                                
                                ruffus_Curr_Stamina -= xorvier_Moves[l][1];
                                xorvier_Curr_Stamina -= ruffus_Moves[k][1];
                                
                    		    if(ruffus_Curr_Stamina > ruffus_Init_Stamina)
                    		        ruffus_Curr_Stamina = ruffus_Init_Stamina;
                    		        
                    		    if(xorvier_Curr_Stamina > xorvier_Init_Stamina)
                    		        xorvier_Curr_Stamina = xorvier_Init_Stamina;
                    		        
                    		    if(ruffus_Curr_Stamina < 0)
                    		        ruffus_Curr_Stamina = 0;
                    		        
                    		    if(xorvier_Curr_Stamina < 0)
                    		        xorvier_Curr_Stamina = 0;
                                
                            	if(ruffus_Curr_Stamina >= 0 && xorvier_Curr_Stamina > 0){
                            	    
                            	    nextstate[1][ruffus_Curr_Stamina][xorvier_Curr_Stamina] +=  nextstate[0][ruffus_Curr_Stamina][xorvier_Curr_Stamina];
                           
                        	    }
                        	    second++;
                        	    
                            }
                            
                        } 
                        
                    }
                
                }
            }
            
            //printTables(currentstate, nextstate);
            
            currentstate = nextstate;
        }
    	 
      printSolution(currentstate, fight_Duration %2);	
        	    
    }
  
    public static void printSolution(int[][][] currentstate,int second){
        
        int ans = 0;
        
        for(int i = 0; i < xorvier_Init_Stamina; i++){
            ans += currentstate[second][0][i];
        }
        
        System.out.print(ans);
        System.exit(0);
    }
    
}
