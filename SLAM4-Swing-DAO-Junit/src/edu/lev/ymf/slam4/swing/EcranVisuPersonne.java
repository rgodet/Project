/**
 * 
 */
package edu.lev.ymf.slam4.swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Yann M. FONTENOY
 *
 */
public class EcranVisuPersonne extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7078780559207967851L;
	private PersonnesModelJtable mod = new PersonnesModelJtable();
	
	
	/**
	 * 
	 */
	public EcranVisuPersonne() {
		super("Mon appli de Visu Personnes");
		
		JTable table = new JTable(mod);

//      table.setMo
		this.add(new JScrollPane(table));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	

}
