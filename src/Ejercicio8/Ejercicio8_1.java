/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Ejercicio8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // OPCION A
        int dec;
        int uni;
        int numeroInvertido;
        int valor;
        
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce un valor: ");
        valor = s.nextInt();
        
        dec = valor/10;
        uni = valor%10;
        numeroInvertido = uni*10;
        numeroInvertido = numeroInvertido+dec;
        
        System.out.println("(Opción A)El nuevo numero es " + numeroInvertido);
        
        // OPCION B
        
        String cadenaInvertida = ""+uni+dec;
        int numeroIvertido2 = Integer.parseInt(cadenaInvertida);
        System.out.println("(Opción B) El número invertido es: " +numeroIvertido2);
        
    }
    
}
