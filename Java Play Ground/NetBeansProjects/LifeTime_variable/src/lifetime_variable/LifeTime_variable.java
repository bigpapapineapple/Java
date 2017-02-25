/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifetime_variable;

/**
 *
 * @author luigifranciosi
 */
public class LifeTime_variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        
        for(x=0; x < 5; x++){
            int y = -1;
            System.out.println("y is: " + y);
            
            y = 100;
            System.out.println("y is now : " + y);
        }
    }    
}
