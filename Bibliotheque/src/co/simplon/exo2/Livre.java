package co.simplon.exo2;

public class Livre {

	String id;
	String titre;
	String auteur;
	
	public Livre(String id_auteur, String nom, String prenom) {
		super();
		this.id = id_auteur;
		this.titre = nom;
		this.auteur = prenom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	
	
	
}
