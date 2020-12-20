package model;

import java.time.LocalDate;

public class Abonne {
	
	int id_abonne;
	String Nom;
	String Prenom;
	String AdresseEmail;
	String AdressePostal;
	LocalDate DateNaissance;
	String Telephone;
	LocalDate DateAdhesion;
	String CategorieProfessionnelle;
	
	

	public Abonne(int id_abonne, String nom, String prenom, String adresseEmail, String adressePostal,
			LocalDate dateNaissance, String telephone, LocalDate dateAdhesion, String categorieProfessionnelle) {
		super();
		this.id_abonne = id_abonne;
		Nom = nom;
		Prenom = prenom;
		AdresseEmail = adresseEmail;
		AdressePostal = adressePostal;
		DateNaissance = dateNaissance;
		Telephone = telephone;
		DateAdhesion = dateAdhesion;
		CategorieProfessionnelle = categorieProfessionnelle;
	}

	public Abonne() {
		super();
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

	public String getAdresseEmail() {
		return AdresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		AdresseEmail = adresseEmail;
	}

	public String getAdressePostal() {
		return AdressePostal;
	}

	public void setAdressePostal(String adressePostal) {
		AdressePostal = adressePostal;
	}

	public LocalDate getDateNaissance() {
		return DateNaissance;
	}


	public void setDateNaissance(LocalDate dateNaissance) {
		DateNaissance = dateNaissance;
	}

	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public LocalDate getDateAdhesion() {
		return DateAdhesion;
	}

	public void setDateAdhesion(LocalDate dateAdhesion) {
		DateAdhesion = dateAdhesion;
	}

	public String getCategorieProfessionnelle() {
		return CategorieProfessionnelle;
	}

	public void setCategorieProfessionnelle(String categorieProfessionnelle) {
		CategorieProfessionnelle = categorieProfessionnelle;
	}
	
	

	public int getId_abonne() {
		return id_abonne;
	}

	public void setId_abonne(int id_abonne) {
		this.id_abonne = id_abonne;
	}

	@Override
	public String toString() {
		return "Abonne [id_abonne=" + id_abonne + ", Nom=" + Nom + ", Prenom=" + Prenom + ", AdresseEmail="
				+ AdresseEmail + ", AdressePostal=" + AdressePostal + ", DateNaissance=" + DateNaissance
				+ ", Telephone=" + Telephone + ", DateAdhesion=" + DateAdhesion + ", CategorieProfessionnelle="
				+ CategorieProfessionnelle + "]";
	}

	public void setId_abonne(String parameter) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}

