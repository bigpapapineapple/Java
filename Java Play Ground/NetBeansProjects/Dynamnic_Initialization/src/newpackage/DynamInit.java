/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author luigifranciosi
 */
public class DynamInit {
    public static void main(String args[]){
        double radius = 4, height = 5;
        
        //now Dynamically initialize volume
        double volume = 3.146 * radius * radius * radius * height;
        
        System.out.println("Volume is " + volume);
    }    
}
