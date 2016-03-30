package fr.esiea.tetris2;


public class Piece4 {

	    public int orientation;
        public int[][] table4;
	    
	    public Piece4(int orientation , int [][] table) {
			this.orientation = orientation;
			this.table4 = table;
		}
	    
	    public Piece4( int [][] table) {
			this.table4 = table;
		}
	    
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public void setTable(int [][] table) {
		       this.table4 = table;
		    }
		
		public int [][] getTable() {
	        return table4;
	    }
	    
	    
	    int [][] rotationt(int orientation , int[][] tab){
	    	 	
	    	if(orientation%4 == 0 ||  orientation%4 == 2  ){
	    		 tab[0][2] = 1;
	    		 tab[2][1] = 1;
	    		 tab[2][2] = 0;
	    		 tab[2][3] = 0;    			
	    	}	    				    		
	    	if(orientation%4 == 1 ||  orientation%4 == 3  ){     
	    		tab[0][2] = 0;
	    	    tab[2][1] = 0;
	    	    tab[2][2] = 1;
	    	    tab[2][3] = 1;
	       }
			return tab;
	    	
	    			   
		    
      }
}
