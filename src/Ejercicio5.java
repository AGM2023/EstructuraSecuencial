
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double sueldobase;
        double totalsueldobase;
        double comision1;
        double comision2;
        double comision3;
        double totalcomision;
        
        Scanner s = new Scanner (System.in);
        
        System.out.printf("Introduce tu sueldo base: ");
        sueldobase = s.nextDouble();
        
        System.out.printf("Introduce tu primera venta: ");
        comision1 = s.nextDouble();
        
        System.out.printf("Introduce tu segunda venta: ");
        comision2 = s.nextDouble();
        
        System.out.printf("Introduce tu tercera venta: ");
        comision3 = s.nextDouble();
        
        comision1 = comision1*0.10;
        comision2 = comision2*0.10;
        comision3 = comision3*0.10;
        totalcomision = comision1+comision2+comision3;
        totalsueldobase = totalcomision+sueldobase;
        
        System.out.printf("Por las tres ventas, consigues una comisión total de: %.2f€\n", totalcomision);
        System.out.printf("En total con tu sueldo y comisiones, consigues: %.2f€\n", totalsueldobase);
        
    }
    
}
