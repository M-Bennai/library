package co.simplon.exo1;

import java.util.ArrayList;
import java.util.List;


public class Bibliotheque {

		String nom;
		String adresse;
		List<Adherent> inscription = new ArrayList <Adherent>();

		
		public Bibliotheque(String nom, String adresse) {
			super();
			this.nom = nom;
			this.adresse = adresse;
}



		@Override
		public String toString() {
			return "Bibliotheque : " + " " + inscription ;
		}





		public List<Adherent> inscrire(Adherent adherent) {
			
			inscription.add(adherent);
			
			return inscription;
		}
		
		public List<Adherent> deinscrire(Adherent adherent) {
			
			inscription.remove(adherent);
			
			return inscription;
		}
		
}