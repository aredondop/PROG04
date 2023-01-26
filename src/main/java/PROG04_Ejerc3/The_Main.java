/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG04_Ejerc3;

/**
 *
 * @author Ángel
 * Ejercicio 3:
 * Clase Main para calcular el Mínimo Común Múltiplo
 */

import java.util.Scanner; //Biblioteca para poder añadir el input

public class The_Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce un numero positivo");
        int numero1 =  input.nextInt();
        
        System.out.println("Introduce otro numero positivo");
        int numero2 =  input.nextInt();
        
        if( esNegativo(numero1) != false & esNegativo(numero2) != false ){
           System.out.println("Vaya. Ambos numeros son negativos"); 
        }else{
            System.out.println("El minimo comun multiplo de "+ numero1 + " y "+ numero2 +" es "+ getMCM(numero1,numero2) ); 
            
            System.out.println("El maximo comun divisor de "+ numero1 + " y "+ numero2 +" es "+ getMCD(numero1,numero2) ); 
        }
                
        
    }
    
    private static boolean esNegativo(int numero){
        boolean esNegativo = (numero > 0 ) ? false:true;
        return esNegativo;
    }
    
    //Qué depresion tener que calcular el mcm y el mcd tantos años después
    private static int getMCD(int numero1, int numero2){
        /**
         * Para el Máximo común divisor
         * vamos dándole vueltas a los números para quedarnos con 
         * el más chico
         */
        
        int tmp;
        while( numero2 != 0){
            tmp = numero2;
            numero2 = numero1%numero2;
            numero1 = tmp;
        }
        return numero1;
    }
    
    private static int getMCM(int numero1, int numero2){
        /**
         * Para el Minumo común múltiplo
         * nos hace falta el MCD para calcularlo
         */
        return (numero1 *  numero2) / getMCD(numero1, numero2);
    }
}


