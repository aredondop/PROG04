/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG04_Ejerc5;

/**
 * 
 * @author Ángel
 * Ejercicio 5: 
 * Clase Main con Script para llevar el conteo del número de divisiones hechas hasta encontrar
 * errores o escapar cuando en ambos se introduzca un -1 
 */

import java.util.Scanner; //Biblioteca para poder añadir el input

public class The_Main {
    
    public static void main(String[] args) {
        
        //Declaramos lo elemental
        int divisor = 0, dividendo = 0, total = 0;
        boolean escape = false;
        
        Scanner input = new Scanner(System.in); 
        
        while( escape == false ){
            System.out.println("Introduce el divisor:");
            divisor = input.nextInt();
            System.out.println("Introduce el dividendo:");
            dividendo = input.nextInt();

            try{
                System.out.println("El total es " + divisor/dividendo ); //Ahorramos declarar variable
            }catch(ArithmeticException e){
                System.out.println("Error. Se ha encontrado un 0");   
            }finally{ 
                total++;
            }
            //Separamos la lógica de control de los cálculos
            if( dividendo == -1 & divisor == -1 )
                escape = true;
        }
        
        System.out.println("Total de " +  total + " divisiones");
    }
    
}
