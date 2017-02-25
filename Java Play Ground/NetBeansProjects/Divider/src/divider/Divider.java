/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divider;

/**
 *
 * @author luigifranciosi
 */
public class Divider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float number1 = 15; 
        float number2 = 6;
        float result = number1 / number2;
        float remainder = number1 % number2;
        System.out.println(number1 + " divided by "  + number2);
        System.out.println("\nResult\tRemainder");
        System.out.println(result + "\t" + remainder);
    }
    
}
