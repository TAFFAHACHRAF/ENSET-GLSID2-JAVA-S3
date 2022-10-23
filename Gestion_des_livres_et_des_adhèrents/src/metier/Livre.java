package metier;

public class Livre {
	private int ISBN;
	private Auteur auteur;
	
	public Livre() {
		ISBN = 0;
		this.auteur = new Auteur();
	}
	public Livre(int iSBN, Auteur auteur) {
		ISBN = iSBN;
		this.auteur = auteur;
	}
	
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public void affiche() {
		System.out.print("[");
		auteur.Afficher();
		System.out.print(" ISBN=" + ISBN+"] -->Livre");
	}
}
