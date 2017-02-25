/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcircuit;

/**
 *
 * @author luigifranciosi
 */
public class ShortCircuit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, d, q;
        
        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        
    /*    d = 0;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    */ 
    }
}
