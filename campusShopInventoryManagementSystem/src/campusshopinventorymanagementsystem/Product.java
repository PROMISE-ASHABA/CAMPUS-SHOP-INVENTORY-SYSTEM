/**
 * Product class
 * Models a single item sold in the campus shop.
 * Uses private attributes with public getters and setters (encapsulation).
 */

package campusshopinventorymanagementsystem;
     //QUESTION ONE
public class Product {
	private String product_id;
	private String product_name;
	private String product_category;
	private double unit_price;
	private int quantity_in_stock;
	
	//constructor sets values when an object is created.
	public Product(String id, String name, String category, double price,int stock){
    this.product_id = id;
    this.product_name = name;
    this.product_category = category;
    this.unit_price = price;
    this.quantity_in_stock = stock;
	}
      //QUESTION TWO
    public String getProduct_id() {return product_id;}
    public String getProduct_name() {return product_name;}
    public String getProduct_category() {return product_category;}
    public double getUnit_price() {return unit_price;}
    public int getQuantity_in_stock() {return quantity_in_stock;}
    
    public void setProduct_id(String id) {this.product_id = id;}
    public void setProduct_name(String name) {this.product_name = name;}
    public void setProduct_category(String category) {this.product_category = category;}
    
    //VALIDATION FOR PRICE
    public void setUnit_price(double price) {
          if(price >= 0) {
    	     this.unit_price = price;
          }else {
    	     System.out.println("Price is not allowed to be negative");
    }
    }
    
    //VALIDATION FOR STOCK
    public void setQuantity_in_stock(int stock) {
    	  if(stock >= 0) { // Accept the new stock only if it is zero or greater
    		this.quantity_in_stock = stock;
    	  }else {
    		System.out.println("Stock is not allowed to be negative");
    	}
    }
    
}



