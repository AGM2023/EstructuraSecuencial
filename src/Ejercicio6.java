
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double parcial1;
        double parcial2;
        double parcial3;
        double examenfinal;
        double trabajofinal;
        
//        double promedio;
        double parcialfinal;
        double total;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce la nota del primer parcial: ");
        parcial1 = s.nextDouble();
        
        System.out.printf("Introduce la nota del segundo parcial: ");
        parcial2 = s.nextDouble();
        
        System.out.printf("Introduce la nota del tercer parcial: ");
        parcial3 = s.nextDouble();
        
        System.out.printf("Introduce la nota del examen final: ");
        examenfinal = s.nextDouble();
        
        System.out.printf("Introduce la nota del trabajo final: ");
        trabajofinal = s.nextDouble();
        
//      promedio = (parcial1+parcial2+parcial3)/3;
        parcialfinal = ((parcial1+parcial2+parcial3)/3) * 0.55;
        examenfinal = examenfinal*0.30;
        trabajofinal = trabajofinal*0.15;
        total = parcialfinal+examenfinal+trabajofinal;
        long totalredondo = Math.round(total);
        
        System.out.printf("Tu nota total es un %.2f\n", total);
        System.out.printf("Tu nota total redondeada es un %d\n", totalredondo);
        
        
        
    }
    
}
