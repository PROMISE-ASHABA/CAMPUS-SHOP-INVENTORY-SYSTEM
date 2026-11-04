package campusshopinventorymanagementsystem;

public class Main {

	public static void main(String[] args) {
		//CREATION OF OBJECTS
		Product product_one = new Product("PO1","manuscript book","stationery",6000,20);
        Product product_two = new Product("PO2","nataraj pen","stationery",1000,30);
        Product product_three = new Product("PO3","ream of paper","stationery",20000,10);
        Product product_four = new Product("PO4","flash drive","electronics",15000,10);
        Product product_five = new Product("PO5","calculator","electronics",50000,10);
        
        System.out.println("----------TESTING IF EACH OBJECT HAS INDEPENDENT PRODUCT INFORMATION---------");
        product_two.setQuantity_in_stock(60);
        System.out.println("PEN STOCK: "+ product_two.getQuantity_in_stock());
        System.out.println("MANUSCRIPT BOOK: "+ product_one.getQuantity_in_stock());
        
        //DISPLAYING DETAILS OF THE FIVE PRODUCTS AFTER BEING UPDATED
        System.out.println("\n---ALL PRODUCTS AFTER BEING UPDATED---");
        System.out.println("PRODUCT ID: "+product_one.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_one.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_one.getProduct_category());
        System.out.println("UNIT PRICE: "+product_one.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_one.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_two.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_two.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_two.getProduct_category());
        System.out.println("UNIT PRICE: "+product_two.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_two.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_three.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_three.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_three.getProduct_category());
        System.out.println("UNIT PRICE: "+product_three.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_three.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_four.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_four.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_four.getProduct_category());
        System.out.println("UNIT PRICE: "+product_four.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_four.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_five.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_five.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_five.getProduct_category());
        System.out.println("UNIT PRICE: "+product_five.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_five.getQuantity_in_stock());
        System.out.println();
        
        //UPDATE PRICE OF ONE PRODUCT(PRODUCT THREE)
        product_three.setUnit_price(40000);
        //UPDATE STOCK QUANTITY OF ONE PRODUCT(PRODUCT ONE)
        product_one.setQuantity_in_stock(40);
        
        //DISPLAY OF THE FIVE PRODUCTS TO PROVE THE UPDATE
        System.out.println("--------DISPLAY OF ALL FIVE PRODUCTS TO PROVE THE LAST UPDATE----------");
        System.out.println("PRODUCT ID: "+product_one.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_one.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_one.getProduct_category());
        System.out.println("UNIT PRICE: "+product_one.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_one.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_two.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_two.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_two.getProduct_category());
        System.out.println("UNIT PRICE: "+product_two.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_two.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_three.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_three.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_three.getProduct_category());
        System.out.println("UNIT PRICE: "+product_three.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_three.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_four.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_four.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_four.getProduct_category());
        System.out.println("UNIT PRICE: "+product_four.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_four.getQuantity_in_stock());
        System.out.println();
        
        System.out.println("PRODUCT ID: "+product_five.getProduct_id());
        System.out.println("PRODUCT NAME: "+product_five.getProduct_name());
        System.out.println("PRODUCT CATEGORY: "+product_five.getProduct_category());
        System.out.println("UNIT PRICE: "+product_five.getUnit_price());
        System.out.println("QUANTITY IN STOCK: "+product_five.getQuantity_in_stock());
        System.out.println();
        
        //WHAT HAPPENS WHEN AN INVALID VALUE LIKE NEGATIVE PRICE IS SUBMITTED
        System.out.println("----------INVALID VALUE TEST------------");
        product_five.setUnit_price(-45000);
        System.out.println("CALCULATOR PRICE THEREFORE STILL REMAINS: "+ product_five.getUnit_price());
	}
	
	
	

}
