/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dani
 */
public class Ficheros {

    //ficheros  escribir y leer ficheros
    public static void writeToFile(File path, Object data) {

        try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(path))) {
            write.writeObject(data);
        } catch (Exception eio) {
        }
    }

    public static Object readFromFile(File path) throws FileNotFoundException, IOException {
        Object data = null;

        try (ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(path))) {
            data = inFile.readObject();
        } catch (ClassNotFoundException cnfe) {
        } catch (FileNotFoundException fnfe) {
            throw fnfe;
        } catch (IOException e) {
        }
        return data;
    }
}
