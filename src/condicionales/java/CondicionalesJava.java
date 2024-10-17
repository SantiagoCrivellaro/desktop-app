/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales.java;

import java.util.Scanner;

/**
 *
 * @author Santi
 */
public class CondicionalesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int edad;
      
      Scanner teclado = new Scanner(System.in);
      
        System.out.println("Ingrese la edad : ");
        edad = teclado.nextInt();
        if (edad > 18) {
            System.out.println("Sos mayor de 18, vamos a ver porno!");
        } else {
            
            if (edad ==  18) {
                System.out.println("Tenes 18");
            } else  {
            System.out.println("No podes ver porno :(");
        }
    }
}
}
   

