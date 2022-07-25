
package ex04_2_exercise;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        // String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 15.00, tax = price*15/100, total;
        int quantity = 1;
        
        // Modify message to include quantity 
        String message = custName+" wants to purchase " + quantity + ' '+itemDesc + '.';
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price*quantity + tax*quantity;
        System.out.println("The total is R" + total);

        
    }    
}
