/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

/**
 *
 * @author Brent
 */
public class CrazyWithZeros {

    public static void main(String[] args) {
        try {
            int answer = divideTheseNumbers(5, 0); //→7
        } catch (Exception e) //→9
        {
            System.out.println("Tried twice, "
                    + "still didn't work!");
        }
    }

    public static int divideTheseNumbers(int a, int b) //→16
            throws Exception {
        int c;
        try {
            c = a / b; //→22
            System.out.println("It worked!"); //→23
        } catch (Exception e) {
            System.out.println("Didn't work the first time."); //→27
            c = a / b; //→28
            System.out.println("It worked the second time!"); //→29
        } finally {
            System.out.println("Better clean up my mess."); //→33
        }
        System.out.println("It worked after all."); //→35
        return c; //→36
    }
}
/*→7 The main method calls the divideTheseNumbers method, passing 5
and 0 as the parameters. You already know that this method isn’t going
to work.
→9 The catch clause catches any exceptions thrown by line 7.
→16 The divideTheseNumbers method declares that it throws Exception.
→22 This line is the first attempt to divide the numbers.
→23 If the first attempt succeeds, this line is executed, and the message "It
worked!" is printed. Alas, the division throws an exception, so this line
never gets executed.
→27 Instead, the catch clause catches the exception, and the message
"Didn't work the first time." is displayed. That’s the first line in
the console output.
→28 The divideTheseNumbers method stubbornly tries to divide the same two
numbers again. This time, no try statement is there to catch the error.
→29 Because another exception is thrown for the second division, however,
this line is never executed. Thus you don’t see the message "It worked
the second time!" on the console. (If you do, you’re in an episode of
The Twilight Zone.)
→33 This statement in the finally clause is always executed, no matter what
happens. That’s where the second line in the console output came from.
After the finally clause executes, the ArithmeticException is thrown
back up to the calling method, where it is caught by line 9. That’s where
the last line of the console output came from.
→35 If the division did work, this line would be executed after the try block
ends, and you’d see the message "It worked after all." on the
console.
→36 Then the return statement would return the result of the division.*/