/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG04_Ejerc2;

/**
 *
 * @author Ángel
 * Ejercicio 2:
 * Clase Main para calcular si hasta 5 numeros dados son primos o no
 */

import java.util.Scanner; //Biblioteca para poder añadir el input

public class The_Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        for( int i = 1; i < 6; i++){
            System.out.println("Introduce un numero. Posicion " + i);
            int numero =  input.nextInt();
            
            if( esNegativo(numero) == true){
                System.out.println("El numero es negativo");
            }else{
                System.out.println( "El numero " + numero + " " + ((esPrimo(numero) == true ) ? "es" : "no es") + " primo"  );
            }
        }
        
    }
    
    private static boolean esNegativo(int numero){
        boolean esNegativo = (numero > 0 ) ? false:true;
        return esNegativo;
    }
    
    private static boolean esPrimo(int numero){      
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
    
}
