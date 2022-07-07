/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_1_exercise;

/**
 *
 * @author Brent
 */
public class Shirt extends Item {

    private char size, colorCode;
    /**
     * @return the size
     */
    public char getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(char size) {
        this.size = size;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.setSize(size);
        this.setColorCode(colorCode);
    }
}
