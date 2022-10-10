
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String apellido1;
        String apellido2;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce tu nombre: ");
        nombre = s.nextLine();
        
        System.out.printf("Introduce tu primer apellido: ");
        apellido1 = s.nextLine();
        
        System.out.printf("Introduce tu segundo apellido: ");
        apellido2 = s.nextLine();
        
        System.out.printf("%.1s %.1s %.1s\n", nombre, apellido1, apellido2);
    }
    
}
