
import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays1D {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("  ");
            System.out.println("Menu: ");
            System.out.println("[1] Exercise1");
            System.out.println("[2] Exercise2");
            System.out.println("[3] Exercise3");
            System.out.println("[4] Exercise4");
            System.out.println("[5] Exercise5");
            System.out.println("[6] Exercise6");
            System.out.println("[7] Exercise7");
            System.out.println("[8] Exercise8");
            System.out.println("[X] salir");
            System.out.println("      ");
            System.out.println("Elige una opcion:");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    ejercicio01();
                    break;
                case "2":
                    ejercicio02();
                    break;
                case "3":
                    ejercicio03();
                    break;
                case "4":
                    ejercicio04();
                    break;
                case "5":
                    ejercicio05();
                    break;
                case "6":
                    ejercicio06();
                    break;
                case "7":
                    ejercicio07();
                    break;
                case "8":
                    ejercicio08();
                    break;
                case "X":
                    System.out.println("Saliendo de los ejercicios");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (!opcion.equals("X"));
    }

    public static void ejercicio01() {
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Dime 10 numeros:");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
        
        System.out.println("Al reves:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
    

    public static void ejercicio02() {
        int lista_numero[] = new int[20];
        int lista_cuadrados[] = new int[20];
        int lista_cubos[] = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduzca 20 numeros: ");
            int numero = sc.nextInt();
            lista_numero[i] = numero;
            lista_cuadrados[i] = lista_numero[i] * lista_numero[i];
            lista_cubos[i] = lista_numero[i] * lista_numero[i] * lista_numero[i];
        }
        
        System.out.println("Numero     Cuadrado    Cubo");
        for (int i = 0; i < 20; i++) {
            System.out.println(lista_numero[i] + "\t" + lista_cuadrados[i] + "\t\t" + lista_cubos[i]);
        }
    }
    
    

    public static void ejercicio03() {
        int numero_lista[] = new int[10];
        int maximo = numero_lista[0];
        int minimo = numero_lista[0];
        int posicion_maximo = 0;
        int posicion_minima = 0;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime 10 numeros:");
            numero_lista[i] = sc.nextInt();
        }
        
        for (int i = 1; i < numero_lista.length; i++) {
            if (numero_lista[i] > maximo) {
                maximo = numero_lista[i];
                posicion_maximo = i;
            }
            if (numero_lista[i] < minimo) {
                minimo = numero_lista[i];
                posicion_minima = i;
            }
        }
        
        for (int i = 0; i < numero_lista.length; i++) {
            if (i == posicion_maximo) {
                System.out.println("De la lista el numero maximo es: " + numero_lista[i]);
            } else if (i == posicion_minima) {
                System.out.println("De la lista el numero minimo es: " + numero_lista[i]);
            } else {
                System.out.println("Error");
            }
        }
    }

    
    
    public static void ejercicio04() {
        String lista_palabras[] = new String[15];
        String final_palabra = lista_palabras[14];
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Dime una palabra:");
            String palabras = sc.next();
            lista_palabras[i] = palabras;
        }

        for (int i = 14; i > 0; i--) {
            lista_palabras[i] = lista_palabras[i-1];
        }

        lista_palabras[0] = final_palabra;
        
        System.out.println("Palabras rotadas:");
        for (String palabra : lista_palabras) {
            System.out.println(palabra);
        }
    }

    
    
    public static void ejercicio05() {
        int lista_numeros_random[] = new int[100];
        
        for (int i = 0; i < lista_numeros_random.length; i++) {
            lista_numeros_random[i] = (int) (Math.random() * 21);
        }
        
        System.out.println("Lista con numeros random:");
        for (int num : lista_numeros_random) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("numero a reemplazar: ");
        int numero_reemplazar = sc.nextInt();
        System.out.println("numero nuevo: ");
        int numero_nuevo = sc.nextInt();
        
        
        for (int i = 0; i < lista_numeros_random.length; i++) {
            if (lista_numeros_random[i] == numero_reemplazar) {
                lista_numeros_random[i] = numero_nuevo;
            }
        }
        
        System.out.println("La lista modificada:");
        
        for (int num : lista_numeros_random) {
            if (num == numero_nuevo) {
                System.out.print("(" + num + ")");
            } else {
                System.out.print(num + " ");
            }
        }
    }

    
    
    public static void ejercicio06() {
        int lista_numeros[] = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Dime 8 numeros:");
            int numero = sc.nextInt();
            lista_numeros[i] = numero;
        }
        
        for (int num : lista_numeros) {
            if (num % 2 == 0) {
                System.out.println("El numero" + num + " es par");
            } else {
                System.out.println("El numero" + num + " es impar");
            }
        }
    }
    
    
    

    public static void ejercicio07() {
        int lista_numeros[] = new int[10];
        int lista_primos[] = new int[10];
        int lista_noPrimos[] = new int[10];
        int lista_final[] = new int[10];
        boolean esprimo = true;
        int primos = 0;
        int noprimos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un numeros:");
            int numero = sc.nextInt();
            lista_numeros[i] = numero;
        }
        
        
        for (int numero_primo : lista_numeros) {
            if (numero_primo < 1) {
                esprimo = false;
            } else{
                for (int i = 2; i <= numero_primo / 2; i++) {
                    if (numero_primo % i == 0) {
                        esprimo = false;
                        break;
                    }
                }
            }
            if (esprimo) {
                lista_primos[primos++] = numero_primo;
            } else {
                lista_noPrimos[noprimos++] = numero_primo;
            }
        }
        for (int i = 0; i < primos; i++) {
            lista_final[i] = lista_primos[i];
        }
        for (int i = 0; i < noprimos; i++) {
            lista_final[primos + i] = lista_noPrimos[i];
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Resultado: " + lista_final[i]);
        }
    }
    
    
    
    
    
    public static void ejercicio08(){
        String listaoriginal[] = new String[8];
        String listaresultado[] = new String[8];
        String lista_colores[] = new String[8];
        String color[] = new String[8];
        String Nocolor[] = new String[8];
        int posicionColor = 0;
        int posicionNoColor = 0;
        
        
        lista_colores[0] = "green";
        lista_colores[1] = "red";
        lista_colores[2] = "blue";
        lista_colores[3] = "orange";
        lista_colores[4] = "pink";
        lista_colores[5] = "black";
        lista_colores[6] = "white";
        lista_colores[7] = "purple";
        
        
        for (int i = 0; i < listaoriginal.length; i++) {
            System.out.println("Introduzca una palabra: ");
            String palabra = sc.next();
            listaoriginal[i] = palabra;
        }
        
        for (String palabra : listaoriginal) {
            boolean SiesColor = true;
            
            for (String colores : lista_colores) {
                if (palabra.equals(colores)) {
                    listaresultado[posicionColor++] = palabra;
                    SiesColor = false;
                    break;
                }
            }
            if (SiesColor) {
                listaresultado[7 - posicionNoColor] = palabra;
                posicionNoColor++;
            }
        }
        
        System.out.println("    ");
        System.out.println("Array Resultado: ");
        for (String resultado : listaresultado) {
            System.out.println(resultado);
        }

    }
}