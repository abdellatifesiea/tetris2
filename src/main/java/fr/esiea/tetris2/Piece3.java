package fr.esiea.tetris2;

public class Piece3 {
	    public int orientation;
        public int[][] table3;
	    
	    public Piece3(int orientation , int [][] table) {
			this.orientation = orientation;
			this.table3 = table;
		}
	    
	    public Piece3(int [][] table) {
			this.table3 = table;
		}
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public void setTable(int [][] table) {
		       this.table3 = table;
		    }
		
		public int [][] getTable() {
	        return table3;
	    }
	    
	    
	    int [][] rotationt(int orientation , int[][] tab){
	    	 	
	    	if(orientation%4 == 0 ||  orientation%4 == 2  ){
	    		 tab[0][0] = 0;
	    		 tab[0][2] = 0;
	    		 tab[0][3] = 0;
	    		 tab[1][1] = 1;
	    		 tab[2][1] = 1;
	    		 tab[3][1] = 1;    			
	    	}	    				    		
	    	if(orientation%4 == 1 ||  orientation%4 == 3  ){     
	    		tab[0][0] = 1;
	    		tab[0][2] = 1;
	    		tab[0][3] = 1;
	    		tab[1][1] = 0;
	    		tab[2][1] = 0;
	    		tab[3][1] = 0;
	       }
			return tab;	
	    
	    	
      }
}
