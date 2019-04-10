
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camions c1 = new Camions("TA 622 JX", 3000, 2000);			
		Camions c2 = new Camions("TB 455 UY", 5000, 2010);			
		Taxi t1 = new Taxi("RD 877 HG", 2000);
		Bus b1 = new Bus("TB 455 UY", 2005);
		
		
		Flotte f = new Flotte();
		//Ajout dans le tableau de vehicule
		f.ajouteVehicule(c1);
		f.ajouteVehicule(c2);
		f.ajouteVehicule(t1);
		f.ajouteVehicule(b1);
		f.ajouteVehicule(new Camions("ER 451 AU", 0, 2014));
		System.out.println(f);
	}

}
