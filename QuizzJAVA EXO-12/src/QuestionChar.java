public class QuestionChar  extends Question{
	

	public QuestionChar(String question, String reponse) {
		super(question, reponse);
	}


		@Override
		public boolean ValideReponse(Object reponse) {
			// TODO Auto-generated method stub
			return super.getReponse().equals(reponse);
		}
}
