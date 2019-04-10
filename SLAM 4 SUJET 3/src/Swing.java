import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Swing {
	
	
	String Cli_Nom;
	String Cru_Nom;
	String Vin_Milles;
	String Vin_Qualite;
	String Reg_Nom;
	String Ach_Qte;
	
	public Swing(String Cli_Nom, String Cru_Nom, String Vin_Milles, String Vin_Qualite, String Reg_Nom,
			String Ach_Qte) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] argv) {
		JFrame fenetre = new JFrame();
		//fenetre.setVisible(true);
		fenetre.setSize(400, 400);
		fenetre.setTitle("Swing connect to BDD");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		
		fenetre.setLayout(new BorderLayout());
		//fenetre.setLayout(new FlowLayout());
		
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout());
		
		JTextField text = new JTextField("");
		text.setPreferredSize(new Dimension(200, 20));
		pan.add(text);
		
		fenetre.getContentPane().add(pan , BorderLayout.NORTH);
		
		JButton bouton = new JButton("Search");
		pan.add(bouton);
		
	    Object[][] data = {
	    	      {"", "", "", "", "", ""},
	    	      {"", "", "", "", "", ""},
	    	      {"", "", "", "", "", ""},
	    	      {"", "", "", "", "", ""}
	    	    };

	    	    JTable tableau = new JTable();
	    	    fenetre.getContentPane().add(tableau , BorderLayout.CENTER);
	    	    fenetre.getContentPane().add(new JScrollPane(tableau));
		

		
		
		fenetre.pack();
		fenetre.setVisible(true);
	}
	
	
	
	

}
