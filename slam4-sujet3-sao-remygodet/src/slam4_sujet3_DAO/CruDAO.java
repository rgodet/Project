package slam4_sujet3_DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import slam4_sujet3_objMetier.Cru;
import slam4_sujet3_objMetier.Region;

public class CruDAO extends ConnectDAO<Cru> {

	public Cru find(int id) {
		Cru cru = null;
		
		
		try {	
			statement = getConnect().createStatement();
			resulset =	statement.executeQuery("SELECT * FROM cru WHERE cru_code = " + id);
			resulset.next();
		
			Region region = new RegionDAO().find(resulset.getInt("reg_num"));
			cru = new Cru(resulset.getInt(1), resulset.getString("cru_nom"),region);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cru;
	}

	@Override
	public boolean update(Cru object) {
		try {
			PreparedStatement update = getConnect().prepareStatement("UPDATE cru SET cru_nom = ?  WHERE cru_code = ? ");
			update.setString(1, object.getCru_nom());
			update.setInt(2, object.getCru_code());
			update.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}


}