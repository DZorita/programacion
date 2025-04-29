
package scanner;

import java.util.Scanner;

public class Scanner01 {
    static Scanner pregunta = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce un primer valor: ");
        
        int x = pregunta.nextInt();
        
        System.out.println("Introduce un segundo valor: ");
        
        int y = pregunta.nextInt();
        
        
        int suma = x + y;
        int substraction = x - y;
        int division = x / y;
        int multiplication = x * y;
        
        System.out.println("Este es el valor x: " + x);
        System.out.println("Este es el valor y: " + y);
        System.out.println("La suma de las dos variables: " + suma);
        System.out.println("La resta de las dos variables: " + substraction);
        System.out.println("La division de las dos variables: " + division);
        System.out.println("La multiplicacion de las dos variables: " + multiplication);
    }
    
    
}
