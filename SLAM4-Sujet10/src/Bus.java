
public class Bus extends Vehicule{
	protected int passagerMax;
	protected int vitesseMax;

	public Bus(String immatriculation, int anneeAchat) {
		
		super(immatriculation, 20000, anneeAchat);
		
		// TODO Auto-generated constructor stub
		
		this.vitesseMax = 100;
		this.passagerMax = 50;
	}

	@Override
	public String toString() {
		return "Bus [passagerMax=" + passagerMax + ", vitesse=" + vitesseMax + "]";
	}

}
