


package scanner;
import java.util.Scanner;


public class Scanner04 {
    static Scanner pregunta = new Scanner(System.in);
    
    public static void main(String[] args) {
       
       System.out.println("Introduce el numeor de euros: ");
        
       int euros = pregunta.nextInt();
       double pesoMexicano = 21.09;
       var converter = euros * pesoMexicano;

       System.out.println("El total de pesos mexicanos es: " + converter);
    }
}

