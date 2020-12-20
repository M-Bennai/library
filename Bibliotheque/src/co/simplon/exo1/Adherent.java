package co.simplon.exo1;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import co.simplon.exo2.Exemplaire;

import java.util.ArrayList;

public class Adherent {
		
		 String nom;
		 String prenom;
		 LocalDate dateDeNaissance;
		 String adresseMail;
		 String adressePostale;
		
		public Adherent(String nom, String prenom, LocalDate dateDeNaissance, String adresseMail, String adressePostale) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateDeNaissance = dateDeNaissance;
			this.adresseMail = adresseMail;
			this.adressePostale = adressePostale;
		}


		public Adherent() {
			super();
		}


		
		@Override
		public String toString() {
			return "Adherent [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
					+ ", adresseMail=" + adresseMail + ", adressePostale=" + adressePostale + "]";
		}


		public Adherent setNom(Adherent lolo) {
			return lolo;
		}
		
		
		
		
		
}
