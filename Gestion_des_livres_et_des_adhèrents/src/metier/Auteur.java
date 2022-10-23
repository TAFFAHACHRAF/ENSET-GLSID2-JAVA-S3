package metier;

public class Auteur extends Personne{
	private int numAuteur;

	public Auteur() {
		super();
		this.numAuteur = 0;
	}
	
	public Auteur(String nom, String email, String tel, int age,int numAuteur) {
		super(nom,email,tel,age);
		this.numAuteur = numAuteur;
	}

	public int getNumAuteur() {
		return numAuteur;
	}

	public void setNumAuteur(int numAuteur) {
		this.numAuteur = numAuteur;
	}
	
	public void Afficher() {
		System.out.print("[");
		super.Afficher();
		System.out.print(" numAuteur=" + numAuteur+" --> Auteur]");
	}
}
