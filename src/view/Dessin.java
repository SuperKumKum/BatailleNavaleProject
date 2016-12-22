package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dessin extends JFrame{
	public Grille() {
		this.setSize(860, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    
	    
		JPanel C1 = new JPanel();
		C1.setLayout(new BoxLayout(C1, BoxLayout.LINE_AXIS));
	    C1.add(new JButton("Croisseur"));
	    C1.add(new JButton("Torpilleur"));
	    C1.add(new JButton("ContreTorpilleur"));
	    C1.add(new JButton("PorteAvion"));
	    C1.add(new JButton("SousMarin"));
	    
	    
	    
	    
	    JPanel C2 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C2.add(new Button(" "));	    	    
	    }
	    
	 
	    JPanel C3 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C3.add(new Button(" "));	    	    
	    }
	   
	    
	    JPanel C4 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C4.add(new Button(" "));	    	    
	    }
	   
	    JPanel C5 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C5.add(new Button(" "));	    	    
	    }
	    
	    
	    JPanel C6 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C6.add(new Button(" "));	    	    
	    }
	    
	    
	    JPanel C7 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C7.add(new Button(" "));	    	    
	    }
	    
	    
	    JPanel C8 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C8.add(new Button(" "));	    	    
	    }
	    
	    
	    JPanel C9 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C9.add(new Button(" "));	    	    
	    }
	   
	    
	    JPanel C10 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C10.add(new Button(" "));	    	    
	    }
	   
	    
	    JPanel C11 = new JPanel();	  
	    for(int i = 1; i <= 10 ;i++)
	    {  C11.add(new Button(" "));	    	    
	    }
	    
	    
	    
	    JPanel C12 = new JPanel();

	    C12.setLayout(new BoxLayout(C12, BoxLayout.PAGE_AXIS));
	    C12.add(C1);
	    C12.add(C2);
	    C12.add(C3);
	    C12.add(C4);
	    C12.add(C5);
	    C12.add(C6);
	    C12.add(C7);
	    C12.add(C8);
	    C12.add(C9);
	    C12.add(C10);
	    C12.add(C11);
	    
	    
	    this.getContentPane().add(C12);
	    this.setVisible(true);
	  }   
	}
	
