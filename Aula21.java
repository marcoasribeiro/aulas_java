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
public class Aula21 {
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o ano");
        
        int ano = input.nextInt();
        
        
        boolean x = (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
        
        System.out.println("Bissexto");
        System.out.println(x);
        
        
    }
        }
    

