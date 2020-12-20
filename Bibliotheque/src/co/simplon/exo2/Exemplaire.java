package co.simplon.exo2;

public class Exemplaire {

	String editeur;
	int anneeEdition;
	
	public Exemplaire(String editeur, int anneeEdition) {
		super();
		this.editeur = editeur;
		this.anneeEdition = anneeEdition;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getAnneeEdition() {
		return anneeEdition;
	}

	public void setAnneeEdition(int anneeEdition) {
		this.anneeEdition = anneeEdition;
	}
	
	
	
}
