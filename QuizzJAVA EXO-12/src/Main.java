import java.util.Scanner; 
import java.util.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionInt q1 = new QuestionInt("12 + 15 ?", 27);
		QuestionChar q2 = new QuestionChar("Quelle satellite naturel gravite autour de la terre ?", "lune");
		QuestionInt q3 = new QuestionInt("4717 * 2 ?", 9434);
		QuestionChar q4 = new QuestionChar("Quelle couleur sont les lunettes d'enzo", "noir");
		ListeQuestion listQ = new ListeQuestion();
		listQ.ajouteQuestion(q1);
		listQ.ajouteQuestion(q2);
		listQ.ajouteQuestion(q3);
		listQ.ajouteQuestion(q4);
		listQ.play();
	}
	
}
