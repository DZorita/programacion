
package model.validations;
import java.time.LocalDate;
 
/**
*
* @author danielzorfon
*/
public class UserDataValidations {
    
    
    /**
    *
    * Esta funcion valida si el parametro que pasamos 'id', es 
    * un NIF verdadero o falso.
    * 
    * El parametro que pasamos es 'id' que es el dato que validamos en la funcion.
    * 
    * Return: Dependiendo a las condiciones de las funciones si 
    * el 'id' es Verdadero, devolvemos la variable idOkay a true,
    * si es de lo contrario devolveremos false.
    * 
    */ 
    public static boolean checkId(int typedoc, String id){
        boolean idOkay = false;
        
        if (typedoc != 1) {
            return idOkay;
        }
        
        if (id.length() != 9) {
            return idOkay;
        }
        String numero_string = id.substring(0, 8);
        char ultima_letra = id.charAt(8);
        int numero = Integer.parseInt(numero_string);
        
        
        if (((numero % 23) == 0)) {
            if (ultima_letra == 'T') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 1)) {
            if (ultima_letra == 'R') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 2)) {
            if (ultima_letra == 'W') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 3)) {
            if (ultima_letra == 'A') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 4)) {
            if (ultima_letra == 'G') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 5)) {
            if (ultima_letra == 'M') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 6)) {
            if (ultima_letra == 'Y') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 7)) {
            if (ultima_letra == 'F') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 8)) {
            if (ultima_letra == 'P') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 9)) {
            if (ultima_letra == 'D') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 10)) {
            if (ultima_letra == 'X') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 11)) {
            if (ultima_letra == 'B') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 12)) {
            if (ultima_letra == 'N') {
                return idOkay = true;
            }
        } else if ((( numero % 23) == 13)) {
            if (ultima_letra == 'J') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 14)) {
            if (ultima_letra == 'Z') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 15)) {
            if (ultima_letra == 'S') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 16)) {
            if (ultima_letra == 'Q') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 17)) {
            if (ultima_letra == 'V') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 18)) {
            if (ultima_letra == 'H') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 19)) {
            if (ultima_letra == 'L') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 20)) {
            if (ultima_letra == 'C') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 21)) {
            if (ultima_letra == 'K') {
                return idOkay = true;
            }
        } else if (((numero % 23) == 22)) {
            if (ultima_letra == 'E') {
                return idOkay = true;
            }
        }
        return idOkay;
    }

    
    /**
    *
    * Esta funcion tiene un parametro que pasamos 'date', 
    * que valida el formato de la fecha y valida si su
    * valor es correcto.
    * 
    * El parametro que pasamos es 'date' que es el dato que validamos en la funcion.
    * 
    * Return: Dependiendo a las condiciones de la funcion si 
    * el 'date' es Verdadero, devolvemos la variable dateOkay a true,
    * si es de lo contrario devolveremos false.
    * 
    */ 
    public static boolean checkFormatDate(String date){
        boolean dateOkay = false;
        
        if (date.indexOf("/") == -1) {
            return dateOkay;
        }
        
        if (date.length() != 10) {
            return dateOkay;
        }
        
        
        
       String[] dateList = date.split("/");
       String diaString = dateList[0];
       String mesString = dateList[1];
       String añoString = dateList[2];
       int dia = Integer.parseInt(diaString);
       int mes = Integer.parseInt(mesString);
       int año = Integer.parseInt(añoString);
       
       
        if (mes < 1 || mes > 12) {
            return dateOkay;
        }
        
       
     
       
        switch (mes) {
            case 1:
                if (dia >= 1 && dia < 31) {
                    dateOkay = true;
                }
               break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                    if (dia >= 1 && dia < 29) {
                        dateOkay = true;
                    }
                }
                else {
                    if (dia < 1 || dia > 28) {
                        return false;
                    }
                }
               break;
            case 3:
                if (dia >= 1 && dia < 31) {
                    dateOkay = true;
                }
               break;
            case 4:
                if (dia >= 1 && dia < 30) {
                    dateOkay = true;
                }
               break;
            case 5:
                if (dia >= 1 && dia < 31) {
                    dateOkay = true;
                }
               break;
            case 6:
                if (dia >= 1 && dia < 30) {
                    dateOkay = true;
                }
               break;
            case 7:
                if (dia >= 1 && dia < 31) {
                    dateOkay = true;
                }
               break;
            case 8:
                if (dia >= 1 && dia < 31) {
                    dateOkay = true;
                }
               break;
            case 9:
                if (dia >= 1 && dia < 30) {
                    dateOkay = true;
                }
               break;
            case 10:
                if (dia >= 1 && dia < 30) {
                    dateOkay = true;
                }
               break;
            case 11:
                if (dia >= 1 && dia < 30) {
                    dateOkay = true;
                }
               break;
            case 12:
                if (dia >= 0 && dia < 31) {
                    dateOkay = true;
                }
               break;
            default:
                System.out.println("ERROR! el numero que ha introducido es incorrecto");
        }
        if (año < 10000) {
            dateOkay = true;
       }
 
        return dateOkay;
    }




     /**
    *
    * Esta funcion calcula la edad en base a la fecha de nacimiento.
    * Donde tambien validamos si la fecha es correcta.
    * 
    * El parametro que pasamos es 'birthDate' que es el dato que validamos en la funcion.
    * 
    * Return: Dependiendo de si las condiciones son correctas y la fecha sea valida
    * nos devolvera la edad calculada, en caso contarrio nos devolvera un -1.
    * 
    */ 
    public static int calculateAge(String birthDate){
        int edad = 0;
        String[] dateList = birthDate.split("/");
       String diaString = dateList[0];
       String mesString = dateList[1];
       String añoString = dateList[2];
       
       int dia = Integer.parseInt(diaString);
       int mes = Integer.parseInt(mesString);
       int año = Integer.parseInt(añoString);
       
       if (mes < 1 || mes > 12) {
            System.out.println("Error Mes!");
            return edad = -1;
        }
       int diasEnMes = 0;
       
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasEnMes = 31;
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                    diasEnMes = 29;
                    break;
                }
                else {
                    diasEnMes = 28;
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                diasEnMes = 30;
                break;
            default:
                System.out.println("Error Mes!");
        }
        
        if (dia < 1 || dia > diasEnMes) {
            System.out.println("Error Día!");
            return edad = -1; 
        }
        
        int mesDiario = LocalDate.now().getMonthValue();
        int diaDiario = LocalDate.now().getDayOfMonth();
        
        edad = LocalDate.now().getYear() - año;
        
        if ( mes > mesDiario || (mes == mesDiario && dia > diaDiario)) {
            edad--;
        }
 
        return edad;
    }


     /**
    *
    * Esta funcion nos valida si el formato del codigo postal es correcto.
    * 
    * El parametro que pasamos es 'zip' que es el dato que validamos en la funcion.
    * 
    * Return: En esta funcion nos devolvera true si es 
    * correcto el codigo postal, en caso contrario false.
    * 
    */ 
    public static boolean checkPostalCode(String zip) {
        boolean codigoPostal = true;
        if (zip.length() != 5) {
            return codigoPostal = false;
        }

        for (int i = 0; i < zip.length(); i++) {
            if (!Character.isDigit(zip.charAt(i))) {
                return codigoPostal = false;
            }
        }

        return codigoPostal;
    }

    
    
    /**
    *
    * Esta funcion nos valida si el formato 'str' es numerico.
    * 
    * El parametro que pasamos es 'str' que es el dato que validamos en la funcion.
    * 
    * Return: En esta funcion nos devolvera true si es numerico el
    * 'str', en caso contrario false.
    * 
    */ 
    public static boolean isNumeric(String str){
        boolean string = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return string = false;
            }
        }
        return string;
    }

    
    /**
    *
    * Esta funcion nos valida si el formato 'str' contiene letras.
    * 
    * El parametro que pasamos es 'str' que es el dato que validamos en la funcion.
    * 
    * Return: En esta funcion nos devolvera true si contiene letras 
    * el 'str', en caso contrario false.
    * 
    */
    public static boolean isAlphabetic(String str){
        boolean string = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                return string = false;
            }
        }
        return string;
    }
    
    
    
    /**
    *
    * Esta funcion nos valida si el string 'email' es un
    * email.
    * 
    * El parametro que pasamos es 'email' que es el dato que validamos en la funcion.
    * 
    * Return: En esta funcion nos devolvera true si el string 'email'
    * contiene '@', y la terminacion debe contener '.com o .es', en caso contrario
    * devolveremos false.
    * 
    */
    public static boolean checkEmail(String email) {
        boolean isEmail = false;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
            {
                for (int j = i + 1; j < email.length(); j++) {
                    if (email.charAt(j) == '.') {
                        String extension = email.substring(j + 1);
                        if (extension.equals("com") || extension.equals("es")) {
                            return isEmail = true;
                        }
                    }
                }
            }
    }
        return isEmail;
    }


    /**
    *
    * Esta funcion nos valida si el string 'name' es un
    * nombre.
    * 
    * El parametro que pasamos es 'name' que es el dato que validamos en la funcion.
    * 
    * Return: En esta funcion nos devolvera true si el string 'name'
    * tiene una longitud de 2 a 25 caracteres, y que no contenga
    * numero, en caso contrario nos devolvera false.
    * 
    */
    public static boolean checkName(String name){
        boolean string = true;
        
        if (name.length() <= 2 || name.length() >= 25) {
            
        }
        
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                return string = false;
            }
        }

        return string;
    }
}