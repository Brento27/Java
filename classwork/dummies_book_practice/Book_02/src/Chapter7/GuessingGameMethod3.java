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

public class GuessingGameMethod3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play a guessing game!");
        do {
            playARound(1, getRandomNumber(7, 12)); //→13
        } while (askForAnotherRound("Try again?"));
        System.out.println("\nThank you for playing!");
    }
    
    

    public static void playARound(int min, int max) {
        boolean validInput;
        int number, guess;
        String answer;
// Pick a random number
        number = getRandomNumber(min, max); //→25
// Get the guess
        System.out.println("\nI'm thinking of a number "
                + "between " + min + " and " + max + "."); //→29
        System.out.print("What do you think it is? ");
        guess = getGuess(min, max); //→31
// Check the guess
        if (guess == number) {
            System.out.println("You're right!");
        } else {
            System.out.println("You're wrong!"
                    + " The number was " + number);
        }
    }

    public static int getRandomNumber(int min, int max) //→41
    {
        return (int) (Math.random() //→43
                * (max - min + 1)) + min;
    }

    public static int getGuess(int min, int max) //→47
    {
        while (true) {
            int guess = sc.nextInt();
            if ((guess < min) || (guess > max)) //→52
            {
                System.out.print("I said, between "
                        + min + " and " + max
                        + ". Try again: ");
            } else {
                return guess; //→59
            }
        }
    }

    public static boolean askForAnotherRound(String prompt) //→63
    {
        while (true) {
            String answer;
            System.out.print("\n" + prompt + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}

/*→13 This line calls the playARound method to play one round of the game.
The values for min and max are passed as literals. To add a small amount
of variety to the game, the getRandomNumber method is called here to set
the value for the max to a random number from 7 to 12.
→25 The call to the getRandomNumber method passes the values of min and
max as parameters to set the range for the random numbers.
→29 The message that announces to the user that the computer has chosen a
random number uses the min and max parameters to indicate the range.
→31 The call to the getGuess method now passes the range of acceptable
guesses to the getGuess method.
→41 The declaration for the getRandomNumber method specifies the min and
max parameters.
→43 The calculation for the random number is complicated a bit by the fact
that min may not be 1.
→47 The declaration for the getGuess method accepts the min and max
parameters.
→52 The if statement in the getGuess method uses the min and max values
to validate the user’s input.
→59 This line is the return statement for the getGuess method. Note that this
return statement is in the else part of an if statement that checks
whether the number is less than 1 or greater than 10. If the number is
outside the acceptable range, the return statement isn’t executed.
Instead, the program displays an error message, and the while loop
repeats.
→63 The askForAnotherRound method accepts a string variable to use as a
prompt.*/