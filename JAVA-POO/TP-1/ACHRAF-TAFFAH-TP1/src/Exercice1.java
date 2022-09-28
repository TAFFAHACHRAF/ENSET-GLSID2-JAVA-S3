import java.util.Arrays;
import java.util.Scanner;

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
		Arrays.sort(notes);
		for(float note : notes) {
			System.out.println(note);
		}
	}
	
	public void displayMoy(float notes[]) {
		float sum=0;
		for(float note : notes) {
			sum+=note;
		}
		System.out.println("La moyenne est : "+ sum/(notes.length));
	}
	
	public void displayMax(float notes[]) {
		System.out.println("La valeur maximal est : "+notes[notes.length-1]);
	}
	
	public void displayMin(float notes[]) {
		Arrays.sort(notes);
		System.out.println("La valeur minimal est : "+notes[0]);
	}
	
	public  void nbNotesGt10(float notes[],float n) {
		int nb=0;
		for(float note:notes) {
			if(note == n) {
				nb++;
			}
		}
		System.out.println("Le nombre d’étudiants ayant une note saisie par l’utilisateur est "+nb);
	}
}
