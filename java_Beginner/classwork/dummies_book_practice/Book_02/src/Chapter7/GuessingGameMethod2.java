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

public class GuessingGameMethod2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do //→11
        {
            playARound(); //→13
        } while (askForAnotherRound()); //→14
        System.out.println("\nThank you for playing!");
    }

    public static void playARound() //→18
    {
        boolean validInput;
        int number, guess;
        String answer;
// Pick a random number
        number = getRandomNumber(); //→25
// Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess(); //→31
// Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + number);
        }
    }

    public static int getRandomNumber() //→41
    {
        return (int) (Math.random() * 10) + 1; //→43
    }

    public static int getGuess() //→46
    {
        while (true) //→48
        {
            int guess = sc.nextInt();
            if ((guess < 1) || (guess > 10)) {
                System.out.print("I said, between 1 and 10. "
                        + "Try again: ");
            } else {
                return guess; //→57
            }
        }
    }

    public static boolean askForAnotherRound() //→61
    {
        while (true) //→63
        {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true; //→69
            } else if (answer.equalsIgnoreCase("N")) {
                return false; //→71
            }
        }
    }
}
 /*→11 The start of the do loop in the main method. Each cycle of this do loop
plays one round of the game. The do loop continues until the user
indicates that he or she wants to stop playing.
→13 Calls the playARound method to play one round of the game.
→14 Calls the askForAnotherRound method to determine whether the user
wants to play another round. The boolean return value from this method
is used as the expression for the do loop. Thus, the do loop repeats if the
askForAnotherRound method returns true.
→18 The start of the playARound method.
→25 Calls the getRandomNumber method to get a random number between
1 and 10. The value returned by this method is stored in the number
variable.
→31 Calls the getGuess method to get the user’s guess. This method returns a
number between 1 and 10, which is stored in the guess variable.
→41 The start of the getRandomNumber method, which indicates that this
method returns an int value.
→43 The return statement for the getRandomNumber method. The random
number is calculated using the Math.random method, and the result of
this calculation is returned as the value of the getRandomNumber method.
→46 The start of the getGuess method, which indicates that this method
returns an int value.
→48 The getGuess method uses a while loop, which exits only when the user
enters a number between 1 and 10.
→57 The return statement for the getGuess method. Note that this return
statement is in the else part of an if statement that checks whether
the number is less than 1 or greater than 10. If the number is outside the
acceptable range, the return statement isn’t executed. Instead, the
program displays an error message, and the while loop repeats.
→61 The start of the askForAnotherRound method, which returns a boolean
value.
→63 The askForAnotherRound method, which uses a while loop that exits
only when the user enters a valid Y or N response.
→69 The askForAnotherRound method, which returns true if the user enters
Y or y.
→71 The askForAnotherRound method, which returns false if the user
enters N or n.*/