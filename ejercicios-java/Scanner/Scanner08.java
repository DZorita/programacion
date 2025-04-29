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
public class Scanner08 {
    static Scanner pregunta = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce el numero de horas hechas a la semana: ");
        int horas = pregunta.nextInt();
        
        int precio_hora = 12;
        
        int total_pagar = horas * precio_hora;
        
        System.out.println("El total que te tienen que pagar es " + total_pagar);
    }
}
