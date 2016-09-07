package sale.app;

public class User {

	private String username;
	private String email;
	private char[] password;
	private UserItemBean[] itemList;
	
	
	
	public User() {
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
	public UserItemBean[] getItemList() {
		return itemList;
	}
	public void setItemList(UserItemBean[] itemList) {
		this.itemList = itemList;
	}
	
	

}
