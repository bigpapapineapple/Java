/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scope_creep;

/**
 *
 * @author luigifranciosi
 */
public class Scope_Creep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x; //this variable is known by all wihin ;main;
        
        x = 10;
        if(x == 10){  // begin new scope
            int y = 20; //known only in this block
            
            //x and y are both known 
            
            System.out.println(" x and y : " + x + " , " + y);
            
            x = y * 2;
        }
        // y = 100; results in Error! y not knwon here
        
        // x is still known though
        System.out.println(" x is " + x);
    }
}
