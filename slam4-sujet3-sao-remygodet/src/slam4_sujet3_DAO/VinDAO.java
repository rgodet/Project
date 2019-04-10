package slam4_sujet3_DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import slam4_sujet3_objMetier.Cru;
import slam4_sujet3_objMetier.Vin;

public class VinDAO extends ConnectDAO<Vin> {

	@Override
	public Vin find(int id) {
		Vin vin = null;
		Cru cru = null;
		try {
			// Appelle singleton de la classe Mere 
			statement = getConnect().createStatement();
			resulset =	statement.executeQuery("select * from vin where vin_num = " + id);
			resulset.next();
			
			cru  = new CruDAO().find(resulset.getInt("cru_code"));
			vin = new Vin(resulset.getInt("vin_num"), resulset.getString("vin_milles"), cru);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vin;
	}

	@Override
	public boolean update(Vin object) {
		try {
			PreparedStatement update =  
					getConnect().prepareStatement("update vin set vin_milles = ?, vin_qualite = ?  where vin_num = ? ");
			update.setInt(1, object.getVin_milles());
			update.setString(2, object.getVin_qualite());
			update.setInt(3, object.getVin_num());
			update.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	
		return true;
	}

}