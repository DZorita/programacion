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
public class Scanner06 {
    static Scanner pregunta = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un caracter;");
        String d = pregunta.next();
        
        System.out.println("Introduce un caracter;");
        String a = pregunta.next();
        
        System.out.println("Introduce un caracter;");
        String n = pregunta.next();
        
        System.out.println("Introduce un caracter;");
        String i = pregunta.next();
        
        System.out.println("Introduce un caracter;");
        String e = pregunta.next();
        
        System.out.println("Introduce un caracter;");
        String l = pregunta.next();
        
        
        System.out.println("Mi nombre es: " + "" + d + a + n + i + e + l );
        
    }
}
