
package ex07_1_exercise;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        String surName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");


        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
        
        surName = custName.substring(spaceIdx+1);
        System.out.println(surName);
    }
}
