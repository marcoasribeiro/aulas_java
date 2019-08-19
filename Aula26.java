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
public class Aula26 {
    public static void main ( String [] args){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Digite um numero de 0 a 10");
        int numero = input.nextInt();
        
        
        for(int i = 0; i <= 10; ++i){
            
        if(i == numero){    
        System.out.println("O seu numero é " +i);
        // quebra a procura quando encontra
        break;      
        
   }else{ 
           System.out.println("O seu numero não é " +i);
           
           // continua a busca ate o fim da lista
           //continue;
                      
           }     
        System.out.println("XXXXXXXXXXX " );
        
    }
    }
}
    