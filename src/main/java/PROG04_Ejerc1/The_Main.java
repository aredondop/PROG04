/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG04_Ejerc1;

/**
 *
 * @author Ángel
 * Ejercicio 1:
 * Clase Main para calcular la tabla de multiplicar para un nº menor que 30
 * por medio de 3 bucles distintos
 */

import java.util.Scanner; //Biblioteca para poder añadir el input

public class The_Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
       
        System.out.println("Introduce un numero menor que 30 ");
        int numero =  input.nextInt();
            
        if( numero >= 30){
            System.out.println("El numero es mayor que 30");
        }else{
                
            //Calculamos con for. Quizá el más compacto
            System.out.println("Tabla de multiplicar para "+ numero+ " usando FOR");
            for( int i = 1; i <= 10; i++ ){
               System.out.println(numero + " * "+ i +" = "+ (numero*i) ); 
            }
            
            System.out.println("\n*** \n");
            
            //Calculamos con while. Quizá el más eficiente
            System.out.println("Tabla de multiplicar para "+ numero+ " usando WHILE");
            int w = 1;
            while( w <= 10 ){
               System.out.println(numero + " * "+ w +" = "+ (numero*w) ); 
               ++w;
            }
            
            System.out.println("\n*** \n");
            
            //Calculamos con do while. Como el anterior, pero peor para escribir
            System.out.println("Tabla de multiplicar para "+ numero+ " usando DO WHILE");
            int dw = 1;
            do{
               System.out.println(numero + " * "+ dw +" = "+ (numero*dw) ); 
               ++dw;
            }while( dw <= 10 );
        }
       
        
    }
    

    
}
