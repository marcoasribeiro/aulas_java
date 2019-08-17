/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas_01;

/**
 *
 * @author marco
 */
public class Aula15 {
    public static void main(String[] args){
        
        
        long totalmilisegundos = System.currentTimeMillis()-10800000;
        long totalsegundos = totalmilisegundos /1000;
        
        long segundoatual = totalsegundos / 60;
        long totalminutos = totalsegundos /60;
        
        long minutoatual = totalminutos %60;
        long totalhora = totalminutos /60;
        long horatual = totalhora %24;
        
        System.out.println(horatual + "." +minutoatual +"." + segundoatual);
        
    }
    
}
