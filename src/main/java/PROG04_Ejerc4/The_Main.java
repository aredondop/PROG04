/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROG04_Ejerc4;

/**
 * 
 * @author Ángel
 * Ejercicio 4
 * Clase Main con Juego para adivinar un número calculado aleatoriamente
 */

import java.util.Scanner; //Biblioteca para poder añadir el input
import java.lang.Math; //Biblioteca para poder añadir el random

public class The_Main {
    
    public static void main(String[] args) {

        Juego juego1 = new Juego();
        boolean enJuego = true, enMenu = true, salirJuego = false;
        Scanner input = new Scanner(System.in); 
       
            
            while( enJuego == true){
                mostrarMenu();
                int leerMenu = input.nextInt();
                
                switch(leerMenu){
                    
                    case 1:
                        System.out.println("Introduce el numero de intentos permitidos");
                        juego1.setNumInt( input.nextInt() );
                        System.out.println("Introduce el numero maximo");
                        juego1.setNumMax( input.nextInt() );
                    break;
                    
                    case 2:
                        juego1.setNumOculto();
                        System.out.println("¡Empieza el Juego!");
                        
                        while( salirJuego == false  ){
                            
                            juego1.infoJuego(); 
                            ++juego1.totInt;
                            
                            System.out.println("Introduce un numero entre 0 y "+ juego1.numMax);
                            int num = input.nextInt();
                            
                            if( num == juego1.numOculto ){
                                System.out.println("Has ganado!. Has necesitado "+ juego1.totInt + " intentos");
                                salirJuego = true;
                            }else
                                System.out.println("Vaya. " + juego1.pistaJuego( num ));

                            if(juego1.getTotInt() == juego1.numInt){
                                System.out.println("Perdiste!. Intentos consumidos");
                                salirJuego = true;
                            }

                        }
                    break;
                    
                    case 3: enJuego = false; break;
                    
                    default:
                        mostrarError();
                       
                }
                
                limpiarPantalla();
            }
    }
    
    private static void mostrarMenu(){
        System.out.println("##############################################");
        System.out.println("#              ADIVINA EL NUMERO             #");
        System.out.println("#              Pulsa un numero               #");
        System.out.println("#     1. Configurar, 2. Jugar, 3. Salir      #");
        System.out.println("##############################################");
    }
    
    private static void mostrarError(){
        System.out.println("Has introducido un caracter incorrecto. Vuelva a empezar");
    }
    
    /*
    private static void mostrarConfiguracion(){
        System.out.println("Introduce el numero de intentos permitidos");
        juego1.setNumInt( input.nextInt() );
    }
    */
   
    
    
    private static void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    /*
    private static void empiezaElJuego(){
            Juego juego1 = new Juego();
            Scanner input = new Scanner(System.in); 

            
            while( juego1.totInt < juego1.numInt){
                mostrarMenu();
                leerMenu = input.nextInt();
            }
            
        }
*/
    
    private static class Juego {
        int numInt, numMax, numOculto, totInt = 0;

        private Juego(){
            this.numInt = 5;
            this.numMax = 10;
        }

        private Juego( int numInt, int numMax){
            this.numInt = numInt;
            this.numMax = numMax; 
        }
        
        private int getNumInt (){ return this.numInt; }
        private int getNumMax (){ return this.numMax; }
        private int getTotInt (){ return this.totInt; }
        private int getNumOculto (){ return this.numOculto; }
        
        private void setNumInt( int numInt){ this.numInt = numInt; }
        private void setNumMax( int numMax){ this.numMax = numMax; }
        
        private void setNumOculto(){
            this.numOculto = (int)Math.floor(Math.random()*this.numMax+1);
        }
        
        private void infoJuego(){
            System.out.println("Tienes " + this.getNumInt() + "intento(s) y  has hecho " + this.getTotInt() + "intento(s)" );
        }
        
        private String pistaJuego( int numero ){
            String pista = (numero < this.numOculto ) ? "El numero oculto es mayor" : "El numero oculto es menor";
            return pista;
        }
        
    
    }
}
