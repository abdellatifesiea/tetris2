package fr.esiea.tetris2;



public class Piece7 {

	    public int orientation;
        public int[][] table7;
	    
	    public Piece7(int orientation , int [][] table) {
			this.orientation = orientation;
			this.table7 = table;
		}
	    
	    public Piece7(int [][] table) {
			this.table7 = table;
		}
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public void setTable(int [][] table) {
	       this.table7 = table;
	    }
		
		public int [][] getTable() {
	        return table7;
	    }
	    
		
	    
	   int [][] rotationt(int orientation , int[][] tab){
	    	 	
	    	if(orientation%4 == 0   ){
	    		tab[0][1] = 1;
	    	    tab[1][1] = 1;
	    	    tab[2][1] = 1;   
	    	    tab[0][2] = 0;
	    	    tab[1][2] = 0;
	    	    tab[2][2] = 1;
	    	    tab[1][3] = 0;
	    	    tab[2][3] = 0;   			
	    	}	    				    		
	    	if(orientation%4 == 1  ){     
	    		tab[0][1] = 0;
	    	    tab[1][1] = 0;
	    	    tab[2][1] = 1;   
	    	    tab[0][2] = 0;
	    	    tab[1][2] = 0;
	    	    tab[2][2] = 1;
	    	    tab[1][3] = 1;
	    	    tab[2][3] = 1;  
	       }
	    	if(orientation%4 == 2  ){
	    		tab[0][1] = 1;
	    	    tab[1][1] = 0;
	    	    tab[2][1] = 0;   
	    	    tab[0][2] = 1;
	    	    tab[1][2] = 1;
	    	    tab[2][2] = 1;
	    	    tab[1][3] = 0;
	    	    tab[2][3] = 0;  			
	    	}	    				    		
	    	if(orientation%4 == 3  ){     
	    		tab[0][1] = 0;
	    	    tab[1][1] = 1;
	    	    tab[2][1] = 1;   
	    	    tab[0][2] = 0;
	    	    tab[1][2] = 1;
	    	    tab[2][2] = 0;
	    	    tab[1][3] = 1;
	    	    tab[2][3] = 0;  
	       }
		   
		  return tab; 
      }
}

