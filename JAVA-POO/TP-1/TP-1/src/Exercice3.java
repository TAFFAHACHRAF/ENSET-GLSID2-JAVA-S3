import java.util.Scanner;

public class Exercice3 {
	Scanner sc = new Scanner(System.in);
	
	public StringBuilder saisir() {
		StringBuilder chaine = new StringBuilder();
		System.out.println("Entrer svp une chaine de caracter : ");
		chaine.append(sc.nextLine());
		return chaine;
	}
	
	public void afficher(StringBuilder chaine) {
		System.out.println(chaine);
	}
	
	public StringBuilder inverser(StringBuilder chaine) {
		return chaine.reverse();
	}
	
	public int nombreDeMots(StringBuilder chaine) {
		return chaine.toString().split(" ").length;
	}
	
	public void tester() {
		StringBuilder chaine = new StringBuilder();
		
		System.out.println("");
		System.out.println("");
		System.out.println("1) Saisir une chaine ");
		System.out.println("2) Afficher la chaine ");
		System.out.println("3) Inverser la chaine ");
		System.out.println("4) Afficher le nombre de mots qui contient cette chaine ");
		System.out.println("5) Quitter ");
		
		String choix="";
		do {	
			System.out.println("Entrer svp un choix : ");
			choix = sc.nextLine();
			
			switch(choix) {
				case "1" : {
					chaine = saisir();
					break;
				}
				case "2" : {
					afficher(chaine);
					break;
				}
				case "3" : {
					afficher(inverser(chaine));
					break;
				}
				case "4" : {
					System.out.println("Cette chaine contient "+nombreDeMots(chaine)+" mots");
					break;
				}
				default : {
					break;
				}
			}
	    } while (!choix.equals("5")); // quitting the program 
	}
}
