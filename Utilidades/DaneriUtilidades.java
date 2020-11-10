/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author danie
 */
public class DaneriUtilidades {

    public static String leerString() {
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Entrada no obtenida.");
            return "";
        }
    }

    public static float leerFloat() {
        try {
            return Float.parseFloat(leerString());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no obtenida.");
            return 0.0f;
        }
    }

    public static int leerInt() {
        try {
            return Integer.parseInt(leerString());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no obtenida.");
            return 0;
        }
    }

    public static double leerDouble() {
        try {
            return Double.parseDouble(leerString());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no obtenida.");
            return 0;
        }
    }

    public static boolean leerBoolean() {
        return Boolean.parseBoolean(leerString());
    }

    //FUNCIONAMIENTO DE FICHEROS DE JAVA INTRODUCIENDO OBJETOS
    public static File newFile() {
        File f;

        System.out.println("Introducir el nombre del archivo: ");

        String s = leerString();

        try {
            f = new File(s + ".dat");
            if (!f.exists()) {
                f.createNewFile();
                return f;
            } else {
                return f;
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            return null;
        }

    }

    public static void guardar(Object obj) throws FileNotFoundException, IOException {
        File f = newFile();

        if (!f.exists()) {
            FileOutputStream stream = new FileOutputStream(f);
            ObjectOutputStream output = null;

            try {

                output = new ObjectOutputStream(stream);
                output.writeObject(obj);
                output.close();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                output.close();
            }
        } else {
            FileOutputStream stream = new FileOutputStream(f);
            ObjOutStream output = null;

            try {
                output = new ObjOutStream(stream);
                output.writeUnshared(obj);
                output.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                output.close();
            }
        }
    }

 //METODO PARA MOSTRAR UNA LISTA DE OBJETOS DE UN ARCHIVO .DAT
    public static ArrayList<Object> abrirLeer() throws FileNotFoundException, IOException {
        ArrayList<Object> listas = new ArrayList<>();

        File f = newFile();

        FileInputStream stream = new FileInputStream(f);
        ObjectInputStream input = null;

        try {

            input = new ObjectInputStream(stream);

            Object aux = input.readObject();

            while (aux != null) {
                if (aux instanceof Object) {
                    listas.add(aux);
                }
                aux = input.readObject();
            }
            input.close();

        } catch (ClassNotFoundException | IOException ex) {
            ex.printStackTrace(System.out);

        } finally {
            input.close();
            return listas;
        }

    }

    // Mostrar las fechas formateadas
    public static String leerfecha() {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = leerString();
        LocalDate alta = LocalDate.parse(fecha, sdf);
        return fecha;

    }

    public static int restarFechas(Date f1, Date f2) {

        long diff = f1.getTime() - f2.getTime();

        /*
         int diffDays = (int) (diff / (24 * 60 * 60 * 1000));

         int diffhours = (int) (diff / (60 * 60 * 1000));
         System.out.println("difference between hours: " + crunchifyFormatter.format(diffhours));
         */
        int diffmin = (int) (diff / (60 * 1000));
        /*
         int diffsec = (int) (diff / (1000));
         */
        return diffmin;
    }

    public Date crearFecha() {
        String fecha = leerfecha();
        Date ret = null;
        SimpleDateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ret = (Date) conversor.parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
