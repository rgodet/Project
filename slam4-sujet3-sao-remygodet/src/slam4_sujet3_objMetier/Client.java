package slam4_sujet3_objMetier;

public class Client {
	
	private int cli_num = -1;
	private String cli_nom;
	
	
	
	public Client(String cli_nom) {
		super();
		// TODO Auto-generated constructor stub
		
		this.cli_nom = cli_nom;
	}



	public Client(int cli_num, String cli_nom) {
		super();
		// TODO Auto-generated constructor stub
		
		this.cli_num = cli_num;
		this.cli_nom = cli_nom;
	}



	public int getCli_num() {
		return cli_num;
	}



	public void setCli_num(int cli_num) {
		this.cli_num = cli_num;
	}



	public String getCli_nom() {
		return cli_nom;
	}



	public void setCli_nom(String cli_nom) {
		this.cli_nom = cli_nom;
	}



	@Override
	public String toString() {
		return "Client [cli_num=" + cli_num + ", cli_nom=" + cli_nom + "]";
	}
	
	
	
	
	
	
	
	
	

}
