
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double comprasd;
        double descuento;
        double compracd;
        double porcentaje = 15;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("¿Cuánto es el total de la compra sin descuento? ");
        comprasd = s.nextDouble();
        descuento = comprasd*(porcentaje/100);
        compracd = comprasd-descuento;
        
        System.out.printf("El total de la compra con descuento es: %.2f\n", compracd);
    }
    
}
