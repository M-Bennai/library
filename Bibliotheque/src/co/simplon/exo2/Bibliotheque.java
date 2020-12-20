package co.simplon.exo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Bibliotheque {

		String nom;
		String adresse;
		List<Adherents> inscription = new ArrayList <Adherents>();

		
		public Bibliotheque(String nom, String adresse) {
			super();
			this.nom = nom;
			this.adresse = adresse;
}



		@Override
		public String toString() {
			return "Bibliotheque : " + " " + inscription ;
		}





		public List<Adherents> inscrire(Adherents adherent) {
			
			inscription.add(adherent);
			
			return inscription;
		}
		
		public List<Adherents> deinscrire(Adherents adherent) {
			
			inscription.remove(adherent);
			
			return inscription;
		}
		
}