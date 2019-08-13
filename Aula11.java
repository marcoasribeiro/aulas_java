package Aulas_01;

import java.util.Scanner;



public class Aula11{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // variaveis
        
        double  base, altura;
        
        System.out.println("informe o valo da base ");
        base = input.nextDouble();
        
        System.out.println("informe o valo da Altura ");
        altura = input.nextDouble();
        
              
        double quadrado;
        quadrado = base * altura;
        
        
        System.out.println("A area do retangulo é ="+base);
         System.out.println("A altura do retangulo é ="+ altura);
         System.out.println("O tamanho do retangulo e :"+quadrado );
                        
    }
    
    
    
    
    
}