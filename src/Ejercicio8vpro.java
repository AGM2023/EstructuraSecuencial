
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Adrian
 */
public class Ejercicio8vpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int decm;
        int unidm;
        int cent;
        int dec;
        int unid;
        int valor;
        Scanner s = new Scanner(System.in);
        
        System.out.printf("Introduce un numero valor: ");
        valor = s.nextInt();
        
        decm = valor%10;
        unidm = (valor/10)%10;
        cent = (valor/100)%10;
        dec = (valor/1000)%10;
        unid = (valor/10000)%10;
              
        System.out.printf("%d%d%d%d%d\n", decm, unidm, cent, dec, unid);
        
    }
    
}
