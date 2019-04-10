package slam4_sujet3_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import slam4_sujet3_objMetier.Cru;

/**
 * @author $Author$
 * @version $Revision$
 *
 */

/**
 * 
 * @author rgodet
 * 
 * Object de connexion à la base de données
 *
 */

public abstract class ConnectDAO <T> {
	protected String url = "jdbc:postgresql://172.22.212.73/remy";
	protected String user = "siren";
	protected String pass = "siren";
	protected Connection connect = null;
	
	protected ResultSet resulset;
	protected Statement statement;
	
	
	public abstract T find(int id);
	
	public abstract boolean update(T object);

	public ConnectDAO() {
		try {
			this.connect = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("Connexion SGBD ouverte avec succes");
	}

	public boolean update(Cru object) {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected Connection getConnect() {
		// TODO Auto-generated method stub
		return connect;
	}

}
