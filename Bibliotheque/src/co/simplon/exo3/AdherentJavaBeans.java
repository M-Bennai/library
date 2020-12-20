package co.simplon.exo3;

import java.time.LocalDate;

public class AdherentJavaBeans {
	
	 String nom;
	 String prenom;
	 LocalDate dateDeNaissance;
	 String adresseMail;
	 String adressePostale;
	 
	public AdherentJavaBeans() {
		super();
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

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	@Override
	public String toString() {
		return "AdherentJavaBeans [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
				+ ", adresseMail=" + adresseMail + ", adressePostale=" + adressePostale + "]";
	}

	
	 
	 
}
