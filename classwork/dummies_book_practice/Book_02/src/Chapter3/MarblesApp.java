/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Brent
 */
import java.util.Scanner; //→1

public class MarblesApp {

    static Scanner sc = new Scanner(System.in); //→5

    public static void main(String[] args) {
// declarations →9
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
// get the input data →15
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();
// calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren; //→23
        marblesLeftOver = numberOfMarbles % numberOfChildren; //→24
// print the results →26
        System.out.println("Give each child "
                + marblesPerChild + " marbles.");
        System.out.println("You will have "
                + marblesLeftOver + " marbles left over.");
    }
}

/*→1 Imports the java.util.Scanner class so that the program can use it
to get input from the user.
→5 Creates the Scanner object and assigns it to a class variable so that it
can be used in any method in the class.
→9–13 Declare the local variables used by the program.
→15-20 Get the input from the user.
→23 Calculates the number of marbles to give to each child by using
integer division, which discards the remainder.
→24 Calculates the number of marbles left over.
→26–31 Print the results.*/