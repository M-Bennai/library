package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import model.Abonne;



public class AbonneDaoImpl implements AbonneDAO {
	

private DAOConnexion daoConnexion;
	
	//constructeur
	public AbonneDaoImpl(DAOConnexion daoConnexion) {
		this.daoConnexion = daoConnexion;
	}
	
	@Override 
	public List<Abonne> lister() {
		
		
		
		List<Abonne> allAbonne = new ArrayList<Abonne>();
		
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		
		
		try {
			connexion = DAOConnexion.getConnection();
			statement = connexion.createStatement();
			
			//Execution de la requête
			resultat = statement.executeQuery("SELECT * FROM Bibliotheque.abonne;");
		
		
		while(resultat.next()) {
			
			int id_abonne = resultat.getInt("id_abonne");
			String prenom = resultat.getString("Prenom");
			String nom = resultat.getString("Nom");
			String adresseEmail = resultat.getString("AdresseEmail");
			String adressePostal = resultat.getString("AdressePostal");
			LocalDate dateNaissance = LocalDate.parse(resultat.getString("DateNaissance"));
			String telephone = resultat.getString("Telephone");
			LocalDate dateAdhesion = LocalDate.parse(resultat.getString("DateAdhesion"));
			String categorieProfessionnelle = resultat.getString("CategorieProfessionnelle");
		
			Abonne abonne = new Abonne();
			
			abonne.setId_abonne(id_abonne);
			abonne.setPrenom(prenom);
			abonne.setNom(nom);
			abonne.setAdresseEmail(adresseEmail);
			abonne.setAdressePostal(adressePostal);
			abonne.setDateNaissance(dateNaissance);
			abonne.setTelephone(telephone);
			abonne.setDateAdhesion(dateAdhesion);
			abonne.setCategorieProfessionnelle(categorieProfessionnelle);
			
			allAbonne.add(abonne);
			
		}
		
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return allAbonne;
	
}
	
	@Override 
	public void ajouter(Abonne abonne) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connexion = DAOConnexion.getConnection();
			preparedStatement = connexion.prepareStatement("INSERT INTO abonne(id_abonne, Nom, Prenom, AdresseEmail, AdressePostal, DateNaissance, Telephone, DateAdhesion, CategorieProfessionnelle) VALUES(?,?,?,?,?,?,?,?,?);");
			preparedStatement.setInt(1, abonne.getId_abonne());
			preparedStatement.setString(2, abonne.getNom());
			preparedStatement.setString(3, abonne.getPrenom());
			preparedStatement.setString(4, abonne.getAdresseEmail());
			preparedStatement.setString(5, abonne.getAdressePostal());
			preparedStatement.setString(6, abonne.getDateNaissance().toString());
			preparedStatement.setString(7, abonne.getTelephone());
			preparedStatement.setString(8, abonne.getDateAdhesion().toString());
			preparedStatement.setString(9, abonne.getCategorieProfessionnelle());
			preparedStatement.executeUpdate();
		
} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
	@Override
	public void desinscrire(Abonne abonne) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connexion = DAOConnexion.getConnection();
			preparedStatement = connexion.prepareStatement("DELETE from Bibliotheque.abonne where id_abonne=?");
			preparedStatement.setInt(1, abonne.getId_abonne());
		
			preparedStatement.executeUpdate();
		
} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void modifier(Abonne abonne) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connexion = DAOConnexion.getConnection();
			preparedStatement = connexion.prepareStatement("UPDATE Bibliotheque.abonne set Nom=?, Prenom=?, AdresseEmail=?, AdressePostal=?, DateNaissance=?, Telephone=?, DateAdhesion=?, CategorieProfessionnelle=? WHERE id_abonne=?");
			
			preparedStatement.setString(1, abonne.getNom());
			preparedStatement.setString(2, abonne.getPrenom());
			preparedStatement.setString(3, abonne.getAdresseEmail());
			preparedStatement.setString(4, abonne.getAdressePostal());
			preparedStatement.setString(5, abonne.getDateNaissance().toString());
			preparedStatement.setString(6, abonne.getTelephone());
			preparedStatement.setString(7, abonne.getDateAdhesion().toString());
			preparedStatement.setString(8, abonne.getCategorieProfessionnelle());
			preparedStatement.setInt(9, abonne.getId_abonne());
			preparedStatement.executeUpdate();
		
} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public Abonne findById(int id_abonne) {
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultat = null;
		Abonne abonne = null;
		
		try {
			connexion = DAOConnexion.getConnection();
			PreparedStatement prepare = connexion.prepareStatement("SELECT * FROM Bibliotheque.abonne WHERE id_abonne=?");
			
			
			prepare.setInt(1, id_abonne);
			resultat = prepare.executeQuery();
			
			while(resultat.next()) {
				
			
				abonne = new Abonne();
				
				abonne.setId_abonne(id_abonne);
				abonne.setNom(resultat.getString("nom"));
				abonne.setPrenom(resultat.getString("prenom"));
				abonne.setAdresseEmail(resultat.getString("adresseEmail"));
				abonne.setAdressePostal(resultat.getString("adressePostal"));
				abonne.setDateNaissance(LocalDate.parse(resultat.getString("dateNaissance")));
				abonne.setTelephone(resultat.getString("telephone"));
				abonne.setDateAdhesion(LocalDate.parse(resultat.getString("dateAdhesion")));
				abonne.setCategorieProfessionnelle(resultat.getString("categorieProfessionnelle"));
				
			}
			
} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return abonne;
	}
}
