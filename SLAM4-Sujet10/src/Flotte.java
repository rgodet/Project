import java.util.ArrayList;

public class Flotte {
	
	 private ArrayList<Vehicule> flotte;
	 private boolean convoi;
	 
	 public Flotte(){	 
		 //tableau de vehicule
		 flotte = new ArrayList<Vehicule>();
		 
	 }
	 
	 //Fonction permettant d'ajouter un vehicule
	 public void ajouteVehicule(Vehicule v){
		 flotte.add(v);
	 }

	 
	
	 
	public int vitesseFlotte(){
		 if (!convoi) {
			 return 0;
		 }
		 
		 int vitesse;

		 int min = flotte.get(0).vitesseMaximale();
		 
		 for(int i = 0; i < flotte.size(); i++){
			 vitesse = flotte.get(i).vitesseMaximale();
			 if (vitesse < min) {
				 min = vitesse; 
			 }
			 
		 }

		 return min;

		 }
	// Fonction TO STRING qui affiche la flotte
	 @Override
	 public String toString(){
		 String res="Flotte de " + flotte.size() + " véhicules\n";
		 
		 for(int i = 0; i < flotte.size(); i++) {
			 res += flotte.get(i).toString() + "\n";
		 }
		 return res;
	 }
		
}