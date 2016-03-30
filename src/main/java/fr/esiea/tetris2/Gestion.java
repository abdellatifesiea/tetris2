package fr.esiea.tetris2;



public class Gestion {

	
	public int [][] Droite(int[][] tableau ,  int[][] tableur){
		 		
		return tableau;
		 	 
	}
	
	
	public int [][] copy(int [][]s, int [][]tabx ){
	 
	 for( int i =0;i<4; i++){
			for( int j =0;j<4; j++){
				 s[i][j+4] = tabx[i][j];
			}
		}		 
      return s;     
	} 
	
	public int [][] debuttest(int [][] test){

			for( int i =1;i<11; i++){
				for( int j =1;j<11; j++){						
					test[i][j]=0;
				}
			}		
	   return test;	 
	 }
	
	

    public int [][] cree_piece(){  	 	
    	
    	
    	int s = (int) (Math.random()*7); 	
    	
       int[][] tab1 = new int[][] {{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0} };
 	   int[][] tab2 = new int[][] {{0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0} }; 
 	   int[][] tab3 = new int[][] { {0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}};
 	   int[][] tab4 = new int[][] { {0,0,4,0},{0,4,4,0},{0,4,0,0},{0,0,0,0}};
 	   int[][] tab5 = new int[][] { {0,5,0,0},{0,5,5,0},{0,5,0,0},{0,0,0,0}};
       int[][] tab6 = new int[][] { {0,0,6,0},{0,0,6,0},{0,6,6,0},{0,0,0,0}};
 	   int[][] tab7 = new int[][] { {0,7,0,0},{0,7,0,0},{0,7,7,0},{0,0,0,0}};   	    	
 	   
		if ( s ==0 ){Piece1 A = new Piece1(tab1); }
		if ( s ==1 ){Piece2 B = new Piece2(tab2);  }
		if ( s ==2 ){Piece3 C = new Piece3(tab3);  }
		if ( s ==3 ){Piece4 D = new Piece4(tab4);  }
		if ( s ==4 ){Piece5 E = new Piece5(tab5);  }
		if ( s ==5 ){Piece6 F = new Piece6(tab6);  }
		if ( s ==6 ){Piece7 G = new Piece7(tab7);  }
		
		return tab7;		
		
	}

    
    
    



	
	
}