package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AbonneDAO;
import DAO.DAOConnexion;


/**
 * Servlet implementation class ListeAbonne
 */
@WebServlet("/ListeAbonne")
public class ListeAbonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonneDAO abonneDao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeAbonne() {
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
		request.setAttribute("allAbonne", abonneDao.lister());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeAbonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
