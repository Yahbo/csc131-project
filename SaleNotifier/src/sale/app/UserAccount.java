package sale.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserAccount
 */
@WebServlet("/UserAccount")
public class UserAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String searchTerm;
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String referrer = request.getHeader("referer");
		HttpSession sess = request.getSession();
		UserBean user = (UserBean) sess.getAttribute("user");
		String username = user.getUsername();
		sess.setAttribute("username", username);
		
		if(referrer.equals("http://localhost:8080/SaleNotifier/index.html")){
			request.getRequestDispatcher("/WEB-INF/Userhomepage.jsp").forward(request, response);
			
		}else if((referrer.equals("http://localhost:8080/SaleNotifier/UserLogin") || (referrer.equals("http://localhost:8080/SaleNotifier/UserAccount")))){
			searchTerm = request.getParameter("search");
			try {
				Stack thestack = SaleTracker.searchItems(searchTerm);
				ItemBean item;
				String tableString = "<table border=\"1\"><tr><td>image</td><td>description:</td><td>desired price</td><td></td></tr>";
				while(!thestack.empty()){
					item = (ItemBean)thestack.pop();
					tableString = tableString + "<tr><form id=\"survey\" name=\"survey\" action=\"UserAccount\" method=\"post\"><td><img src=\""+item.getImageURL()+"\"</td><td>"+item.getName()+"</td><td><input type=\"text\" name=\"item\" id=\"item\" placeholder=\"Price Point\"/></td><td><input type=\"submit\" value=\"Add Item\" /></td></form></tr>";
				}
				tableString = tableString+"</table>";
				request.setAttribute("table", tableString); System.out.println("it made it");
		        request.getRequestDispatcher("/WEB-INF/SearchResults.jsp").forward(request, response);
		        
				tableString = "set to null";
			} catch (ClassNotFoundException e) {
				System.out.println("class not found");
			} catch (SQLException e) {
				System.out.println("sql exception");
			}	
		}else if(referrer.equals("http://localhost:8080/SaleNotifier/RegisterUser")){
			request.getRequestDispatcher("/WEB-INF/Userhomepage.jsp").forward(request, response);
		}
	}

}
