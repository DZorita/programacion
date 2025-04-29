import java.util.Random;
import java.util.Scanner;

public class arraybidimensional {

    public static void main(String[] args) {
        char[][] tablero = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = '~';
            }
        }

        int[][] barco = new int[2][2];
        Random rand = new Random();

        boolean colocado = false;
        while (!colocado) {
            int fila = rand.nextInt(4);
            int col = rand.nextInt(4);

            if (col + 1 < 5 && fila + 1 < 5) {
                barco[0][0] = fila;
                barco[0][1] = col;
                barco[1][0] = fila + 1;
                barco[1][1] = col;
                colocado = true;
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("Tablero:");
            mostrarTablero(tablero);

            
            System.out.println("Introduce tu jugada (fila 1-5 y columna A-E): ");
            String jugada = scanner.nextLine();
            int fila = Integer.parseInt(jugada.substring(0, 1)) - 1;
            int col = jugada.charAt(1) - 'A';
            
            if ((fila == barco[0][0] && col == barco[0][1]) || (fila == barco[1][0] && col == barco[1][1])) {
                tablero[fila][col] = '*';
                System.out.println("Impacto! El barco ha sido alcanzado.");
            } else {
                tablero[fila][col] = 'x';
                System.out.println("Fallaste! No hay barco en esa posicion.");
            }
            if ((tablero[barco[0][0]][barco[0][1]] == '*' && tablero[barco[1][0]][barco[1][1]] == '*')) {
                System.out.println("¡Felicidades! Has hundido el barco enemigo.");
                juegoTerminado = true;
            }
        }

        System.out.println("Juego terminado. El tablero final es:");
        mostrarTablero(tablero);
    }


    public static void mostrarTablero(char[][] tablero) {
        System.out.print("  A B C D E\n");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
