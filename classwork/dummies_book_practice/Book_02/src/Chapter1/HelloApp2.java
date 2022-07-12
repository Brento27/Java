/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Brent
 */
// This application displays a hello message on
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method.
public class HelloApp2 {

    public static void main(String[] args) {
        Greeter myGreeterObject = new Greeter();
        myGreeterObject.sayHello();
        
        Greeter2 myGreeter2Object = new Greeter2();
        myGreeter2Object.sayHello();
    }
}
