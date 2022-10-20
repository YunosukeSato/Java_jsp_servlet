package servetPracticce;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	  // to be forward
	  String forwardPath = null;
	  
	  // Get the action parameter from request parameter
	  String action = request.getParameter("action");
	  
	  // The process if the user request to start to sign up the account
	  if(action == null) {
	    // Forward
	    forwardPath = "/WEB-INF/jsp/registerForm.jsp";
	  }
	  
	  // The process if the user request to execute the register
	  else if(action.equals("done")) {
	    // sign up the account which saved in the session scope
	    HttpSession session = request.getSession();
	    User registerUser = (User) session.getAttribute("registerUser");
	    
	    // Invoke the registration process
	    RegisterUserLogic logic = new RegisterUserLogic();
	    logic.execute(registerUser);
	    
	    // Delete the instance which is useless in session scope
	    session.removeAttribute("registerUser");
	    
	    // Set the file to be forwarded after registration
	    forwardPath = "/WEB-INF/jsp/registerDone.jsp";
	  }
	  
	  // Forward to the file above
	  RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
	  dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	  // Get the request parameter
	  request.setCharacterEncoding("UTF-8");
	  String id = request.getParameter("id");
	  String name = request.getParameter("name");
	  String pass = request.getParameter("pass");
	  
	  // Set the information of the user
	  User registerUser = new User(id, name, pass);
	  
	  // Save the user to the session scope
	  HttpSession session = request.getSession();
	  session.setAttribute("registerUser", registerUser);
	  
	  // Forward
	  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
	  dispatcher.forward(request, response);
	}

}
