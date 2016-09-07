package sale.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

import javax.servlet.http.HttpSession;

public class SaleTracker {
	// Validate User method
	//validates that the user is in the database
	public static UserBean validateUser(String username, String password) throws SQLException, ClassNotFoundException{
		boolean userExists = false;
		//specifies database class driver
		Class.forName("com.mysql.jdbc.Driver");

		//attempts to make a connection to the database
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShoppingAppDatabase","root","rootpassword");

		//formats a query to submit to the database
			PreparedStatement statement = null;
				statement = con.prepareStatement("SELECT email , itemlist  FROM Users WHERE username='"+username+"' AND password='"+password+"'");

		// attempts to execute the query and then store the response in a result variable
		//if the user exists there will be a result stored if the user does not the result will be empty
			ResultSet result = null;
				result = statement.executeQuery();

			userExists = result.next();
			
			//if the username and password paiar exist then create a userbean to pass back
			//otherwise set the user to null
			UserBean user;
			if(userExists == true){
				user = new UserBean();
				user.setUsername(username);
				user.setPassword(password.toCharArray());
				user.setEmail(result.getString(1));
				user.setItemList(result.getString(2));
			}else{
				user = null;
			}
		
		return user;
	}
	

	public static Stack searchItems(String searchTerm) throws ClassNotFoundException, SQLException{
		Stack thestack = new Stack();
		//specifies database class driver
		Class.forName("com.mysql.jdbc.Driver");
		//attempts to make a connection to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShoppingAppDatabase","root","rootpassword");
		PreparedStatement statement = con.prepareStatement("SELECT * FROM Items WHERE itemname RLIKE \'"+searchTerm+"\'");
		// attempts to execute the query and then store the response in a result variable
		//if the user exists there will be a result stored if the user does not the result will be empty
		ResultSet result = statement.executeQuery();
		while(result.next()!=false){
			ItemBean item = new ItemBean();
			item.setName(result.getString("itemName"));
			item.setCurrentPrice(Double.parseDouble(result.getString("price")));
			item.setInternalID(result.getString("itemID"));
			item.setAmazonID(result.getString("amazonID"));
			item.setImageURL(result.getString("image"));
			thestack.push(item);
		}
		return thestack;
	}

	public static void createUser(String[] credentials) throws ClassNotFoundException, SQLException {
		String newusername = credentials[0];
		String newpassword = credentials[1];
		String newemail = credentials[2];
		//specifies database class driver
		Class.forName("com.mysql.jdbc.Driver");
		//attempts to make a connection to the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShoppingAppDatabase","root","rootpassword");
		Statement statement = con.createStatement();
				
		statement.executeUpdate("INSERT INTO Users (username, password, email, itemlist) VALUES ('"+newusername+"', '"+newpassword+"', '"+newemail+"', '"+newusername+"list')");
		
	}
	

}