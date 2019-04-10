
public class Camions extends Vehicule{
	protected int vitesseMax;
	protected int vitesseChargeMax;
	protected int vitesseCharge;
	protected int poidsMarchandise;


	public Camions(String immatriculation, int poidsMarchandise, int anneeAchat) {
		
		super(immatriculation, 5000, anneeAchat);
		
		// TODO Auto-generated constructor stub
		
		this.vitesseMax = 110;
		this.vitesseChargeMax = 80;
		this.vitesseCharge = 90;
		this.poidsMarchandise = poidsMarchandise;
	}

	@Override
	public String toString() {
		return "Camions [vitesse= " + vitesseMax + "km/h , poidsMarchandise= " + poidsMarchandise + " kg, vitesseMaxAutorisé= " + vitesseMaximale() + " km/h ]";
	}
	
	public int vitesseMaximale() {
		if(poidsMarchandise >= 0 && poidsMarchandise <= 3000) {
			return vitesseCharge;
		}
		else if(poidsMarchandise > 3000) {
			return vitesseChargeMax;
		}
		else {
			return vitesseMax;
		}
		
	}

}
