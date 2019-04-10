
public class Taxi extends Vehicule{
	protected int passagerMax;
	protected int vitesseMax;

	public Taxi(String immatriculation, int anneeAchat) {
		
		super(immatriculation, 4000, anneeAchat);
		
		// TODO Auto-generated constructor stub
		
		this.vitesseMax = 130;
		this.passagerMax = 4;
	}

	@Override
	public String toString() {
		return "Taxi [poids= " + getPoidsVide() + "kg , immatriculation= " + getImmatriculation() + ", vitesseMax= " + vitesseMax + " km/h ]";
	}

}