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
public class Aula18 {
    public static void main(String[] args ){
                        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();
        
        System.out.println("Qual o sua idade?");
        int idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("Voce e maior  de idade");
        }
        
        
        
    }
    
}
