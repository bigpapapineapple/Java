/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investement;

/**
 *
 * @author luigifranciosi
 */
public class Investement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float total = 14000;
        System.out.println("Original investment: $" + total);
        //Increases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        //Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);
        //Increases by 12 percen the third year
        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }
    
}
