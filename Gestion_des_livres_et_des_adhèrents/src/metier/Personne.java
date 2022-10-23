package metier;
public class Personne {
	private String nom,email,tel;
	private int age;
	public Personne() {
		this.nom = ""; this.email = ""; this.tel = ""; this.age = 0;
	}
	public Personne(String nom, String email, String tel, int age) {
		this.nom = nom; this.email = email; this.tel = tel; this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void Afficher() {
		System.out.print(" nom=" + nom + ", email=" + email + ", tel=" + tel + ", age=" + age);
	}
}
