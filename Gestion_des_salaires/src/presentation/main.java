package presentation;

import metier.Ingenieur;
import metier.Manager;

public class main {
	public static void main(String args[]) {
		Ingenieur ingenieur = new Ingenieur("Achraf","TAFFAH","taffahachraf184@gmail.com","0684134782",12000.0, "Informatique");
		Manager manager = new Manager("Anouar","Bouchlouch","anouar@gmail.com","0545778899",25000.00,"Marketing digital");
		
		ingenieur.afficherEmploye();
		manager.afficherEmploye();	
	}
}
