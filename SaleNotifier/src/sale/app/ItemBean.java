package sale.app;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ItemBean
 */
@Stateless
@LocalBean
public class ItemBean {
	public String imageURL;
	public String name;
	public String amazonID;
	public String walID;
	public String internalID;
	public double currentPrice;
	
	public ItemBean(){
		this.name = null;
		this.amazonID = null;
		this.walID = null;
		this.internalID = null;
		this.currentPrice = 0;
	}
	
	public String getImageURL(){
		return this.imageURL;
	}
	public void setImageURL(String url){
		this.imageURL = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmazonID() {
		return amazonID;
	}
	public void setAmazonID(String amazonID) {
		this.amazonID = amazonID;
	}
	public String getWalID() {
		return walID;
	}
	public void setWalID(String walID) {
		this.walID = walID;
	}
	public String getInternalID() {
		return internalID;
	}
	public void setInternalID(String internalID) {
		this.internalID = internalID;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double internalPrice) {
		this.currentPrice = internalPrice;
	}

	
}

