import java.util.Arrays; //l'importation de la classe Arrays
import java.util.Scanner; // l'importation de la classe Scanner

public class Exercice1 {
	Scanner sc = new Scanner(System.in);
	public float[] insertNotesValues(int length){ 
		float notes[] = new float[length]; 
		for(int i=0;i<length;i++) {
			System.out.println("Entrer la note "+i+" : ");
			notes[i]=sc.nextFloat(); 
		}
		return notes;
	}
	
	public void TrieAndShow(float notes[]) {
		if(notes.length!=0) {
			Arrays.sort(notes);
			for(float note : notes) {
				System.out.println(note);
			}
		}
		else {
			System.out.println("Ce tableaux est vide");
		}
	}
	
	public void displayMoy(float notes[]) { 
		if(notes.length!=0){																										
			float sum=0;
			for(float note : notes) {
				sum+=note;
			}
			System.out.println("La moyenne est : "+ sum/(notes.length));
		}
		else {
			System.out.println("Le tableux est vide");
		}
	}
	
	public void displayMax(float notes[]) { 
		if(notes.length!=0) {
			System.out.println("La valeur maximal est : "+notes[notes.length-1]);
		}
		else {
			System.out.println("Ce tableaux est vide");
		}
	}
	
	public void displayMin(float notes[]) { 
		if(notes.length!=0) {
			Arrays.sort(notes);
			System.out.println("La valeur minimal est : "+notes[0]);
		}
		else {
			System.out.println("Ce tableaux est vide");
		}
	}
	
	public  void nbNotesEqualsNote(float notes[],float n) {  
		if(notes.length!=0) {
			int nb=0;
			for(float note:notes) {
				if(note == n) {
					nb++;
				}
			}
			System.out.println("Le nombre d’étudiants ayant une vaut "+n+" est "+nb);
		}
		else {
			System.out.println("Ce tableaux est vide");
		}
	}
}
