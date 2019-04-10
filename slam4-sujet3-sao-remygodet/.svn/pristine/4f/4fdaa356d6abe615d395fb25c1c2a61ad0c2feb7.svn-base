package slam4_sujet3_DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import slam4_sujet3_objMetier.Region;




public class RegionDAO extends ConnectDAO<Region> {

	
	@Override
	public Region find(int id) {
		Region region = null;
		try {
			statement = getConnect().createStatement();
			resulset =	statement.executeQuery("select * from region where reg_num = " + id);
			resulset.next();
			
			region = new Region(resulset.getInt("reg_num"), resulset.getString("reg_nom"));	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return region;
	}

	@Override
	public boolean update(Region object) {
		try {
			PreparedStatement update = getConnect().prepareStatement("update region set reg_nom = ? where reg_num = ? ");
			update.setString(1, object.getReg_nom());
			update.setInt(2, object.getReg_num());
			update.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}


}