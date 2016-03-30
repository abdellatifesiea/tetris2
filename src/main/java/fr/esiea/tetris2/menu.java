package fr.esiea.tetris2;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.InputEvent;



//import java.util.Scanner;

public class menu  {

	public static void main(String[] args)  {
		
		Grille p = new Grille();
		int[][] s = p.Gril();
   
		p.Gril1(s);
		//int s1 = (int) (Math.random()*4);
		//int s2 = (int) (Math.random()*7);
		//System.out.println(s1 + "+" + s2);
       
			
		/*
		while( 1==1){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez taper un chiffre :");
		int str = sc.nextInt();
		*/

	    
	  int[][] tab3 = new int[][] { {1,1,1,1},{0,1,1,1},{1,1,1,0},{1,1,1,1} };

	   //  int[][] s = p.Gril();
		
	  // p.Gril1(s);
        
		Piece1 Pie = new Piece1(2,tab3 );
          tab3 = Pie.rotationt(1 ,Pie.getTable());
		
	     final int[][] mat = p.Gril();
		int[][] tabs = Pie.getTable();
		
		
		JFrame fenetre = new JFrame();	
	    //Définit un titre pour notre fenêtre
	    fenetre.setTitle("Ma première fenêtre Java");
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(400, 400);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    fenetre.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setContentPane(new Panneau());
	    fenetre.getContentPane().add(new JButton("DROITE"), BorderLayout.WEST);
	    //À l'est
	    fenetre.getContentPane().add(new JButton("GAUCHE"), BorderLayout.EAST);
	    //Et enfin, la rendre visible        
	    fenetre.setVisible(true);
	    
		
	    int[][] test = new int[12][12];
	    for( int x =10 ;x>=0; x--){
			for( int j =11 ;j>1; j--){
				if( test[x+1][j] == 0 ){
												
					mat[x+1][j] =  mat[x][j];
					mat[x][j]= 0;
								

				}//else {    return; }
			}			
		}
	    
	    
	    
		/*
		System.out.println("Programme en attente de réponse de l'utilisateur:");
        Scanner in = new Scanner(System.in);
        String resultat = "az";
        do{
            resultat = in.nextLine();
            if("".equals(resultat))
                System.out.println("Lancer l'action voulu !");
            else
                System.out.println("Lancer une autre action ou ne rien faire");
        }while(!"quitter".equals(resultat));
        System.out.println("Fin de programme.");

		
		*/
	/*	
		
		for( int i =0;i<4; i++){
			for( int j =0;j<4; j++){
				 mat[i][j+4] = tabs[i][j];
			}
		}
		
		
		for( int i =0;i<12; i++){
			for( int j =0;j<12; j++){
				if(mat[i][j]!= 0){
				System.out.print(mat[i][j]); 
				}else{System.out.print(" ");  }
			}System.out.print("\n");
		}
		
		
		final int[][] test = new int[12][12];
		
		for( int i =0;i<12; i++){
			for( int j =0;j<12; j++){
					test[i][j]=1;
			}
		}
		
		for( int i =0;i<11; i++){
			for( int j =1;j<11; j++){
					
				test[i][j]=0;
			}
		}
		
		
		
		
		for( int x =0;x<12; x++){
			for( int j =0;j<12; j++){
				if(mat[x][j]!= 0){
				System.out.print(test[x][j]); 

				}else{System.out.print(" ");  }

			}System.out.print("\n");
		
		}
		
*/
    /*
		Runnable r = new Runnable(){
			public void run() {
				for(int i=0; i < 100 ; i++   ){
					System.out.println();
					
				  try {
					Thread.sleep(1000);

					

					for( int x =0;x<12; x++){
						for( int j =0;j<12; j++){
							if(mat[x][j]!= 0){
							System.out.print(mat[x][j]); 

							}else{System.out.print(" ");  }
	
						}System.out.print("\n");
					
					}
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}		  	
			}			
		};	
		Thread t = new Thread(r,"toto");
		t.start();
		
		*/
		/*
		Runnable r = new Runnable(){
			public void run() {
				for(int i=0; i < 10 ; i++){
					System.out.println();
					
				  try {
					Thread.sleep(1000);
                  
					for( int x =11 ;x >=0; x--){
						for( int j =10 ;j>=0; j--){
							if( test[x][j+1] == 0 ){
															
								mat[x][j+1] =  mat[x][j];
								mat[x][j]= 0;
											

							}//else {    return; }
						}			
					}

					for( int x =0;x<12; x++){
						for( int j =0;j<12; j++){
							if(mat[x][j]!= 0){
							System.out.print(mat[x][j]); 

							}else{System.out.print(" ");  }
	
						}System.out.print("\n");
					
					}
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}		  	
			}			
		};	
		Thread t = new Thread(r,"toto");
		t.start();*/
		
		/*
		Runnable r = new Runnable(){
			public void run() {
				for(int i=0; i < 10 ; i++   ){
					System.out.println();
					
				  try {
					Thread.sleep(1000);
                  
					for( int x =0 ;x < 12; x++){
						for( int j =1 ;j< 11; j++){
							
							if( test[x][j-1] == 0 ){															
								mat[x][j-1] =  mat[x][j];
								mat[x][j]= 0;
											

							}//else {    return; }
						}			
					}

					for( int x =0;x<12; x++){
						for( int j =0;j<12; j++){
							if(mat[x][j]!= 0){
							System.out.print(mat[x][j]); 

							}else{System.out.print(" ");  }
	
						}System.out.print("\n");
					
					}
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}		  	
			}			
		};	
		Thread t = new Thread(r,"toto");
		t.start();
		
	    
	    x.addKeyListener(new KeyListener() {

	        public void keyTyped(KeyEvent e) {
	        }

	        public void keyPressed(KeyEvent e) {
	            if ( e.getKeyCode() == KeyEvent.VK_A)  {
	                System.out.println("woot!");
	            }
	        }

	        public void keyReleased(KeyEvent e) {
	        }
	    });
	
	
	*/
	    
	        fenetre.addKeyListener(
	    		new KeyListener(){

	    		public void keyPressed(KeyEvent e){
	    		System.out.println(e.getKeyCode() );
	    		if (e.getKeyCode() == KeyEvent.VK_UP){
	    		     System.out.print("ddddd");
	    		  }
	    		
	    		if (e.getKeyCode() == KeyEvent.VK_DOWN){
	    		     System.out.print("ffff");
	    		  }
	    		}
                
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
	    		
	    		}//keyListener 

	    		);
	
	
	}


}
