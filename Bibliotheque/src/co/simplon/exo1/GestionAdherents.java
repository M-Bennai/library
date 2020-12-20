package co.simplon.exo1;

import java.time.LocalDate;
import java.time.Month;


public class GestionAdherents {

	public static void main(String[] args) {
		
		LocalDate DateDeNaissance = LocalDate.of(2020,  Month.NOVEMBER, 18);
		System.out.println(DateDeNaissance);
		
		Adherent lolo;
		Adherent toto;
		 
		lolo = new Adherent("Sam","Fisher", DateDeNaissance, "samfisher@gmail.com","adress");
		toto = new Adherent("Link","Fisher", DateDeNaissance, "Linkfisher@gmail.com","adress");
		
		//lolo.setNom(toto);
		
		lolo.toString();
		toto.toString();
		System.out.println(lolo);
		System.out.println(toto);
		
		System.out.println("(lolo == toto) : " + (lolo == toto));
		
		Bibliotheque bibliokids;
		bibliokids = new Bibliotheque("Massi", "adress");
		
		//bibliokids.inscrire(lolo);
		//bibliokids.inscrire(toto);
		bibliokids.deinscrire(lolo);
		bibliokids.toString();
		
		System.out.println(bibliokids);
		
		
	}
		
	
}


