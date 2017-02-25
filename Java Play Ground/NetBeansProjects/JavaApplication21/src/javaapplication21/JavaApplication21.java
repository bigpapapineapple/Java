/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

/**
 *
 * @author luigifranciosi
 */
public class JavaApplication21 {

    public static void main(String args[]) 
        throws java.io.IOException {
        
        char ch, answer = 'k';
        
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        
        ch = (char) System.in.read();
        
        if(ch == answer) System.out.println("** Right **");
        else System.out.println("you're a fucking idiot");
    }

}
