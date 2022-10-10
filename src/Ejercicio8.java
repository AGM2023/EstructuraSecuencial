
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dec;
        int unid;
        int valor;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce un numero valor: ");
        valor = s.nextInt();
        
        dec = valor%10;
        unid = valor/10;
              
        System.out.printf("%d%d\n", dec, unid);
        
    }
    
}
