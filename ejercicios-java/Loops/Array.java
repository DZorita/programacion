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
public class Array {
    static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        double listaNotas[] = new double[5];
        double notas = 0;
        double totalNotas = 0;
        
        for (int i = 0; i < listaNotas.length; i++) {
            System.out.println("Introduce la nota del alumno " + i + ": ");
            notas = sc.nextDouble();
            listaNotas[i] = notas;
        }
        int alumno = 1;
        for (double nota : listaNotas) {
            System.out.println("La nota del alumno " + alumno + ": " + nota);
            totalNotas += nota;
            alumno++;
         }
           System.out.println("La media de todas la notas es " + totalNotas/listaNotas.length);
        }
}
