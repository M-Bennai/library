package co.simplon.exo2;

public class Auteurs {
	
	 String id_auteur; 
	 String nom;
	 String prenom;
	 
	public Auteurs(String id_auteur, String nom, String prenom) {
		super();
		this.id_auteur = id_auteur;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getId_auteur() {
		return id_auteur;
	}

	public void setId_auteur(String id_auteur) {
		this.id_auteur = id_auteur;
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
	 
	 
}
