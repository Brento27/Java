/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

/**
 *
 * @author Brent
 */
public class MyException {

    public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void doSomething(boolean t)
            throws Exception {
        if (t) {
            throw new Exception();
        }
    }
}
