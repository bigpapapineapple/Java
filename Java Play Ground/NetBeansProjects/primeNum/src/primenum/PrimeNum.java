/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenum;

/**
 *
 * @author luigifranciosi
 */
public class PrimeNum {

    public static void main(String[] args) {
        int i, j;
        boolean isprime;
        
        for(i=2; i < 100; i++){
            isprime = true;
            
            for(j=2; j <= i/j; j++)
                if((i%j) == 0) isprime = false;
            
            if(isprime)
                System.out.println(i + " is prime.");
        }
        
    }

}
