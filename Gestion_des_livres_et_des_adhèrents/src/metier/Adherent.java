package metier;

public class Adherent extends Personne {
	private int numAdherent;

	public Adherent() {
		super();
		this.numAdherent = 0;
	}
	
	public Adherent(String nom, String email, String tel, int age,int numAdherent) {
		super(nom,email,tel,age);
		this.numAdherent = numAdherent;
	}

	public int getNumAdherent() {
		return numAdherent;
	}

	public void setNumAdherent(int numAdherent) {
		this.numAdherent = numAdherent;
	}
	
	public void Afficher() {
		System.out.print("[");
		super.Afficher();
		System.out.print(" numAdherent=" + numAdherent+" --> Adherent]");
	}
}
