

package scanner;
import java.util.Scanner;


public class Scanner02 {
   
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        
        System.out.println("Introduce Tu nombre: ");
        
        String name = sc.next();
        
        System.out.println("Tu nombre completo es  " + name);
       
    }
}
