package slam4_sujet3_objMetier;

public class Vin {
	
	private int vin_num = -1;
	private int vin_milles;
	private String vin_qualite;
	Cru cruVin;
	
	
	
	public Vin(int vin_milles, String vin_qualite, Cru cruVin) {
		super();
		// TODO Auto-generated constructor stub
		
		this.vin_milles = vin_milles;
		this.vin_qualite = vin_qualite;
		this.cruVin = cruVin;
	}
	
	public Vin(int vin_num, int vin_milles, String vin_qualite, Cru cruVin) {
		super();
		// TODO Auto-generated constructor stub
		
		this.vin_num = vin_num;
		this.vin_milles = vin_milles;
		this.vin_qualite = vin_qualite;
		this.cruVin = cruVin;
	}
	

	public int getVin_num() {
		
		return vin_num;
		
	}
	

	public void setVin_num(int vin_num) {
		
		this.vin_num = vin_num;
		
	}
	

	public int getVin_milles() {
		
		return vin_milles;
		
	}
	

	public void setVin_milles(int vin_milles) {
		
		this.vin_milles = vin_milles;
		
	}
	

	public String getVin_qualite() {
		
		return vin_qualite;
		
	}
	

	public void setVin_qualite(String vin_qualite) {
		
		this.vin_qualite = vin_qualite;
		
	}

	public Cru getCru() {
		// TODO Auto-generated method stub
		return null;
	}

}
