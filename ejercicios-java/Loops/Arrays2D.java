package arrays;

import java.util.Scanner;
import java.lang.Math;

public class Arrays2D {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tablaJugador = new char[5][5];
        char[][] tablaResultado = new char[5][5];
        String[] columnas = {"A","B","C","D","E"};
        
        
        System.out.println("    ");
        System.out.println("Bienvenido a Battleship!");
        System.out.println("    ");
        System.out.println("Ataca a tu enemigo: ");
        hacertabla(tablaJugador);
        hacertabla(tablaResultado);
        
        imprimir(tablaJugador,columnas);
    }

    public static void hacertabla(char[][] tablaJugador) {
        for (int i = 0; i < tablaJugador.length; i++) {
            for (int j = 0; j < tablaJugador[i].length; j++) {
                tablaJugador[i][j] = '-';
            }
        }
    }

    public static void imprimir(char[][] tablaJugador, String[] columnas) {
        System.out.print("   ");
        for (int i = 0; i < columnas.length; i++) {
            System.out.print(columnas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < tablaJugador.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tablaJugador[i].length; j++) {
                System.out.print(tablaJugador[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void tablaFInal(char[][] tablaResultado, char[][] tablaJugador){
        int fila = (int) (Math.random() * 4);  
        int columna = (int) (Math.random() * 4); 

        tablaJugador[fila][columna] = '*';
        tablaJugador[fila][columna + 1] = '*';

        tablaJugador[fila][columna] = '*';
        tablaJugador[fila + 1][columna] = '*';

    }
    
    public static void comprobarFIlasCOlumnas(){
        
    }
  

}
