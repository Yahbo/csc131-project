package sale.app;

import java.io.*;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;;

/**
 * Session Bean implementation class UserBean
 */
@Stateful
@LocalBean
public class UserBean implements Serializable {
	private String username;
	private String email;
	private char[] password;
	private String itemList;
	
	
	
	public UserBean() {
		this.username = null;
		this.email = null;
		this.password = null;
		this.itemList = null;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getItemList() {
		return itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
	
	
}
