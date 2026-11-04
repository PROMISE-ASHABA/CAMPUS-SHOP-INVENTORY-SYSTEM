THIS IS OKAY FOR THE PUBLIC TO EDIT AND ADD CHANGES.
# Code Explained and Tested

This page explains the most important lines of the Campus Shop Inventory Management System in simple words, and shows the tests we ran. You do not need to know Java to follow it.

## Part 1: How the program is built

The program has two classes:

Class  Think of it as  Job 
Product A blank product form  Describes what every product has and how to read or change it 
Main The shop attendant  Fills in five forms, shows them, updates them and tests mistakes 

## Part 2: Crucial lines in Product.java

### 1. Private attributes

#java
private String product_id;
private String product_name;
private String product_category;
private double unit_price;
private int quantity_in_stock;


private means other classes cannot touch these values directly. This is called **encapsulation**. It is like keeping money in a locked drawer instead of on the table.
String stores text (ID, name, category).
double stores a number with decimals (price).
int stores a whole number (stock). You cannot have half a pen.

### 2. The constructor

java
public Product(String id, String name, String category, double price, int stock) {
    this.product_id = id;
    this.product_name = name;
    this.product_category = category;
    setUnit_price(price);
    setQuantity_in_stock(stock);
}
 A constructor runs once, when a product is created. It fills in the product's details.
this.product_id = id;means "store the given ID inside this product".
 Price and stock go through their setters, so the negative-value check also works when a product is first created.

### 3. A getter

java
public double getUnit_price() {
    return unit_price;
}

A getter reads a private value.
return sends the value back to whoever asked for it.
There are five getters, one for each attribute.

### 4. A setter with a check

java
public void setUnit_price(double price) {
    if (price >= 0) {
        this.unit_price = price;
    } else {
        System.out.println("Price cannot be negative. Old price kept.");
    }
}

A setter changes a private value.
  if (price >= 0)` asks: is the new price zero or more?
If yes, the new price is stored.
 If no, a message is printed and the old price stays. Wrong data never gets in.
"setQuantity_in_stock "works the same way for stock.

## Part 3: Crucial lines in Main.java

### 1. The starting point

java
public static void main(String[] args) {
}

Java always starts running from this line. Without it, the program cannot start.

### 2. Creating a product (instantiation)

java
Product product_one = new Product("P01", "manuscript book", "stationery", 6000, 20);

new Product(...) builds a real product from the Product plan.
product_one is the name we use to refer to it.
 The five values are its ID, name, category, price and stock.
 We do this five times, so we have five separate products.

### 3. Showing a product with getters

java
System.out.println("UNIT PRICE: " + product_one.getUnit_price());

System.out.println prints a line on the screen.
product_one.getUnit_price() asks the product for its price using the getter.
The + joins the label and the value into one line.

### 4. Updating with setters

java
product_three.setUnit_price(40000);
product_one.setQuantity_in_stock(40);

The first line changes the price of the ream of paper. The second changes the stock of the manuscript book. These lines must come before the second display, or the display will show old values.

### 5. Testing a wrong value

java
product_five.setUnit_price(-45000);

A negative price is not allowed, so the setter prints its message and the calculator keeps its old price.

## Part 4: Tests we ran

Tick the Result column only after running the program yourself.

 Test Action Expected result Result 
 1 Create five products  Create product_one to product_five All five are created with their own details 
 2 Independence Change one product's stock, then print another product  The other product does not change 
 3 Display with getters Print all five products All five show ID, name, category, price and stock 
 4 Update price  Set the ream of paper to 40000  Price shows 40000.0 after the update 
 5  Update stock  Set the manuscript book to 40  Stock shows 40 after the update 
 6  Invalid price  Set the calculator price to -45000 Message is printed and the old price stays 
 7  Invalid stock (optional) Set any stock to a negative number  Message is printed and the old stock stays 

## Part 5: Problems we met and how we fixed them
 Problem Cause  Fix 
 Red error on the setter calls in the constructor  The setter methods did not exist yet, and the names did not match exactly (Java is case-sensitive)  Wrote the setters and matched the names exactly
 Category would not store words like "stationery"  The category was declared as char, which holds one character only Changed it to String
 Updated values did not appear in the second display  The second display ran before the update lines Moved the update lines above the second display 
 Products were packed together on the screen No space between products Added an empty System.out.println();after each product 

## What we learned
 A class is a plan, and an object is a real item made from it.
  Private attributes protect data, and getters and setters are the only way in.
  Putting the check inside the setter means the rule is written once and works everywhere.
  Compiled by; Asmart-Kalule
