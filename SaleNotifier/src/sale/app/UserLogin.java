package sale.app;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static String username;
	private static String password;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		
		 
		// getting form data
		 username = request.getParameter("username");
		 password = request.getParameter("password");
			try {
				if(SaleTracker.validateUser(username, password)!=null){
					//create a session if it doesnt already exist
					HttpSession sess = request.getSession(true);
					//create a session attribute called user; validateUser returns a UserBean object
					sess.setAttribute("user", SaleTracker.validateUser(username, password));	
					//forwards to the UserAccount servlet
					 request.getRequestDispatcher("UserAccount").forward(request, response);
		            
				 }else{
					 request.getRequestDispatcher("/WEB-INF/RegisterUser.jsp").forward(request, response);
					 
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
	