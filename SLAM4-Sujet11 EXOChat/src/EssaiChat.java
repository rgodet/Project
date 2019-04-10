import java.util.Random;

public class EssaiChat{

	public EssaiChat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		ListeAnimal listF = new ListeAnimal();
		
		for (int i = 0; i < 20; i++) {
			int n = r.nextInt(2);
			if (n > 0) {
				Chien chien1 = new Chien();
				listF.ajouteAnimal(chien1);
				
			}else {
				Chat chat1 = new Chat();
				listF.ajouteAnimal(chat1);
				
			}
		}
		
		for (int i = 0; i < listF.length(); i++) {
			Animal tempo = listF.get(i);
			tempo.action();
		}

	}

}
