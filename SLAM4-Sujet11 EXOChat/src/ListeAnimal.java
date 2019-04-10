import java.util.ArrayList;

public class ListeAnimal {
	
	private ArrayList<Animal> listeAnimal;
	

	public ListeAnimal() {
		// TODO Auto-generated constructor stub
		listeAnimal = new ArrayList<Animal>();
	}
	
	 public void ajouteAnimal(Animal a){
		 listeAnimal.add(a);
	 }

	@Override
	public String toString() {
		return "ListeAnimal [listeAnimal=" + listeAnimal + "]";
	}

	public int length() {
		// TODO Auto-generated method stub
		return listeAnimal.size();
	}

	public Animal get(int i) {
		// TODO Auto-generated method stub
		return listeAnimal.get(i);
	}
	 
	 

}