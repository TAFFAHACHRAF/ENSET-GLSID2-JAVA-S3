package metier;

public class Manager extends Employe{
	
	private String service;
	
	public Manager() {
		super();
		this.service = "";
	}
	
	public Manager(String nom, String prenom, String email, String telephone, double salaire,String service) {
		super(nom,prenom,email,telephone,salaire);
		this.service = service;
	}
	
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double calculerSalaire() {
		return getSalaire()*1.2;
	}
	
}
