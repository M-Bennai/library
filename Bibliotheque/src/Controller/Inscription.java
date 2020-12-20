package Controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AbonneDAO;
import DAO.DAOConnexion;
import model.Abonne;


/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonneDAO abonneDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException {
    	
		DAOConnexion daoConnexion = new DAOConnexion();
		
		this.abonneDao = daoConnexion.getAbonneDao();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String id = request.getParameter("id_abonne");
		
		if(!request.getParameter("id_abonne").equals("")||
				!request.getParameter("nom").equals("")||
				!request.getParameter("prenom").equals("")||
				!request.getParameter("adresseEmail").equals("")||
				!request.getParameter("adressePostal").equals("")||
				!request.getParameter("dateNaissance").equals("")||
				!request.getParameter("telephone").equals("")||
				!request.getParameter("dateAdhesion").equals("")||
				!request.getParameter("categorieProfessionnelle").equals(""))
		{
	
			if(!request.getParameter("id_abonne").equals(""))
			{
		
		Abonne abonne = new Abonne();
		
		abonne.setNom(request.getParameter("nom"));
		abonne.setPrenom(request.getParameter("prenom"));
		abonne.setAdresseEmail(request.getParameter("adresseEmail"));
		abonne.setAdressePostal(request.getParameter("adressePostal"));
		abonne.setDateNaissance(LocalDate.parse(request.getParameter("dateNaissance")));
		abonne.setTelephone(request.getParameter("telephone"));
		abonne.setDateAdhesion(LocalDate.parse(request.getParameter("dateAdhesion")));
		abonne.setCategorieProfessionnelle(request.getParameter("categorieProfessionnelle"));
		abonne.setId_abonne(Integer.parseInt(request.getParameter("id_abonne")));
		
		abonneDao.modifier(abonne);
		
			} else {
				Abonne abonne = new Abonne();
				abonne.setNom(request.getParameter("nom"));
				abonne.setPrenom(request.getParameter("prenom"));
				abonne.setAdresseEmail(request.getParameter("adresseEmail"));
				abonne.setAdressePostal(request.getParameter("adressePostal"));
				abonne.setDateNaissance(LocalDate.parse(request.getParameter("dateNaissance")));
				abonne.setTelephone(request.getParameter("telephone"));
				abonne.setDateAdhesion(LocalDate.parse(request.getParameter("dateAdhesion")));
				abonne.setCategorieProfessionnelle(request.getParameter("categorieProfessionnelle"));
				abonneDao.ajouter(abonne);
				
			}
		
		request.setAttribute("allAbonne", abonneDao.lister());
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeAbonne.jsp").forward(request, response);
		
		} else {
		
		System.out.println("revoir les données");
	}

}
}