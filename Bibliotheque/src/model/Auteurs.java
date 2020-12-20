package model;

public class Auteurs {
	String id_auteur;
	String Nom;
	String Prenom;
	
	public Auteurs(String id_auteur, String nom, String prenom) {
		super();
		this.id_auteur = id_auteur;
		Nom = nom;
		Prenom = prenom;
	}

	public Auteurs() {
		super();
	}

	public String getId_auteur() {
		return id_auteur;
	}

	public void setId_auteur(String id_auteur) {
		this.id_auteur = id_auteur;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	@Override
	public String toString() {
		return "Auteurs [id_auteur=" + id_auteur + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}
	
	
}
