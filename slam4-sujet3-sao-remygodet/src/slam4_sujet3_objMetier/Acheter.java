package slam4_sujet3_objMetier;

public class Acheter {

	
	private int sem_numero = -1;
	Client numCli;
	Vin numVin;
	private int ach_qte;
	
	
	public Acheter(Client numCli, Vin numVin, int ach_qte) {
		super();
		// TODO Auto-generated constructor stub
		
		this.numCli = numCli;
		this.numVin = numVin;
		this.ach_qte = ach_qte;
	}


	public Acheter(int sem_numero, Client numCli, Vin numVin, int ach_qte) {
		super();
		// TODO Auto-generated constructor stub
		
		this.sem_numero = sem_numero;
		this.numCli = numCli;
		this.numVin = numVin;
		this.ach_qte = ach_qte;
	}


	public int getSem_numero() {
		return sem_numero;
	}


	public void setSem_numero(int sem_numero) {
		this.sem_numero = sem_numero;
	}


	public int getAch_qte() {
		return ach_qte;
	}


	public void setAch_qte(int ach_qte) {
		this.ach_qte = ach_qte;
	}


	public Vin getVin() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getVin1() {
		// TODO Auto-generated method stub
		return null;
	}


	public Client getCli() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
