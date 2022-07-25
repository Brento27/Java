
package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String [] names = {"shirt", "pants", "shoe", "bracelet"};
        


        // Change message to show the number of items purchased.
        message = custName + " wants to purchase " + names.length + " items.";
        

        System.out.println(message);
        // Print an element from the items array.  
        System.out.println(names[1]);
        
    }

}
