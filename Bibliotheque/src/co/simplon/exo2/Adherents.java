package co.simplon.exo2;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import java.util.ArrayList;

public class Adherents {
		
		 String nom;
		 String prenom;
		 LocalDate dateDeNaissance;
		 String adresseMail;
		 String adressePostale;
		 List<Exemplaire> emprunt = new ArrayList<Exemplaire>();
		
		public Adherents(String nom, String prenom, LocalDate dateDeNaissance, String adresseMail, String adressePostale) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateDeNaissance = dateDeNaissance;
			this.adresseMail = adresseMail;
			this.adressePostale = adressePostale;
		}


		public Adherents() {
			super();
		}


		
		@Override
		public String toString() {
			return "Adherent [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
					+ ", adresseMail=" + adresseMail + ", adressePostale=" + adressePostale + "]";
		}


		public Adherents setNom(Adherents lolo) {
			return lolo;
		}
		
		public List<Exemplaire> emprunter(Exemplaire exemplaire, Date date) {
			
			emprunt.add(exemplaire);
			
			return emprunt;
			
			}
			
		}