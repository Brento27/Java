/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Brent
 */
import java.awt.event.*; //→1
import javax.swing.*; //→2

public class TickTock {

    public static void main(String[] args) {
// create a timer that calls the Ticker class
// at one second intervals
        Timer t = new Timer(1000, new Ticker()); //→10
        t.start(); //→11
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null, //→15
                "Click OK to exit program");
    }
}

class Ticker implements ActionListener //→20
{

    private boolean tick = true; //→22

    public void actionPerformed(ActionEvent event) //→24
    {
        if (tick) {
            System.out.println("Tick..."); //→28
        } else {
            System.out.println("Tock..."); //→32
        }
        tick = !tick; //→34
    }
}

/*→1 The ActionListener interface is part of the java.awt.event package,
so this import statement is required.
→2 The Timer class is part of the javax.swing package, so this import
statement is required.
→10 This statement creates a new Timer object. The timer’s interval is set to
1,000 milliseconds — which is equivalent to 1 second. A new instance of
the Ticker class is passed as the second parameter. The timer calls this
object’s actionPerformed method at each timer tick — in other words,
once per second.
→11 This statement calls the start method to kick the timer into action.
→15 The JOptionPane class is used to display a dialog box that tells the user
to click the OK button to stop the application. You might think I include
this dialog box to give the user a way to end the program. In reality, I use
it to give the timer some time to run. If I just end the main method after
starting the timer, the application ends, which kills the timer. Because I
use JOptionPane here, the application continues to run as long as the
dialog box is displayed. (For more information about JOptionPane, see
Book 2, Chapter 2.)
→20 This line is the declaration of the Ticker class, which implements the
ActionListener interface.
→22 This line is a private boolean class field that’s used to keep track of
whether the Ticker displays Tick... or Tock... Each time the
actionPerformed method is called, this field is toggled.
→24 This line is the actionPerformed method, which is called at each timer
interval.
→28 This line prints Tick... on the console if tick is true.
→32 This line prints Tock... on the console if tick is false.
→34 This line toggles the value of the tick variable. In other words, if tick is
true, it’s set to false. If tick is false, it’s set to true.*/
