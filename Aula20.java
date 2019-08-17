/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_01;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Aula20 {
    public static void main(String[] args ){
                        
        Scanner input = new Scanner(System.in);
        
        System.out.println("insira o numero inteiro");
        int numero = input.nextInt();
        
        // duas condições
        if((numero % 2 != 0)&& (numero <= 20)){
        System.out.println("OK");
        
            
            
        }
    }
}   
        
    
    

