/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nest_var_diffnames;

/**
 *
 * @author luigifranciosi
 */
public class Nest_Var_diffNames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int count;
       
       for(count =0; count < 10; count = count+1){
           System.out.println("This is count: " + count);
           
           int count; 
           for(count = 0; count < 2; count++){
               System.out.println("This program is an error");
           }
       }
    }
}
