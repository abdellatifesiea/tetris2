package fr.esiea.tetris2;


public class Piece1  {
	    public int orientation;
	    public int[][] table1;
	    
	    public Piece1(int orientation , int [][] table) {
			this.orientation = orientation;
			this.table1 = table;
		}
	    
	        
	    public Piece1(int [][] table) {
	    	this.table1 = table;
		}
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public void setTable(int [][] table) {
		       this.table1 = table;
		    }
		
		public int [][] getTable() {
			return table1;
	    }
	    
	    int [][] rotationt(int orientation , int[][] tab){
	    	 	
	    	if(orientation%4 == 0 ||  orientation%4 == 2  ){
	    			tab[0][1] = 1;
	    			tab[1][1] = 1;
	    			tab[1][3] = 0;
	    			tab[2][1] = 0;	    			
	    	}	    				    		
	    	if(orientation%4 == 1 ||  orientation%4 == 3  ){     
	    		    tab[0][1] = 0;
	    			tab[1][1] = 0;
	    			tab[1][3] = 1;
	    			tab[2][1] = 1;
	       }
	        	

			
			return tab;	    
      }


	    
	    public int Testret(int test[][],int i , int j) {
		
	    	if(test[i][j] == 1){
	    		return 1;    		
	    	}
	    	
	    	return 0;
	    }

		
}
