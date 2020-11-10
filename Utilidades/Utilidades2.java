/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Utilidades2 {

    //Mi biblioteca ArrayList // se le añade siempre la clase de la app que hagamos
    public static void RecorrerArrayList(ArrayList<Object> lista) {
        for (Object i : lista) {
            System.out.println(i.toString());
        }
    }

    //Mi biblioteca Arrays
    public static void RecorrerArrayString(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void RecorrerArrayInt(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static void RecorrerArrayYRellenar(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.round(Math.random() * 50);
            System.out.println(vector[i]);
        }
    }

    public static void RecorrerArrayYSumar(int vector[], int vectorA[], int vectorB[]) {
        System.out.println("Datos del primer vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.round(Math.random() * 50);
            System.out.println(vector[i]);
        }
        System.out.println("Datos del segundo vector");
        for (int i = 0; i < vector.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 50);
            System.out.println(vectorA[i]);
        }
        System.out.println("Datos de la suma de ambos vectores");
        for (int i = 0; i < vector.length; i++) {
            vectorB[i] = vector[i] + vectorA[i];
            System.out.println(vectorB[i]);
        }
    }

    public static void RecorrerArrayYMultiplicar(int vector[], int vectorA[], int vectorB[]) {
        System.out.println("Datos del primer vector");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.round(Math.random() * 50);
            System.out.println(vector[i]);
        }
        System.out.println("Datos del segundo vector");
        for (int i = 0; i < vector.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 50);
            System.out.println(vectorA[i]);
        }
        System.out.println("Datos de la suma de ambos vectores");
        for (int i = 0; i < vector.length; i++) {
            vectorB[i] = vector[i] * vectorA[i];
            System.out.println(vectorB[i]);
        }
    }

}
