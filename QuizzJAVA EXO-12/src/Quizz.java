import java.util.ArrayList;
import java.util.List;

public class Quizz {
	
	private List<Question> listQ = new ArrayList<Question>();

	public Quizz(List<Question> listQ) {
		super();
		this.listQ = listQ;
	}

	public List<Question> getChoix() {
		return listQ;
	}

}
