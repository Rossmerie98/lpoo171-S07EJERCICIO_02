/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio_02;

import java.util.Scanner;
/**
 *
 * @author freddypc2
 */
public class S07EJERCICIO_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);
        System.out.println("Escribe el radio: ");
        int number1 = Integer.parseInt(reader.nextLine());                
        
        double cir = 2 * Math.PI * number1;
        String toPrint = "\nLa Circunferencia del circulo es: " + cir;
        System.out.println(toPrint);  
    }
    
}
