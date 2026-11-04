CAMPUS-SHOP-INVENTORY-SYSTEM
 Campus Shop Inventory Management System

Course: Object-Oriented Programming (OOP), Bachelor of Business Computing, Year II
University: Makerere University Business School
Academic year: 2026/2027

Group members
ASHABA PROMISE          25/U/1240m    
GUNE WINNIE PEACE        25/U/15042/PS
ABER FORTUNATE           25/U/1234
MUNGUDIT ARTHUR RYAN      25/U/15286/PS
KALULE ASMART              25/U/26881

What the program does
 This program helps a campus shop attendant keep track of products. It:
creates five products (manuscript book, nataraj pen, ream of paper, flash disk and calculator)
shows the details of every product
updates the price of one product and the stock of another
shows all products again to prove the changes worked
rejects an invalid value, such as a negative price, and keeps the old one

The program does not ask the user to type anything. All values are written inside the code.
Files in the project

File Purpose 
Product.java The Product class: five private attributes, a constructor, five getters, five setters, and checks for negative price and stock 
Main.java The Main class: creates the five products, displays them, updates them, displays them again, and tests an invalid value 
Both files are in the package campusshopinventorymanagementsystem.

 OOP concepts shown
Class and objects: Product is the blueprint, and product_one to product_five are the objects.
Encapsulation: all attributes are private.
Getters and setters: used to read and change the private attributes.
Validation: the price and stock setters reject negative values.

Requirements
Java JDK installed (version 8 or higher)
Eclipse IDE (or any other Java IDE)

How to run in Eclipse
1. Open Eclipse and choose File > Open Projects from File System(or import the project folder).
2. Make sure Product.java and Main.java are inside the package campusshopinventorymanagementsystem.
3. Right-click Main.java in the Package Explorer.
4. Choose Run As > Java Application.
5. The output appears in the Console tab at the bottom.

 How to run from the command line (optional)
1. Open a terminal in the folder that contains the campusshopinventorymanagementsystem folder.
2. Compile: javac campusshopinventorymanagementsystem/.java
3. Run: java campusshopinventorymanagementsystem.Main

 What you will see when it runs
1. The independence test (changing one product does not change another)
2. All five products displayed
3. All five products displayed again after the updates
4. The invalid value test, showing the error message and that the price stays the same

Screenshots
Screenshots of the program running are included in the submission folder.
