package servetPracticce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;

/**
 * Servlet implementation class HomeIndex
 */
@WebServlet("/HomeIndex")
public class HomeIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the evaluation from application scope
	  ServletContext application = this.getServletContext();
	  SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
	  
	  // Initialize the evaluation 
	  if(siteEV == null) {
	    siteEV = new SiteEV();
	  }
	  
	  // Get the request parameter
	  request.setCharacterEncoding("UTF-8");
	  String action = request.getParameter("action");
	  
	  // Process the evaluation
	  SiteEVLogic evl = new SiteEVLogic();
	  if(action != null && action.equals("like")) {
	    evl.like(siteEV);
	  } else if (action != null && action.equals("dislike")) {
	    evl.dislike(siteEV);
	  }
	  
	  // Save the evaluation to the application scope
	  application.setAttribute("siteEV", siteEV);
	  
	  // Forward
	  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/homeIndex.jsp");
	  dispatcher.forward(request, response);
	  
	}

}
