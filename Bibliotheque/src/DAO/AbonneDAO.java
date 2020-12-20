package DAO;

import java.util.List;

import model.Abonne;

public interface AbonneDAO {
	List<Abonne> lister();
	void ajouter(Abonne abonne);
	void desinscrire(Abonne abonne);
	void modifier(Abonne abonne);
	public Abonne findById(int id_abonne);
}
