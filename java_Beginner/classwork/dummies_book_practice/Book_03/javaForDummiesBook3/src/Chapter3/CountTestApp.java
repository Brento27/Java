/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Brent
 */
public class CountTestApp //→1
{

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest(); //→8
            printCount(); //→9
        }
    }

    private static void printCount() {
        System.out.println("There are now " //→15
                + CountTest.getInstanceCount()
                + " instances of the CountTest class.");
    }
}

class CountTest //→21
{

    private static int instanceCount = 0; //→23

    CountTest() //→25
    {
        instanceCount++;
    }

    public static int getInstanceCount() //→29
    {
        return instanceCount;
    }
}

/*→1 This line is the start of the CountTestApp class, which tests the
CountTest class.
→8 This line creates an instance of the CountTest class. Because this code is
contained in a for loop, 10 instances are created.
→9 This line calls the printCount method, which prints the number of
CountTest objects that have been created so far.
→15 This line prints a message indicating how many CountTest objects have
been created so far. It calls the static getInstanceCount method of the
CountTest class to get the instance count.
→21 This line is the start of the CountTest class.
→23 The static instanceCount variable stores the instance count.
→25 This line is the constructor for the CountTest class. Notice that the
instanceCount variable is incremented within the constructor. That
way, each time a new instance of the class is created, the instance count
is incremented.
→29 The static getInstanceCount method simply returns the value of the
static instanceCount field.*/
