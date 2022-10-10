
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Area = Base * Altura = xcm2
        //Perimetro = 2*Base + 2*Altura = xcm
        
        double base;
        double altura;
        double area;
        double perimetro;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce la base del rectángulo: ");
        base = s.nextDouble();
        
        System.out.printf("Introduce la altura del rectángulo: ");
        altura = s.nextDouble();
        
        area = base*altura;
        perimetro = (2*base)+(2*altura);
//        System.out.printf("El área del rectángulo es: %dcm cuadrados\nEl perímetro del rectángulo es %dcm\n", area, perimetro); <-- Otra manera de mostrarlo con println
        System.out.printf("El área del rectángulo es: %.2f y el perímetro del rectángulo es: %.2f\n", area, perimetro);
        
        
    }
    
}
