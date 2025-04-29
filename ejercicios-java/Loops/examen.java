/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author danielzorfon
 */
public class examen {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("Menu");
            System.out.println("ejercicio01");
            System.out.println("ejercicio02");
            System.out.println("x salir");
            opcion = scanner.next();
            switch (opcion) {
                case "1":
                    ejercicio01();
                    break;
                case "2":
                    ejercicio02();
                    break;
                case "X":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("eror");
            }
        } while (!opcion.equals("x"));
    }
    
    static void ejercicio01(){
        System.out.println("Introduce la temperatura: ");
        int temperatura = scanner.nextInt();
        
        System.out.println("Introduce (S/N) si lloviendo: ");
        String lloviendo = scanner.next();
        
        if ((temperatura > 25) && (lloviendo.equals("N"))) {
            System.out.println("Ir a la playa.");
        }
    }
    
    static void ejercicio02(){
        System.out.println("DIas: ");
        int dias = scanner.nextInt();
        
        int limite = 500;
        
        int todo = 0;
        
        for (int i = 0; i < dias; i++) {
            System.out.println("Intrduce la capacidad de agua del dia" +(i+1)+ ": ");
            int cap = scanner.nextInt();
            todo += cap;
            todo = todo + cap;
        }
        
        if (todo > limite) {
            System.out.println("EPAAAA, PARAAA, Que esto es el limite");
        }
        System.out.println("EL total de capacidad: " + todo);
    }
}
