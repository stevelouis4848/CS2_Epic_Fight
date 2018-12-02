import java.util.Scanner;
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
		int[][][] states;
		int ruffus_Curr_Stamina;
		int xorvier_Curr_Stamina;
		
		
        // Read in fight duration
	    fight_Duration = input.nextInt();
	    
	    // Read in Xovier info
	    xorvier_Num_Moves = input.nextInt();
	    xorvier_Init_Stamina = input.nextInt();
	    
	    xorvier_Moves = new int[ xorvier_Num_Moves][2];

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
		states = new int[2][ruffus_Init_Stamina + 1][xorvier_Init_Stamina + 1];
	    
		// Stores the states of every move in term of stamina after 0 and 1 second.
	
	    for(int i = 0; i < ruffus_Num_Moves; i++){
		    for(int j = 0; j < xorvier_Num_Moves; j++){
		    
    		    ruffus_Curr_Stamina = ruffus_Init_Stamina - ruffus_Moves[i][0];
    		    xorvier_Curr_Stamina = xorvier_Init_Stamina - xorvier_Moves[j][0];
    		
    		    if(ruffus_Curr_Stamina > ruffus_Init_Stamina)
    		        ruffus_Curr_Stamina = ruffus_Init_Stamina;
    		        
    		    if(xorvier_Curr_Stamina > xorvier_Init_Stamina)
    		        xorvier_Curr_Stamina = xorvier_Init_Stamina;
    		        
    		    if(ruffus_Curr_Stamina < 0)
    		        ruffus_Curr_Stamina = 0;
    		        
    		    if(xorvier_Curr_Stamina < 0)
    		        xorvier_Curr_Stamina = 0;
    		    
                states[0][ruffus_Curr_Stamina][xorvier_Curr_Stamina]++;
                
                if(ruffus_Curr_Stamina > 0 && xorvier_Curr_Stamina > 0){
                
                    ruffus_Curr_Stamina -= xorvier_Moves[j][1];
                    xorvier_Curr_Stamina -= ruffus_Moves[i][1];
                    
                    System.out.println("move[0]["+i+"]"+"["+j+"]: RS: "+ruffus_Curr_Stamina+" XS: "+xorvier_Curr_Stamina);
                    
    			    if(ruffus_Curr_Stamina > ruffus_Init_Stamina)
    			        ruffus_Curr_Stamina = ruffus_Init_Stamina;
    			        
    			    if(xorvier_Curr_Stamina > xorvier_Init_Stamina)
    			        xorvier_Curr_Stamina = xorvier_Init_Stamina;
    			        
    			    if(ruffus_Curr_Stamina < 0)
    			        ruffus_Curr_Stamina = 0;
    			        
    			    if(xorvier_Curr_Stamina < 0)
    			        xorvier_Curr_Stamina = 0;
                    
                	if(ruffus_Curr_Stamina > 0 && xorvier_Curr_Stamina > 0){
                	    
                	    states[1][ruffus_Curr_Stamina][xorvier_Curr_Stamina]++;
                	    System.out.println("move[1]["+i+"]"+"["+j+"]: RS: "+ruffus_Curr_Stamina+" XS: "+xorvier_Curr_Stamina);
                	}
                        
			}   }
			
		}
		
		System.out.print("number of ways to get to each stamina combo\n");
		  
		for(int h = 0; h < 2; h++){
    		for(int i = 0; i < ruffus_Init_Stamina; i++){
    			for(int j = 0; j < xorvier_Init_Stamina; j++){
    			    if(states[h][i][j] != 0){
                        System.out.println("["+h+"]"+"["+i+"]"+"["+j+"]: "+ states[h][i][j]);
    			    }
    			}
    		}
		}
		
	    // Run the algorithm and print the output
	   // System.out.print(Algo());
	    
    }
}
