/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cating;

/**
 *
 * @author luigifranciosi
 */
public class Cating {

    public static void main(String[] args) {
    
        double x, y;
        byte b;
        int i;
        char ch;
        
        x = 10.0;
        y = 3.0;
        
        i = (int) (x/y); // cast double to int
        System.out.println("Integer outcome of x/y: " + i);
        
        i = 100;
        b = (byte) i; //  no loss of info, a byte can hold 100
        System.out.println("Value of b: " + b);
        
        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);
        
        b = 88; // 88 is ASCII for X. Casting to a char will print "X"
        ch = (char) b;
        System.out.println("ch: " + ch);
    
    }

}
