/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.forirarraybinarysearch;

import java.util.Arrays;

/**
 *
 * @author Marce
 */
public class ForIrArrayBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {7,1,5,8,9};
        
        //Arrays.sort(v);
        int pos = Arrays.binarySearch(v, 5);
        
        System.out.println("Posicao: " + pos);
        
        for(int valor: v){
            System.out.println("Valores: " + valor);
        }
    }
    
}
