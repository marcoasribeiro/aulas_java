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
public class Aula14 {
    public static void main(String[] args){
        
     Scanner input = new Scanner(System.in);
     
    System.out.println("inserir o valor me gramas");
    int gramas = input.nextInt();
    
    
    int Kilos = gramas / 1000;
    gramas = gramas % 1000;
    
    
     
        System.out.println("Total de kilos é = "  +Kilos);
        System.out.println("Total de gramas e = "  +gramas);
        
    }
    
}
