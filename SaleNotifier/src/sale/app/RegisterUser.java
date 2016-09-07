package sale.app;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String username;
	private static String password;
	private static String email;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		System.out.println("RegisterUser.java is running");
		
		HttpSession sess = request.getSession();
		 username = request.getParameter("username");
		 password = request.getParameter("password");
		 email = request.getParameter("email");
		 String[] credentials = {username, password, email};

			try {
				SaleTracker.createUser(credentials);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				request.getRequestDispatcher("index.html").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 
	}

}
