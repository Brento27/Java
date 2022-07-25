
package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.desc = "Nice Shirt";
        item2.desc = "Red Skirt";
	

	// Print both item descriptions and run code.
         System.out.println("This is item 1: " + item1.desc);
         System.out.println("This is item 2: " + item2.desc);


	// Assign one item to another and run it again.
        item1 = item2;
        System.out.println("This is item 1: " + item1.desc);
        System.out.println("This is item 2: " + item2.desc);

     }
 
} 