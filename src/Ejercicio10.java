
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o
10 céntimos)
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double mon2e;
        double mon1e;
        double mon50cts;
        double mon20cts;
        double mon10cts;
        double total;
        Scanner s = new Scanner (System.in);
        
        System.out.printf("Introduce las monedas de 2€ que tienes: ");
        mon2e = s.nextInt();
        mon2e = mon2e*2;
        
        System.out.printf("Introduce las monedas de 1€ que tienes: ");
        mon1e = s.nextInt();
        
        System.out.printf("Introduce las monedas de 50cts que tienes: ");
        mon50cts = s.nextInt();
        mon50cts = mon50cts*0.50;
        
        System.out.printf("Introduce las monedas de 20cts que tienes: ");
        mon20cts = s.nextInt();
        mon20cts = mon20cts*0.20;
        
        System.out.printf("Introduce las monedas de 10cts que tienes: ");
        mon10cts = s.nextInt();
        mon10cts = mon10cts*0.10;
        
        total = mon2e+mon1e+mon50cts+mon20cts+mon10cts;
        
        double centimos = total%1;
        double euros = total-centimos;
        centimos = centimos*100;
        
        
        System.out.println("-------------totales-------------");
        System.out.printf("En total tienes %.2f€\n", total);
        
        System.out.printf("Tienes %.0f euros y %.0f centimos\n", euros,centimos);
    }
    
}
