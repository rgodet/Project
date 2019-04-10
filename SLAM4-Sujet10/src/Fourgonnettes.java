
public class Fourgonnettes extends Vehicule{
	protected int vitesseMax;
	protected int vitesseCharge;
	protected int poidsMarchandise;

	public Fourgonnettes(String immatriculation, int anneeAchat) {
		
		super(immatriculation, 2000, anneeAchat);
		// TODO Auto-generated constructor stub
		
		this.vitesseMax = 110;
		this.vitesseCharge = 100;
		this.poidsMarchandise = 3000;
	}

	@Override
	public String toString() {
		return "Fourgonnettes [vitesse=" + vitesseMax + ", poidsMarchandise=" + poidsMarchandise + "vitesseCharge=" + vitesseCharge + "]";
	}
	
	public int vitesseMaximale() {
		if(getPoidsVide() > 2000) {
			return vitesseCharge;
		}
		else {
			return vitesseMax;
		}
	}

}
