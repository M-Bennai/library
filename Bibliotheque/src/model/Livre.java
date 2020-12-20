package model;

public class Livre {
	String id_livre;
	String titre;
	String auteurs;
	
	public Livre(String id_livre, String titre, String auteurs) {
		super();
		this.id_livre = id_livre;
		this.titre = titre;
		this.auteurs = auteurs;
	}

	public Livre() {
		super();
	}

	public String getId_livre() {
		return id_livre;
	}

	public void setId_livre(String id_livre) {
		this.id_livre = id_livre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(String auteurs) {
		this.auteurs = auteurs;
	}

	@Override
	public String toString() {
		return "Livre [id_livre=" + id_livre + ", titre=" + titre + ", auteurs=" + auteurs + "]";
	}
	
	
}
