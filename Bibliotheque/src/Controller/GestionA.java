package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AbonneDAO;
import DAO.DAOConnexion;
import model.Abonne;


/**
 * Servlet implementation class GestionBibliotheque
 */
@WebServlet("/GestionA")
public class GestionA extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private AbonneDAO abonneDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionA() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException {
		DAOConnexion daoConnexion = new DAOConnexion();
		
		this.abonneDao = daoConnexion.getAbonneDao();
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("allAbonne", abonneDao.lister());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/GestionA.jsp").forward(request, response);
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Abonne abonne = null;
		String action = request.getParameter("action");
		int idAbonne = Integer.parseInt(request.getParameter("id_abonne"));
		request.setAttribute("allAbonne", abonneDao.lister());
		
		if(action.equals("modifier")) {
			abonne = abonneDao.findById(idAbonne);
			request.setAttribute("abonne", abonne);
			this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(request, response);	
		} else {
			abonne = new Abonne();
		
		abonne.setId_abonne(idAbonne);
		abonneDao.desinscrire(abonne);
		this.getServletContext().getRequestDispatcher("/WEB-INF/GestionA.jsp").forward(request, response);
		}
	
		
		

}
}
