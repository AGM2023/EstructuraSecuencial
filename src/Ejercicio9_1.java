
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        String apellido1;
        String apellido2;
        
        Scanner s = new Scanner (System.in);
        
        System.out.printf("Introduce tu nombre: ");
        nombre = s.nextLine();
        
        System.out.printf("Introduce tu primer apellido: ");
        apellido1 = s.nextLine();
        
        System.out.printf("Introduce tu segundo apellido: ");
        apellido2 = s.nextLine();
        
        char letranom = nombre.charAt(0);
        char letraap1 = apellido1.charAt(0);
        char letraap2 = apellido2.charAt(0);
        System.out.printf("Tus iniciales son %s %s %s\n", letranom, letraap1, letraap2);
        
        
        
    }
    
}
