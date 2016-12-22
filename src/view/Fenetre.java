package IHM;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;

 
public class Fenetre extends JFrame {
  private static final Color DARK_GRAY = null;
private JPanel containerj1 = new JPanel();
  private JPanel containerj2 = new JPanel();
  private final JPanel panel = new JPanel();
  private JTextField txtpedro;
  private JTextField txtmichel;
  private final Action action = new SwingAction();
  private final Action action_1 = new SwingAction_1();

  public Fenetre(){
    this.setTitle("Bataille Navale");
    this.setSize(700, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    containerj1.setBackground(Color.lightGray);
    containerj1.setLayout(new BorderLayout());
    containerj2.setBackground(Color.lightGray);
    containerj2.setLayout(new BorderLayout());
    
    Font police = new Font("Arial", Font.BOLD, 14);
   // containerj1.add(top);
    //this.setContentPane(containerj1);
    //containerj2.add(top);
    
    
    JPanel bouton = new JPanel();
    bouton.setBackground(new Color(0, 0, 205));
    getContentPane().add(bouton, BorderLayout.SOUTH);
    JButton next = new JButton("Suivant");
    next.setBackground(new Color(128, 128, 128));
    JButton stop = new JButton("Annuler");
    next.setForeground(Color.BLACK);
    stop.setForeground(new Color(0, 0, 0));
    next.setPreferredSize(new Dimension(150, 30));
    stop.setPreferredSize(new Dimension(150, 30));
    stop.setBackground(new Color(128, 128, 128));
    stop.addActionListener(new ActionListener(){ 
    	   public void actionPerformed(ActionEvent e) { 
    	   	setDefaultCloseOperation(DISPOSE_ON_CLOSE);     
    	   }      
    	         }); 
    bouton.add(next, BorderLayout.CENTER);
    bouton.add(stop, BorderLayout.CENTER);
    panel.setBackground(new Color(30, 144, 255));
    
    getContentPane().add(panel, BorderLayout.CENTER);
    
    JLabel lblNomDuJoueur = new JLabel("Nom du joueur 1");
    panel.add(lblNomDuJoueur);
    
    txtpedro = new JTextField();
    txtpedro.setText("\"Pedro\"");
    panel.add(txtpedro);
    txtpedro.setColumns(10);
    
    JLabel lblNomDuJoueur_1 = new JLabel("Nom du joueur 2");
    panel.add(lblNomDuJoueur_1);
    
    txtmichel = new JTextField();
    txtmichel.setText("\"Jean Mi\"");
    panel.add(txtmichel);
    txtmichel.setColumns(10);
    
    
    this.setVisible(true);
    
    //this.setContentPane(new Panneau());
  }
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "JFrame.EXIT");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "JFrame.EXIT_ON_CLOSE");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
