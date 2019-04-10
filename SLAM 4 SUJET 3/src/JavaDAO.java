import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaDAO {
	String url = "jdbc:postgresql://172.22.212.73:3306/remy";
	String user = "siren";
	String password = "siren";
	Connection cnx = null;

	public JavaDAO(String url, String user, String password) {
	
	try {
		cnx = DriverManager.getConnection(url, user, password);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
}