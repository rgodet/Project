import java.util.Scanner; 
import java.util.*;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionInt q1 = new QuestionInt("12 + 15 ?", 27);
		ListeQuestion listQ = new ListeQuestion();
		listQ.ajouteQuestion(q1);
		listQ.play();
	}

}
