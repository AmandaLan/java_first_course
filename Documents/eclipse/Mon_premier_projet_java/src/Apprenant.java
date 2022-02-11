
public class Apprenant {
	
	@Override
	public String toString() {
		return "Apprenant [nom=" + nom + ", prenom=" + prenom + ", niveau=" + niveau + ", promo=" + promo + "]";
	}

	private String nom;
	private String prenom;
	private int niveau;
	private String promo;
	
	public Apprenant(String Nom, String Prenom, int Niveau, String Promo) {
		this.nom = Nom;
		this.prenom = Prenom;
		this.niveau = Niveau;
		this.promo = Promo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}	
	
}
