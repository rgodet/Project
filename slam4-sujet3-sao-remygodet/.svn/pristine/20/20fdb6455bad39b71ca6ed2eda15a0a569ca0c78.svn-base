package slam4_sujet3_DAO;



import java.sql.PreparedStatement;
import java.sql.SQLException;
import slam4_sujet3_objMetier.Client;

public class ClientDAO extends ConnectDAO<Client> {
	
	 /**
	 * 
	 */
	public ClientDAO() {
		 try {
			statement = getConnect().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Client find(int id) {
		Client client = null;
		try {	
			resulset =	statement.executeQuery("select * from client where cli_num = " + id);
			resulset.next();
			
			client = new Client(resulset.getInt("cli_num"), resulset.getString("cli_nom"));	
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return client;
	}

	@Override
	public boolean update(Client object) {
		try {
			PreparedStatement update =  getConnect().prepareStatement("update client set cli_nom = ? where cli_num = ? ");
			update.setString(1, object.getCli_nom());
			update.setInt(2, object.getCli_num());
			update.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
	
