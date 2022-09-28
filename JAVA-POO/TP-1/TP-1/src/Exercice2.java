
public class Exercice2 {
	public void conjuger(String verbe) {
		if(verbe.endsWith("er")){
			String radical=verbe.substring(0,verbe.length()-2);
			System.out.println("Je "+radical+"e");
			System.out.println("Tu "+radical+"es");
			System.out.println("Il "+radical+"e");
			System.out.println("Nous "+radical+"ons");
			System.out.println("Vous "+radical+"ez");
			System.out.println("Ils "+radical+"ent");
		} 
		else {
			System.out.println("Entrez un verbe de premier group !!");
		}
	}
}
