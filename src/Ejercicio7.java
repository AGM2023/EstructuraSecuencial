
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1;
        int var2;
        
        int medio;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce el primer valor: ");
        var1 = s.nextInt();
        
        System.out.printf("Introduce el segundo valor: ");
        var2 = s.nextInt();
        
        medio = var1;
        var1 = var2;
        var2 = medio;
        
        System.out.printf("El valor de la primera variable es: %d\nEl valor de la segunda variable es: %d\n", var1, var2);
        
        
        
        
    }
    
}
