package model;

import java.util.Date;

public class Exemplaire {
	
	String CodeRayon;
	Date Disponibilite;
	Date DateAquisition;
	String id_livre;
	String id_editeur;
	
	public Exemplaire(String codeRayon, Date disponibilite, Date dateAquisition, String id_livre, String id_editeur) {
		super();
		CodeRayon = codeRayon;
		Disponibilite = disponibilite;
		DateAquisition = dateAquisition;
		this.id_livre = id_livre;
		this.id_editeur = id_editeur;
	}

	public Exemplaire() {
		super();
	}

	public String getCodeRayon() {
		return CodeRayon;
	}

	public void setCodeRayon(String codeRayon) {
		CodeRayon = codeRayon;
	}

	public Date getDisponibilite() {
		return Disponibilite;
	}

	public void setDisponibilite(Date disponibilite) {
		Disponibilite = disponibilite;
	}

	public Date getDateAquisition() {
		return DateAquisition;
	}

	public void setDateAquisition(Date dateAquisition) {
		DateAquisition = dateAquisition;
	}

	public String getId_livre() {
		return id_livre;
	}

	public void setId_livre(String id_livre) {
		this.id_livre = id_livre;
	}

	public String getId_editeur() {
		return id_editeur;
	}

	public void setId_editeur(String id_editeur) {
		this.id_editeur = id_editeur;
	}

	@Override
	public String toString() {
		return "Exemplaire [CodeRayon=" + CodeRayon + ", Disponibilite=" + Disponibilite + ", DateAquisition="
				+ DateAquisition + ", id_livre=" + id_livre + ", id_editeur=" + id_editeur + "]";
	}
	
	
}
