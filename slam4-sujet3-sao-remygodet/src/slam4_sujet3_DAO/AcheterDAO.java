package slam4_sujet3_DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

import slam4_sujet3_objMetier.Acheter;
import slam4_sujet3_objMetier.Client;
import slam4_sujet3_objMetier.Vin;

public class AcheterDAO extends ConnectDAO<Acheter> {

	private Vector<Acheter> listAchat = new Vector<>();
	

	/* Va nous permettre de recuperer tous les objects
	 * (non-Javadoc)
	 * @see fr.dao.brand.ConnectDAO#find(java.lang.Object)
	 */
	public Vector<Acheter> findAllResult() throws SQLException {
		try {
			Client client;
			
			Vin vin;
			
			statement = getConnect().createStatement();
			resulset = statement.executeQuery("select * from acheter");
			
			while(resulset.next()) {
				client = new ClientDAO().find(resulset.getInt(1));
				vin = new VinDAO().find(resulset.getInt(2));
				
				listAchat.add(new Acheter(client, vin, resulset.getInt("sem_numero")));
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return listAchat;
	}

	@Override
	public boolean update(Acheter object) {
		try {
			PreparedStatement update = 
					getConnect().prepareStatement("update acheter set ach_qte = ?  where cli_num = ? and vin_num = ? and sem_numero = ?");
			
			update.setInt(1, object.getAch_qte());
			update.setInt(2, object.getCli().getCli_num());
			update.setInt(3, object.getVin().getVin_num());
			update.setInt(4, object.getSem_numero());
			
			update.executeUpdate();
			
			new VinDAO().update(object.getVin());
			new CruDAO().update(object.getVin().getCru());
			new RegionDAO().update(object.getVin().getCru().getRegion());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public Acheter find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}