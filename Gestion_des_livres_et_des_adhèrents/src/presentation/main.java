package presentation;

import metier.Adherent;
import metier.Auteur;
import metier.Livre;

public class main {
	public static void main(String args[]) {
		Auteur auteur = new Auteur("Achraf taffah","taffahachraf184@gmail.com","0684134782",22,78946521);
		Adherent adherent = new Adherent("Ahmed erraoui","ahmed@gmail.com","05114477",21,87542165);
		Livre livre = new Livre(854,auteur);
		
		auteur.Afficher();
		System.out.println("");
		adherent.Afficher();
		System.out.println("");
		livre.affiche();
	}
}
