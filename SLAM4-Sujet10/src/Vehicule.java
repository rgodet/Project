
public class Vehicule {
	
	private String immatriculation;
	private int poidsVide;
	private int anneeAchat;

	public Vehicule(String immatriculation, int poidsVide, int anneeAchat) {
		// TODO Auto-generated constructor stub
		this.immatriculation = immatriculation;
		this.poidsVide = poidsVide;
		this.anneeAchat = anneeAchat;
	}

	@Override
	public String toString() {
		return "Vehicule [immatriculation=" + immatriculation + ", poidsVide=" + poidsVide + ", anneeAchat="
				+ anneeAchat + "]";
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public int getPoidsVide() {
		return poidsVide;
	}

	public void setPoidsVide(int poidsVide) {
		this.poidsVide = poidsVide;
	}

	public int getAnneeAchat() {
		return anneeAchat;
	}

	public void setAnneeAchat(int anneeAchat) {
		this.anneeAchat = anneeAchat;
	}

	public int vitesseMaximale() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
