/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import static Utilidades.DaneriUtilidades.leerString;
import java.util.regex.Pattern;

/**
 *
 * @author Dani
 */
public class Patrones {

    //Patron de nombre
    public static String nombre() {
        String n = "[A-Za-z]{1,8}";
        String nombre = "";
        boolean estado = Pattern.compile(n).matcher(nombre).matches();
        while (estado == false) {
            System.out.println("Introduce el nombre(Introduzca de 1 a 8 carácteres)");
            nombre = leerString();
            estado = Pattern.compile(n).matcher(nombre).matches();
        }
        return nombre;
    }

    //Patron de matricula
    public static String matricula() {
        String m = "[0-9]{4}[A-Z]{3}";
        String matricula = "";
        boolean estado = Pattern.compile(m).matcher(matricula).matches();
        while (estado == false) {
            System.out.println("Introduce la matricula(Introduzca 4 digitos y 3 carácteres)");
            matricula = leerString();
            estado = Pattern.compile(m).matcher(matricula).matches();
        }
        return matricula;
    }

    //Patron de dni
    public static String dni() {
        String d = "[0-9]{8}[-][A-Z]{1}";
        String dni = "";
        boolean estado = Pattern.compile(d).matcher(dni).matches();
        while (estado == false) {
            System.out.println("Introduzca el dni");
            dni = leerString();
            estado = Pattern.compile(d).matcher(dni).matches();
        }
        return dni;
    }

}
