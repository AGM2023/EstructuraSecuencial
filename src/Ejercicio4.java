
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float gfahrenheit;
        float gcelsius;
        Scanner s = new Scanner (System.in);
        
        System.out.printf("Introduce los grados Fahrenheit: ");
        gfahrenheit = s.nextInt();
        gcelsius = (gfahrenheit-32)*5/9;
        
        System.out.println(gfahrenheit + " grados Fahrenheit equivalen a" + gcelsius + "grados Celsius" );
        System.out.printf("%.1f grados Fahrenheit equivalen a %.1f grados Celsius\n", gfahrenheit, gcelsius);
    }
    
}
