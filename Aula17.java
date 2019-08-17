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
public class Aula17 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual seu primeiro nome");
        String  primeironome = input.next();
        
        
        System.out.println("Qual seu ultimo  nome");
         String  ultimonome = input.next();
        
         System.out.println("Qual sua idade");
         int idade = input.nextInt();
        
         
         System.out.println(" Ola "+ primeironome+ " "+ ultimonome+ " "+idade+"anos");
        
    }
    
}
