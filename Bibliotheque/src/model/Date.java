package model;

public class Date {

	String id_date;
	Date DatePret;
	Date DateRetour;
	
	public Date(String id_date, Date datePret, Date dateRetour) {
		super();
		this.id_date = id_date;
		DatePret = datePret;
		DateRetour = dateRetour;
	}

	public Date() {
		super();
	}

	public String getId_date() {
		return id_date;
	}

	public void setId_date(String id_date) {
		this.id_date = id_date;
	}

	public Date getDatePret() {
		return DatePret;
	}

	public void setDatePret(Date datePret) {
		DatePret = datePret;
	}

	public Date getDateRetour() {
		return DateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		DateRetour = dateRetour;
	}
	
	
	
}
