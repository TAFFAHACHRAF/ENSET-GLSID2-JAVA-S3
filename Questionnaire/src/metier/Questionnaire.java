package metier;
import java.util.Arrays;

public class Questionnaire {
	private String titre;
	private Question questions[] = new Question[5];
	
	public Questionnaire(int nbQuestions,int nbReponses,String titre) {
		if(this.questions.length <= 5) {
			this.titre = "";
			Question[] questions=new Question[nbQuestions];
			for(int i = 0; i < nbQuestions ; i++){
				questions[i] = new Question(nbReponses);
		    }
			this.questions = questions;
			this.titre=titre;
		}
		else {
			System.out.println("Le tableau des questions doit contenir un maximum de 5 questions.");
		}
	}
	
	public Questionnaire(String titre, Question[] questions) {
		if(questions.length <= 5) {
			this.titre = titre;
			this.questions = questions;
		}
		else {
			System.out.println("Le tableau des questions doit contenir un maximum de 5 questions.");
		}
	}
	
	public Questionnaire(Questionnaire questionnaire) {
		if(questionnaire.questions.length <= 5) {
			this.titre = questionnaire.titre;
			this.questions = questionnaire.questions;
		}
		else {
			System.out.println("Le tableau des questions doit contenir un maximum de 5 questions.");
		}
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	
	@Override
	public String toString() {
		String str = new String(titre);
		str+="\n";
		int i=0;
		for(Question ques : questions) {
			str+=i+" - Question "+i+"\n";
			str+=ques.toString();
			i++;
		}
		return str;
	}
	
	public int getResult() {
		int result=0;
		for(int i=0;i<this.questions.length;i++) {
			result+=this.questions[i].getScor();
		}
		return result;
	}
	
	public void showTrueReponses() {
		if(this.questions.length > 0) {
			System.out.println("Correction : ");
			for(int i=0;i<this.questions.length;i++) {
				System.out.println("\t Question "+i+" : "+this.questions[i].getTrueReponse());
			}
		}
		else {
			System.out.println("Le tableau des réponses doit avoir la même longueur de tableau des questions.");
		}
	}
}
