/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Brent
 */
public class Player {

    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
    }

    /*public void setHealth(int h) {
        if (h < 0) {
            health = 0;
        } else if (h > 100) {
            health = 100;
        } else {
            health = h;
        }
    }*/
}
