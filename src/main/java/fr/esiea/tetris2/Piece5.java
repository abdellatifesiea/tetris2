package fr.esiea.tetris2;


public class Piece5 {

	    public int orientation;
        public int[][] table5;
	    
	    public Piece5(int orientation , int [][] table) {
			this.orientation = orientation;
			this.table5 = table;
		}
	    
	    public Piece5( int [][] table) {
			this.table5 = table;
		}
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public void setTable(int [][] table) {
		       this.table5 = table;
		    }
		
		public int [][] getTable() {
	        return table5;
	    }
	    
	    
	    int [][] rotationt(int orientation , int[][] tab){
	    	 	
	    	if(orientation%4 == 0   ){
	    		tab[0][1] = 1;
	    		tab[1][1] = 1;
	    		tab[2][1] = 1;
	    		tab[2][2] = 0;
	    	    tab[2][3] = 0;
	    	    tab[0][3] = 0;
	    	    tab[1][3] = 0;
	    		tab[0][2] = 0;   			
	    	}	    				    		
	    	if(orientation%4 == 1  ){     
	    	    tab[0][1] = 0;
	    	    tab[1][1] = 0;
	    	    tab[2][1] = 1;
	    	    tab[2][2] = 1;
	    	    tab[2][3] = 1;
	    	    tab[0][3] = 0;
	    	    tab[1][3] = 0;
	    	    tab[0][2] = 0;
	       }
	    	if(orientation%4 == 2  ){
	    		 tab[0][1] = 0;
	    		 tab[1][1] = 0;
	    		 tab[2][1] = 0;
	    		 tab[2][2] = 0;
	    		 tab[2][3] = 1;
	    		 tab[0][3] = 1;
	    		 tab[1][3] = 1;
	    		 tab[0][2] = 0;  			
	    	}	    				    		
	    	if(orientation%4 == 3  ){     
	    		 tab[0][1] = 1;
	    		 tab[1][1] = 0;
	    		 tab[2][1] = 0;
	    		 tab[2][2] = 0;
	    		 tab[2][3] = 0;
	    		 tab[0][3] = 1;
	    		 tab[1][3] = 0;
	    		 tab[0][2] = 1;
	       }
	    	
		return tab;
	    			   
		    
      }
}

