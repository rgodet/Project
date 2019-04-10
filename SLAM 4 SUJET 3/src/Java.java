import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java {
		String Cli_Nom;
		String Cru_Nom;
		String Vin_Milles;
		String Vin_Qualite;
		String Reg_Nom;
		String Ach_Qte;
		
		
		public Java(String Cli_Nom, String Cru_Nom, String Vin_Milles, String Vin_Qualite, String Reg_Nom, String Ach_Qte) {
			this.Cli_Nom = Cli_Nom;
			this.Cru_Nom = Cru_Nom;
			this.Vin_Milles = Vin_Milles;
			this.Vin_Qualite = Vin_Qualite;
			this.Reg_Nom = Reg_Nom;
			this.Ach_Qte = Ach_Qte;
			
			
		}

		public String getCli_Nom() {
			return Cli_Nom;
		}

		public void setCli_Nom(String cli_Nom) {
			Cli_Nom = cli_Nom;
		}

		public String getCru_Nom() {
			return Cru_Nom;
		}

		public void setCru_Nom(String cru_Nom) {
			Cru_Nom = cru_Nom;
		}

		public String getVin_Milles() {
			return Vin_Milles;
		}

		public void setVin_Milles(String vin_Milles) {
			Vin_Milles = vin_Milles;
		}

		public String getVin_Qualite() {
			return Vin_Qualite;
		}

		public void setVin_Qualite(String vin_Qualite) {
			Vin_Qualite = vin_Qualite;
		}

		public String getReg_Nom() {
			return Reg_Nom;
		}

		public void setReg_Nom(String reg_Nom) {
			Reg_Nom = reg_Nom;
		}

		public String getAch_Qte() {
			return Ach_Qte;
		}

		public void setAch_Qte(String ach_Qte) {
			Ach_Qte = ach_Qte;
		}
		
	}