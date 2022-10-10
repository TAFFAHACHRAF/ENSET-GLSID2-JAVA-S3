package metier;
public class Reponse {
	private String titre;
	private boolean correcte;
	
	public Reponse() {
		this.titre = "";
		this.correcte = false;
	}
	
	public Reponse(String titre, boolean correcte) {
		this.titre = titre;
		this.correcte = correcte;
	}
	
	public Reponse(Reponse r) {
		this.titre = r.titre;
		this.correcte = r.correcte;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public boolean getCorrecte() {
		return correcte;
	}
	public void setCorrecte(boolean correcte) {
		this.correcte = correcte;
	}

	@Override
	public String toString() {
		return "Réponse : "+titre;
	}
}
