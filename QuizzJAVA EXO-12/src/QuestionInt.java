
public class QuestionInt  extends Question{
	

	public QuestionInt(String question, int reponse) {
		super(question, reponse);
	}


		@Override
		public boolean ValideReponse(Object reponse) {
			// TODO Auto-generated method stub
			return super.ValideReponse(Integer.parseInt((String)reponse));
		}
}
