/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Aula25 {
    public static void main(String[] args){
                                     
       
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean acertou = false;
        int tentativas = 10;
        int numeroSecreto = random.nextInt();
        long chute = 0;
        
       // mostra o numero escolhido pelo computador 
        //System.out.println(numeroSecreto);
        while(tentativas > 0 && acertou == false){
            System.out.println("Qual seu chute?");
            chute = input.nextLong();
            
            if(numeroSecreto == chute){
             System.out.println("Voce acertou");    
             acertou = true;
             
         }else if(chute < numeroSecreto){
             -- tentativas;
             System.out.println("NUmero muito pequeno" + tentativas + " restantes");
             
             
             
         }else{
              -- tentativas;
             System.out.println("NUmero muito grande" + tentativas + " restantes");
        }   
    
       
    }
    
    }
}