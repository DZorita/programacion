
package loops;

/**
 *
 * @author danielzorfon
 */
import java.util.Scanner;
public class Loops01 {
    
    static Scanner sc = new Scanner(System.in);
    
    static void Exercise01(){       
    String option;   
    do {
        System.out.println("Dime un numero entero del 0 al 100: ");
        String numeroStr = sc.next();
        int numero = Integer.parseInt(numeroStr);
        
        System.out.println("    ");
            System.out.println("  ");
            System.out.println("Menu: ");
            System.out.println("[1] Using for");
            System.out.println("[2] Using while");
            System.out.println("[3] Using do-while");
            System.out.println("[X] Exit");
            System.out.println("      ");
            System.out.println("Enter option:");
            option = sc.next();

            switch (option) {
                case "1":
                    For(numero);
                    break;
                case "2":
                    While(numero);
                    break;
                case "3":
                    DoWhile(numero);
                    break;
                case "X":
                    System.out.println("Salir Ejercicio Loop01");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        } while (!option.equals("X"));
    }
    
    static void For( int numero){
        for (int i = 0;(i < 100); i++) {
            
            if ( i % numero == 0) {
                System.out.println(i);
            }
            
        }
    }
    static void While(int numero){
        int i = 0;
        while (i < 100) {
            if (i % numero == 0) {
            System.out.println(i);
            }
            i += 1;
        }
    }
    
    static void DoWhile(int numero){
        int i = 0;
        do {
            if (i % numero == 0) {
            System.out.println(i); 
            }
            i += 1;
        } while (i <= 100);
    }
    
    
    
    static void Exercise02(){
    String option;
    do {
        System.out.println("\n");
        System.out.println("Enter an integer > 10: ");
        String numeroStr = sc.next();
        int numero = Integer.parseInt(numeroStr);
        
        System.out.println("    ");
            System.out.println("  ");
            System.out.println("Menu: ");
            System.out.println("[1] Using for");
            System.out.println("[2] Using while");
            System.out.println("[3] Using do-while");
            System.out.println("[X] Exit");
            System.out.println("      ");
            System.out.println("Enter option:");
            option = sc.next();
            
            
            switch (option) {
                case "1":
                    for (int i = numero; i >= 0; i -= 10) {
                        System.out.println("El resultado es: ");
                        System.out.println(i);
                    }
                    break; 
                case "2":
                    int i = numero;
                    while (i >= 0) {
                        System.out.println("El resultado es: ");
                        System.out.println(i);
                        i -= 10;
                    }
                    break;
                case "3":
                    int z = numero;
                    System.out.println("El resultado es: ");
                    do {
                        System.out.println(z);
                        z -= 10;
                    } while (z >= 0);
                    break;
                    
                case "X":
                    System.out.println("Salir Ejercicio Loop01");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        } while (!option.equals("X"));

    }
    
    static void Exercise03(){
    
        System.out.println("Introduce un numero: ");
        String numeroStr = sc.next();
        int numero = Integer.parseInt(numeroStr);
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
    }
    
    static void Exercise04(){
        System.out.println("Enter a integer: ");
        String integer = sc.next();
        int num = Integer.parseInt(integer);
       
        for (int i = 0; i < 5 ; i++) {
            int base = num * i;
            int base_cuadrado = base * base;
            int base_cubo = base * base * base;
            System.out.printf("%-8d %-9d %-4d\n", base, base_cuadrado,base_cubo);
        }
        
    }
    
    
    static void Exercise05(){
        
        boolean entrar = true;
        
        while (entrar == true) {
            System.out.println("Introduce un numero: ");
            int num = sc.nextInt();
            
            if (num > 0) {
                String numeros = String.valueOf(num);
                int digitos = numeros.length();
                System.out.println("El total de digitos de " + num + " es " + digitos);
            }
            if (num < 0) {
                int number = num * -1;
                String numero = String.valueOf(number);
                int digitos = numero.length();
                System.out.println("El total de digitos de " + num + " es " + digitos);
                
            }
        }   
    }
    
    static void Exercise06(){
        
        int vidas = 3;
        int numero_random = (int) (Math.random()*11);
        
        while(vidas > 0){
            System.out.println("Adivina un numero del (1 - 10): ");
            int num = sc.nextInt();
            vidas -= 1;
            
            if (num == numero_random) {
                System.out.println("Has adivinado el numero!!");
            }
            else{
                System.out.println("No has adivinado el numero.");
            }
        }
        System.out.println("    ");
        System.out.println("Ya no tienes mas vidas.");
        
    }
    
    static void Exercise07(){
        System.out.print("Introduce la base: ");
        int base = sc.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = sc.nextInt();
        
       int resultado = 1;

        if (exponente == 0) {
            resultado = 1;
        } 
        else if (exponente > 0) 
            {
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }
        } 
        else {
            for (int i = 1; i <= -exponente; i++) {
                resultado *= base;
            }
            resultado = 1 / resultado;
        }
        System.out.println("El resultado final es: " + resultado);

    }
    
    
    public static void main(String[] args) {
    String opcion;
    
        do {
            
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
