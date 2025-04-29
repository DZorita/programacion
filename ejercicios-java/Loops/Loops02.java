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
public class Loops02 {
    static Scanner sc = new Scanner(System.in);
    
    
    static void Exercise01(){
        System.out.println("Dime un nunmero: ");
        int numero = sc.nextInt();
        
        int suma = 0;
        
        while(numero>0){
           suma = suma + numero % 10;
           numero = numero / 10; 
        }
        System.out.println("El resultado  " + suma);
    }
    
    static void Exercise02(){
        System.out.println("Pon una palabra: ");
        String palabra = sc.next();
        
        System.out.println("Pide un carcter: ");
        char caracter = sc.next().charAt(0);
        
        int contador = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter) {
                contador = contador + 1;
            }
        }
        System.out.println("El numero total de caracteres que hay es: " + contador);
    }
    
    
    static void Exercise03(){
        System.out.println("Diem una palbra: ");
        String word = sc.next();
        
          for (int i = 0; i < word.length(); i++){
              for (int j = 0; j < i; j++) {
                  System.out.print("  ");
              }
              char caracter = word.charAt(i);
              System.out.println(caracter);
          }
    
    }
    
    
    static void Exercise04(){
        int columnas = 10;
        int filas = 10;
        
       System.out.print("\t"); 
        for (int i = 1; i <= columnas; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
       
        for (int i = 1; i <= filas; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= filas; j++) {
                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }
    
    }
    
    
    static void Exercise05(){
        System.out.println("Quieres entrar en partida(S/N): ");
        String partida = sc.next();
        
        int HP_hero = 100;
        int HP_enemy = 80;
        
        int AV_hero_espada = 20;
        int AV_hero_golpe = 10;
        
        int AV_enemy_espada = 15;
        int AV_enemy_golpe = 5;
        String ataque;
        
        while (partida.equals("S")) {
            System.out.println("Escoge tu jugador(Hero/Enemy):");
            String jugador = sc.next();
            
            if (jugador.equals("Hero")) {
                System.out.println("Player: Hero");
                System.out.println("HitPoint: " + HP_hero);
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("¡EMPIEZA LA PARTIDA!");
                System.out.println("    ");
                System.out.println("    ");
                
                while (HP_enemy != 0) {

                    System.out.println("Elige un ataque (golpe/espada): ");
                    ataque = sc.next();

                    switch (ataque) {
                        case "espada":
                            System.out.println("Has atacdo con espada.");
                            HP_enemy -= AV_hero_espada;
                            System.out.println("Al enemigo le queda: " + HP_enemy);
                            break;
                        case "golpe":
                            System.out.println("Has atacdo con golpe.");
                            HP_enemy -= AV_hero_golpe;
                            System.out.println("Al enemigo le queda: " + HP_enemy);
                            break;
                        default:
                            System.out.println("No hay ataque");
                    }
                }
                if (HP_enemy == 0) {
                        System.out.println("Has derrotado al Enemigo.");
                        break;
                    }
            }
            
            else{
                System.out.println("Player: Enemy");
                System.out.println("HitPoint: " + HP_enemy);
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("   ");
                System.out.println("¡EMPIEZA LA PARTIDA!");
                System.out.println("    ");
                System.out.println("    ");

                while (HP_hero != 0) {

                    System.out.println("Elige un ataque (golpe/espada): ");
                    ataque = sc.next();

                    switch (ataque) {
                        case "espada":
                            System.out.println("Has atacdo con espada.");
                            HP_hero -= AV_enemy_espada;
                            System.out.println("Al enemigo le queda: " + HP_hero);
                            break;
                        case "golpe":
                            System.out.println("Has atacdo con golpe.");
                            HP_hero -= AV_enemy_golpe;
                            System.out.println("Al enemigo le queda: " + HP_hero);
                            break;
                        default:
                            System.out.println("No hay ataque");
                        }
                }
                if (HP_hero == 0) {
                        System.out.println("Has derrotado al Enemigo.");
                        break;
                    }
               }
           
        }
    }
    
    static void Exercise06(){
        
        int numAlumno = 1;
        int sumaNotas = 0;
        int maximo = 5;
        int alumnosTotal = 5;
        
        do {
            System.out.println("Introduzca la nota del alumno: ");
            int notaAlumno = sc.nextInt();
            sumaNotas += notaAlumno;
            maximo -= 1;
            
        } while (maximo != 0);
        
       double media = sumaNotas/alumnosTotal;
        System.out.println("La nota media de los alumnos es " + media);
        
    }
    
    static void Exercise07(){
        
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        boolean es_primo = true;
        
        for (int i = 2; i <= (num-1); i++) {
            while (num % i == 0) {
                es_primo = false;
                System.out.println(i + " es divisible entre " + num);
                break; 
            }
        }
        if (es_primo) {
            System.out.println("El numero " + num + " NO es primo.");
        }
        else{
            System.out.println("El numero " + num + " es primo.");
        }
    
    }
    
    
    public static void main(String[] args) {
    String opcion;
    do{
            System.out.println("  ");
            System.out.println("Menu: ");
            System.out.println("[1]Exercise");
            System.out.println("[2]Exercise");
            System.out.println("[3]Exercise");
            System.out.println("[4]Exercise");
            System.out.println("[5]Exercise");
            System.out.println("[6]Exercise");
            System.out.println("[7]Exercise");
            System.out.println("[X] Exit");
            System.out.println("      ");
            System.out.println("Enter option:");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    Exercise01();
                    break;
                case "2":
                    Exercise02();
                    break;
                case "3":
                    Exercise03();
                    break;
                case "4":
                    Exercise04();
                    break;
                case "5":
                    Exercise05();
                    break;
                case "6":
                    Exercise06();
                    break;
                case "7":
                    Exercise07();
                    break;
                case "X":
                    System.out.println("Salir Ejercicio Loop01");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
    
    } while (!opcion.equals("X"));
    
    
}
}

