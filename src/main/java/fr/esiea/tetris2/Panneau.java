package fr.esiea.tetris2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


 
public class Panneau extends JPanel { 
    private void draw(Graphics g, int x, int y , int heigth , int width) {
	    Color color = Color.BLUE;
	    g.setColor(color);
	    g.fillRect(x , y , heigth, width);
	  }
	  
	  @Override
	  public void paint(Graphics g) {
	    super.paint(g);
	    Dimension size = getSize();
	    Grille p = new Grille();
		int[][] s = p.Gril();	      
		int[][] tab3 = new int[][] { {0,1,0,0},{0,1,1,0},{0,0,1,0},{0,0,0,0} };          
		Piece1 Pie = new Piece1(tab3);
		int[][] tabx=Pie.rotationt(2, tab3);
		int[][] tabs = Pie.getTable();
		 int px=30;
		 int py=50;	 
          
		    Gestion f = new Gestion();
		    f.copy(s, tabx);
			int[][] test = new int[12][12];
            f.debuttest(test);										  						  
		     for(int i=0; i <s.length; i++) {
				 for (int j = 0; j<s.length ; j++) {	  
						  if(s[i][j] == 1 ){						    		 					    	
						      draw(g, 10*j+px , 10*i+py, 8,8);
						   }	
				}		     
			}
	     }
	             
}
