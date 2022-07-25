package ex13_1_exercise;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args){
        
            String[] days = {"monday","saturday","tuesday","sunday","friday"};            
            
            // Convert the days array into an ArrayList
            ArrayList<String> myArrayList = new ArrayList(Arrays.asList(days));
            // Loop through the ArrayList, printing out "sunday" elements in 
            for (String day : myArrayList){
               if (day.equals("sunday")){
                //   upper case (use toUpperCase() method of String class)
                   System.out.println(day.toUpperCase());
               }
               // Print all other days in lower case
               else System.out.println(day);
            }
            // Print out the ArrayList
            System.out.println(myArrayList
            );            
    }
}
