import java.util.ArrayList;
import java.util.Scanner;

public class ListeQuestion {
	
	private ArrayList<Question> listeQuestion = new ArrayList<Question>();

	public ListeQuestion() {
		// TODO Auto-generated constructor stub
	
	}
	
	 public void ajouteQuestion(Question q){
		 listeQuestion.add(q);
	 }

	@Override
	public String toString() {
		return "ListeQuestion [listeQuestion=" + listeQuestion + "]";
	}
	 
	 

	public void play() {
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < listeQuestion.size(); i++) {
			Question question =  listeQuestion.get(i);		
			System.out.println(question.getQuestion());			
			Object responseUser = scn.nextLine();
			
			if (question.ValideReponse(responseUser)) {
				System.out.println("Bonne réponse");
			}else {
				System.out.println("Mauvaise réponse");
			}
			
			
			
			
			
		}
		
	}
}
