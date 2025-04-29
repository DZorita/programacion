/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testing;

import model.validations.UserDataValidations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 *
 * @author danielzorfon
 */

public class UserDataValidation_JUnitTest {
    
    public UserDataValidation_JUnitTest() {
    }

//    @org.junit.jupiter.api.BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterAll
//    public static void tearDownClass() throws Exception {
//    }
//
//    @org.junit.jupiter.api.BeforeEach
//    public void setUp() throws Exception {
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    public void tearDown() throws Exception {
//    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
    
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    // -----------CHECK ID-----------
    
    // TRUE
    @Test
    public void testing_checkid() {
        System.out.println("-------TEST CHECK ID--------");
        String id = "51461598H";
        int typedoc = 1;
        boolean expResult = true;
        boolean result = UserDataValidations.checkId(typedoc, id);
        assertEquals(expResult, result, "El NIF es Incorrecto");
    }
    
    
    // FALSE
    public void testingfailed_checkid() {
        System.out.println("-------TEST FAILED CHECK ID--------");
        String id = "12222222Z";
        int typedoc = 5;
        boolean expResult = false;
        boolean result = UserDataValidations.checkId(typedoc, id);
        assertEquals(expResult, result, "El NIF es Incorrecto");
    }
    
    
    
    
    // -----------CHECK DATE-----------
    
    
    // TRUE
    @Test
    public void testing_checkFormatDate() {
        System.out.println("-------TEST CHECK DATE--------");
        String date = "26/11/2006";
        boolean expResult = true;
        boolean result = UserDataValidations.checkFormatDate(date);
        assertEquals(expResult, result, "La fecha es incorrecta");
    }
    
    // FALSE
    @Test
    public void testingfailed_checkFormatDate() {
        System.out.println("-------TEST FAILED CHECK DATE--------");
        String date = "26/112016";
        boolean expResult = false;
        boolean result = UserDataValidations.checkFormatDate(date);
        assertEquals(expResult, result, "La fecha es incorrecta");
    }

    
    
     // -----------CHECK AGE-----------
    
    
    // TRUE
    @Test
    public void testing_checkcalculateAge() {
        System.out.println("-------TEST CHECK AGE--------");
        String edad = "26/11/2006";
        int expResult = 18;
        int result = UserDataValidations.calculateAge(edad);
        assertEquals(expResult, result, "La edad es incorrecta.");
    }
    
    
    // FALSE
    public void testingfailed_checkcalculateAge() {
        System.out.println("-------TEST FAILED CHECK AGE--------");
        String edad = "26/21/2006";
        int expResult = 0;
        int result = UserDataValidations.calculateAge(edad);
        assertEquals(expResult, result, "La edad es incorrecta.");
    }
    
    
    
    
     // -----------CHECK POSTAL CODE-----------

    
     // TRUE
    @Test
    public void testing_checkPostalCode() {
        System.out.println("-------TEST CHECK POSTAL CODE--------");
        String cod_post = "08027";
        boolean expResult = true;
        boolean result = UserDataValidations.checkPostalCode(cod_post);
        assertEquals(expResult, result, "El Codigo Postal Es Incorrecto");
    }

     // FALSE
    @Test
    public void testingfailed_checkPostalCode() {
        System.out.println("-------TEST FAILED CHECK POSTAL CODE--------");
        String cod_post = "0A027";
        boolean expResult = false;
        boolean result = UserDataValidations.checkPostalCode(cod_post);
        assertEquals(expResult, result, "El Codigo Postal Es Incorrecto");
    }
    
    
    
    
    
     // -----------CHECK IS NUMERIC -----------
    
    // TRUE
    @Test
    public void testing_checkisNumeric() {
        System.out.println("-------TEST CHECK IS NUMERIC--------");
        String numero = "12";
        boolean expResult = true;
        boolean result = UserDataValidations.isNumeric(numero);
        assertEquals(expResult, result, "El numero es Incorrecto.");
    }

    // FALSE
    @Test
    public void testingfailed_checkisNumeric() {
        System.out.println("-------TEST FAILED CHECK IS NUMERIC--------");
        String numero = "1A2";
        boolean expResult = false;
        boolean result = UserDataValidations.isNumeric(numero);
        assertEquals(expResult, result, "El numero es Incorrecto.");
    }
    
    
    
    
    
    // -----------CHECK IS ALPHABETIC -----------
    
    
    // TRUE
    @Test
    public void testing_checkisAlphabetic() {
        System.out.println("-------TEST CHECK IS ALPHABETIC--------");
        String palabra = "Hola";
        boolean expResult = true;
        boolean result = UserDataValidations.isAlphabetic(palabra);
        assertEquals(expResult, result, "La palabra es Incorrecto.");
    }
    
    
     // FAILED
    @Test
    public void testingfailed_checkisAlphabetic() {
        System.out.println("-------TEST FAILED CHECK IS ALPHABETIC--------");
        String palabra = "H8la";
        boolean expResult = false;
        boolean result = UserDataValidations.isAlphabetic(palabra);
        assertEquals(expResult, result, "La palabra es Incorrecto.");
    }

    
    
    
    // -----------CHECK EMAIL -----------
    
    // TRUE
    @Test
    public void testing_checkEmail() {
        System.out.println("-------TEST CHECK EMAIL(.es, .com)--------");
        String email = "daniel@gmail.com";
        boolean expResult = true;
        boolean result = UserDataValidations.checkEmail(email);
        assertEquals(expResult, result, "El email es Incorrecto.");
    }
    
    // FALSE
    @Test
    public void testingfailed_checkEmail() {
        System.out.println("-------TEST CHECK EMAIL(.es, .com)--------");
        String email = "dani/gmail.com";
        boolean expResult = false;
        boolean result = UserDataValidations.checkEmail(email);
        assertEquals(expResult, result, "El email es Incorrecto.");
    }
    
    

    
    
    
    
     // -----------CHECK NAME-----------
    
    
    // TRUE
    @Test
    public void testing_checkName() {
        System.out.println("-------TEST CHECK IS NAME--------");
        String nombre = "Daniel";
        boolean expResult = true;
        boolean result = UserDataValidations.checkName(nombre);
        assertEquals(expResult, result, "El nombre es incorrecto.");
    }
    
    // FALSE 
    @Test
    public void testingfailed_checkName() {
        System.out.println("-------TEST CHECK IS NAME--------");
        String nombre = "Da8nie8l";
        boolean expResult = false;
        boolean result = UserDataValidations.checkName(nombre);
        assertEquals(expResult, result, "El nombre es incorrecto.");
    }
    
    
}



