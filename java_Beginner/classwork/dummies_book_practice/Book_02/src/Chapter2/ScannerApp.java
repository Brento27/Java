/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Brent
 */
import java.util.Scanner; //→1

public class ScannerApp {

    static Scanner sc = new Scanner(System.in); //→6

    public static void main(String[] args) {
        System.out.print("Enter an integer: "); //→10
        int x = sc.nextInt(); //→11
        System.out.println("You entered " + x + "."); //→12
    }
}
