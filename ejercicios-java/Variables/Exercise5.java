/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

/**
 *
 * @author danielzorfon
 */
public class Exercise5 {
    static final int IVA = 21;
    
    public static void main(String[] args) {
        
        int bill = 45;
        
        var calculoIVA = (bill*IVA)/100;
        
        var totalconIVA = bill + calculoIVA;
        
        System.out.println("El total de "+ bill + " con IVA es: " + totalconIVA);
    }
}
