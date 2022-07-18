/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter7;

/**
 *
 * @author Brent
 */
import java.util.Scanner;

public class GuessingGameMethod {

    static Scanner sc = new Scanner(System.in);
    static boolean keepPlaying = true; //→7

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) //→12
        {
            playARound(); //→14
        }
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() //→19
    {
        boolean validInput;
        int number, guess;
        String answer;
// Pick a random number
        number = (int) (Math.random() * 10) + 1;
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
// Get the guess
        System.out.print("What do you think it is? ");
        do {
            guess = sc.nextInt();
            validInput = true;
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 "
                        + "and 10. Try again: ");
                validInput = false;
            }
        } while (!validInput);
// Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + number);
        }
// Play again?
        do {
            System.out.print("\nPlay again? (Y or N)");
            answer = sc.next();
            validInput = true;
            if (answer.equalsIgnoreCase("Y")); else if (answer.equalsIgnoreCase("N")) {
                keepPlaying = false; //→60
            } else {
                validInput = false;
            }
        } while (!validInput);
    }
}  

/*→7 Because both the main method (in line 12) and the playARound method
(in line 60) must access the keepPlaying variable, I declare it as a class
variable rather than as a local variable in the main method.
Class variables must be static if you intend to access them from static
methods.
→14 The body of the while loop in the main method is just one line: a call to
the playARound method. Thus, each time the loop repeats, the program
plays one round of the game with the user.
→19 The declaration for the playARound method marks the method as
static so that the static main method can call it.*/
