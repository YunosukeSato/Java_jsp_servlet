package servetPracticce;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSampleServlet
 */
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get the request parameter
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		// Check the request parameter
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "Please input the name<br>";
		} else {
			if(gender.equals("0")){ gender = "Man"; }
			else if (gender.equals("1")) { gender = "Woman"; }
		}
		
		// Set the message to output
		String msg = "Complete the registration of" + name + "(" + gender + ")";
		if(errorMsg.length() != 0) {
			msg = errorMsg;
		}
		
		// Output the HTML
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meata charset=\"UTF-8\">");
		out.println("<title>Registration result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
