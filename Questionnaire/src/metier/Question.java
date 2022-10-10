package metier;
import java.util.Arrays;
public class Question {
	private String titre;
	private String description;
	private float scor;
	
	private Reponse reponses[] = new Reponse[3];
	public Question(int nbReponses) {
		if(reponses.length <= 3) {
			this.titre = "";
			this.description = "";
			Reponse[] reponses=new Reponse[nbReponses];
			for(int i = 0; i < nbReponses ; i++){
				reponses[i] = new Reponse();
		    }
			this.reponses = reponses;
		}
		else {
			System.out.println("Le tableau des réponses doit contenir un maximum de 3 réponses.");
		}
	}
	public Question(String titre, String description, Reponse[] reponses) {
		if(reponses.length <= 3) {
			this.titre = titre;
			this.description = description;
			this.reponses = reponses;
		}
		else {
			System.out.println("Le tableau des réponses doit contenir un maximum de 3 réponses.");
		}
	}
	
	public Question(Question q) {
		if(q.reponses.length <= 3) {
			this.titre = q.titre;
			this.description = q.description;
			this.reponses = q.reponses;
		}
		else {
			System.out.println("Le tableau des réponses doit contenir un maximum de 2 réponses.");
		}
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getScor() {
		return scor;
	}

	public void setScor(float scor) {
		this.scor = scor;
	}

	public Reponse[] getReponses() {
		return reponses;
	}

	public void setR(Reponse[] reponses) {
		this.reponses = reponses;
	}

	@Override
	public String toString() {
		String str = new String("\t"+titre+"(scor : "+scor+")");
		for(Reponse rep : reponses) {
			str+="\n \t\t * "+rep.getTitre();
		}
		return str;
	}	
	
	public String getTrueReponse() {
		if(reponses.length > 0) {
			for(int i=0;i<reponses.length;i++) {
				if(reponses[i].getCorrecte()) {
					return reponses[i].getTitre();
				}
			}
		}
		return "Le tableau des réponses doit être non vide";
	}
	
	public int isTrueReponse(String reponse) {
		if(this.getTrueReponse().equals(reponse)) {
			return 1;
		}
		return 0;
	}
	}



