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
public class Scanner09 {
    static Scanner pregunta = new Scanner(System.in);
    static final double PI = 3.1416;
    
    public static void main(String[] args) {
        System.out.println("Introduce el radio: ");
        double radio = pregunta.nextDouble();
        
        System.out.println("Cuanto mide la altura: ");
        double altura = pregunta.nextDouble();
        
        double base = PI * radio * radio * altura; 
       
        double cono = base / 3;
        
        System.out.println("El volumen del cono es: " + cono);
    }
}
