

package scanner;
import java.util.Scanner;

public class Scanner03 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Introduce un nombre: ");
        String name = sc.next();
        
        System.out.println("Introduce una direccion: ");
        String address = sc.next();
        
        System.out.println("Introduce una Nº de Telefono: ");
        String phoneNumber = sc.next();
       
       System.out.println("Nombre: " + name);
       System.out.println("Direccion: " + address);
       System.out.println("Numero de Telefono: " + phoneNumber);
       
    }
}
