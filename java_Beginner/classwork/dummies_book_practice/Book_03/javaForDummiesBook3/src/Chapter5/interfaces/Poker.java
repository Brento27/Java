/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5.interfaces;

/**
 *
 * @author Brent
 */
public class Poker extends Game
    implements Playable, CardGame{
    public void play() {
        System.out.println("Playnig Poker");
    }
}
