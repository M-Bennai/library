package co.simplon.exo3;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import co.simplon.exo2.Exemplaire;

import java.util.ArrayList;

public class Adherent1 {
		
		 String nom;
		 String prenom;
		 LocalDate dateDeNaissance;
		 String adresseMail;
		 String adressePostale;
		
		public Adherent1(String nom, String prenom, LocalDate dateDeNaissance, String adresseMail, String adressePostale) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateDeNaissance = dateDeNaissance;
			this.adresseMail = adresseMail;
			this.adressePostale = adressePostale;
		}

		

		public Adherent1(String nom, String prenom) {
			super();
			this.nom = nom;
			this.prenom = prenom;
		}

		

		public Adherent1(String nom, String prenom, LocalDate dateDeNaissance) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateDeNaissance = dateDeNaissance;
		}

		

		public Adherent1(String nom, String prenom, String adresseMail) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.adresseMail = adresseMail;
		}



		public Adherent1() {
			super();
		}


		
		@Override
		public String toString() {
			return "Adherent [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
					+ ", adresseMail=" + adresseMail + ", adressePostale=" + adressePostale + "]";
		}


		public Adherent1 setNom(Adherent1 lolo) {
			return lolo;
		}
		
		
		
		
		
}
