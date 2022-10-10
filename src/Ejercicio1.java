
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1;
        double num2;
        double num3;
        double resultado;
        Scanner s = new Scanner(System.in);
        
        
        System.out.printf("Introduce el primer número: ");
        num1 = s.nextDouble();
        
        System.out.printf("Introduce el segundo número: ");
        num2 = s.nextDouble();
        
        System.out.printf("Introduce el tercer número: ");
        num3 = s.nextDouble();
        
        resultado = (num1+num2+num3)/3;
        System.out.printf("La media de los tres números es: %.2f\n", resultado);
    }
    
}
