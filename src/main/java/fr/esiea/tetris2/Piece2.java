package fr.esiea.tetris2;

public class Piece2 {
	    public int orientation;
        public int[][] table2;
	    
	    public Piece2(int orientation , int [][] table) {
			this.orientation = orientation;
			this.table2 = table;
		}
	    
	    public Piece2(int [][] table) {
			this.table2 = table;
		}
	    
	    public void setOrientation(int orientation) {
			this.orientation = orientation;
		}
        
		public int getOrientation() {
	        return orientation;
	    }
		
		public int [][] getTable() {
	        return table2;
	    }
	    
	      
}
