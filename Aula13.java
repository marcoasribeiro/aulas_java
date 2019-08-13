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
public class Aula13 {
    
    public static void main(String[] args){
        
        // consntante
        final double PI = 3.1456;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Raio");
        double raio = input.nextDouble() ;
        
        double area = raio * raio * PI;
        System.out.println("Digite o valor do area" + area);
        
        
        
    }
    
}
