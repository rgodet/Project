/**
 * 
 */
package edu.lev.ymf.slam4.swing;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;

import edu.lev.ymf.slam4.bo.Adresse;
import edu.lev.ymf.slam4.bo.Personne;
import edu.lev.ymf.slam4.dao.AdresseDAO;
import edu.lev.ymf.slam4.dao.PersonneDAO;

/**
 * @author ymf
 *
 */
public class VisuPersonnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame ecranPrincipal = new EcranVisuPersonne();

		// Pour vérifier le fonctionnement des DAO
		AdresseDAO temp = new AdresseDAO();
		Vector<Adresse> you = temp.search();
		Iterator<Adresse> it = you.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		PersonneDAO temp2 = new PersonneDAO();
		Vector<Personne> you2 = temp2.search();
		Iterator<Personne> it2 = you2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
