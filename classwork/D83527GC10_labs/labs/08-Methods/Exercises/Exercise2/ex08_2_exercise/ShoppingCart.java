
package ex08_2_exercise;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Shirt", 3, 14.99);
        item1.displayItem();
        
        System.out.println("4 args setItemFields valid");

        // Call the 4-arg setItemFields method, checking the return value.  
        
        if (item1.setItemFields("Shirt", 3, 14.99, 'C') < 0) {
            System.out.println("Invalid Color code!");
        }
        else{
            item1.displayItem();
        }
        
        System.out.println("4 args setItemFields invalid");
	// Test your code for both valid and invalid values
        if (item1.setItemFields("Shirt", 3, 14.99, ' ') < 0) {
            System.out.println("Invalid Color code!");
        }
        else{
            item1.displayItem();
        }
        
        
    }
}
