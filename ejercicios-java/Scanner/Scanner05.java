/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;

import java.util.Scanner;

/**
 *
 * @author danielzorfon
 */
public class Scanner05 {
    static final int IVA = 21;
    static Scanner pregunta = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce un valor: ");
        
        int bill = pregunta.nextInt();
        
        var calculoIVA = (bill*IVA)/100;
        
        var totalconIVA = bill + calculoIVA;
        
        System.out.println("El total de "+ bill + " con IVA es: " + totalconIVA);
    }
}

