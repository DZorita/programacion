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
public class Arrays01 {
    static Scanner sc = new Scanner(System.in);
    
    static void Ejercicio01(){
        int listaNumbers[] = new int[10];
        
        for (int i = 0; i < listaNumbers.length; i++) {
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            listaNumbers[i] = numero;
        }
        System.out.print("La Lista: ");
        
        for (int i = 9; i <= 10; i--) {
            System.out.print(listaNumbers[i] + ", ");
            if (i <= 0) {
                break;
            }
        }
        System.out.println("    ");
        
    }
    
    static void Ejercicio02(){
        int listaNumero[] = new int[20];
        int listaSquare[] = new int[20];
        int listaCube[] = new int[20];
        
        for (int i = 0; i < listaNumero.length; i++) {
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            listaNumero[i] = numero;
        }
        
        
    }
    
    static void Ejercicio03(){
        
    }
    
    static void Ejercicio04(){
        
    }
    
    static void Ejercicio05(){
        
    }
    
    static void Ejercicio06(){
        
    }
    
    static void Ejercicio07(){
        
    }
    
    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("        ");
            System.out.println("Menu:");
            System.out.println("1.  Ejercicio01");
            System.out.println("2.  Ejercicio02");
            System.out.println("3.  Ejercicio03");
            System.out.println("4.  Ejercicio04");
            System.out.println("5.  Ejercicio05");
            System.out.println("6.  Ejercicio06");
            System.out.println("7.  Ejercicio07");
            System.out.println("[X] Exit");
            System.out.println("        ");
            System.out.println("Introduzca una opcion: ");
            opcion = sc.next();
            
            switch (opcion) {
                case "1":
                    Ejercicio01();
                    break;
                case "2":
                    Ejercicio02();
                    break;
                case "3":
                    Ejercicio03();
                    break;
                case "4":
                    Ejercicio04();
                    break;
                case "5":
                    Ejercicio05();
                    break;
                case "6":
                    Ejercicio06();
                    break;
                case "7":
                    Ejercicio07();
                    break;
                case "X":
                    System.out.println("Salir del ejercicio.");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion.equals("X"));
    }
}
