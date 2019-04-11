import java.util.ArrayList;
 
import java.util.List;
 
 public abstract class Question {
	private String question;
	private Object reponse;
	
 
	public Question(String question, Object reponse) {
		super();
		this.question = question;
		this.setReponse(reponse);
		
	}
 
	public String getQuestion() {
		return question;
	}
 
	public boolean ValideReponse(Object reponse) {
		return this.getReponse().equals(reponse);
	}

	@Override
	public String toString() {
		return "Question" + question + ", reponse=" + getReponse() + "]";
	}

	public Object getReponse() {
		return reponse;
	}

	public void setReponse(Object reponse) {
		this.reponse = reponse;
	}
	
 
}
