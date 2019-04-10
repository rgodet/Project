/**
 * 
 */
package edu.lev.ymf.slam4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import edu.lev.ymf.slam4.bo.Adresse;
import edu.lev.ymf.slam4.bo.Personne;

/**
 * @author Yann M. FONTENOY
 *
 */
public class PersonneDAO extends ADAO<Personne> {

	String table = "Personne";
	
	@Override
	public boolean create(Personne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Personne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Personne obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Personne find(int id) {
		AdresseDAO addDao = new AdresseDAO();
		Personne per = null;
		Adresse tempoAdd = null;

		try {
			Statement stmt = this.connect.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM " + this.table + " WHERE id = " + id);

			if (result.first()) {
				tempoAdd = addDao.find(result.getInt("adresse"));
				per = new Personne(result.getInt("id"), result.getString("nom"), result.getString("prenom"), result.getDate("naissance"),
						tempoAdd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return per;
	}

	@Override
	public Vector<Personne> search() {
		Vector<Personne> res = new Vector<Personne>();
		AdresseDAO addDao = new AdresseDAO();
		Adresse tempoAdd = null;
		Personne tempo = null;

		try {
			Statement stmt = this.connect.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM " + this.table);

			while (result.next()) {
				tempoAdd = addDao.find(result.getInt("adresse"));
				tempo = new Personne(result.getInt("id"), result.getString("nom"), result.getString("prenom"),
						result.getDate("naissance"), tempoAdd);
				res.add(tempo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

}
