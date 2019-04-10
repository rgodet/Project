/**
 * 
 */
package edu.lev.ymf.slam4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import edu.lev.ymf.slam4.bo.Adresse;

/**
 * @author ymf
 *
 */
public class AdresseDAO extends ADAO<Adresse> {

	String table = "Adresse";
	
	@Override
	public boolean create(Adresse obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Adresse obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Adresse obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Adresse find(int id) {
		Adresse add = null;

		try {
			Statement stmt = this.connect.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM " + this.table + " WHERE id = " + id);

			if (result.first()) {
				add = new Adresse(result.getInt("id"), result.getInt("num"), result.getString("rue"), result.getString("ville"),
						result.getString("cp"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return add;
	}

	@Override
	public Vector<Adresse> search() {
		Vector<Adresse> res = new Vector<Adresse>();
		
		Adresse tempo = null;

		try {
			Statement stmt = this.connect.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM " + this.table);

			while (result.next()) {
				tempo = new Adresse(result.getInt("id"), result.getInt("num"), result.getString("rue"), result.getString("ville"),
						result.getString("cp"));
				res.add(tempo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}

}
