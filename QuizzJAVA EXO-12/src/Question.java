import java.util.ArrayList;
 
import java.util.List;
 
 public abstract class Question {
	private String question;
	private Object reponse;
	
 
	public Question(String question, Object reponse) {
		super();
		this.question = question;
		this.reponse = reponse;
		
	}
 
	public String getQuestion() {
		return question;
	}
 
	public boolean ValideReponse(Object reponse) {
		return this.reponse.equals(reponse);
	}

	@Override
	public String toString() {
		return "Question" + question + ", reponse=" + reponse + "]";
	}
	
 
}
