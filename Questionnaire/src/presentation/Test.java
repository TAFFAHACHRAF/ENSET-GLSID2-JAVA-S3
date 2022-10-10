package presentation; import metier.Question; import metier.Questionnaire; import metier.Reponse; import java.util.Scanner;
public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nbQuestions,nbReponses;
		String titreQuestionnaire;
		
		System.out.print("Entrer svp le titre du questionnaire : ");
		titreQuestionnaire=sc.nextLine();
		titreQuestionnaire=sc.nextLine();
		
		System.out.print("Entrer svp le nombre des questions : ");
		nbQuestions=sc.nextInt();
		
		System.out.print("Entrer svp le nombre des réponses pour chaque question : ");
		nbReponses=sc.nextInt();
		
		
		Questionnaire questionnaire = new Questionnaire(nbQuestions,nbReponses,titreQuestionnaire);
		
		for(int q=0;q<nbQuestions;q++) {
			System.out.print("Entrer svp le titre de la question : ");
			questionnaire.getQuestions()[q].setTitre(sc.nextLine());
			questionnaire.getQuestions()[q].setTitre(sc.nextLine());
			System.out.print("Entrer svp la description de la question : ");
			questionnaire.getQuestions()[q].setDescription(sc.nextLine());
			questionnaire.getQuestions()[q].setDescription(sc.nextLine());
			for(int r=0;r<nbReponses;r++){
				System.out.print("Entrer svp une réponse qui conserne cette question : ");
				questionnaire.getQuestions()[q].getReponses()[r].setTitre(sc.nextLine());
				questionnaire.getQuestions()[q].getReponses()[r].setTitre(sc.nextLine());
				
				System.out.println("Cette réponse est correcte ? : (true ou bien false)");
				questionnaire.getQuestions()[q].getReponses()[r].setCorrecte(sc.nextBoolean());
			}
		}
		for(int i=0;i<questionnaire.getQuestions().length;i++) {
			System.out.println("\t \t "+questionnaire.getQuestions()[i].getTitre()+" : ");
			questionnaire.getQuestions()[i].setScor(questionnaire.getQuestions()[i].isTrueReponse(sc.nextLine()));
			questionnaire.getQuestions()[i].setScor(questionnaire.getQuestions()[i].isTrueReponse(sc.nextLine()));
		}
		System.out.println("Résultat : " +questionnaire.getResult()+"/"+questionnaire.getQuestions().length);
		questionnaire.showTrueReponses(); 
	}
}
