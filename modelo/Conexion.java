package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
//variables para poder realizar la conexion
 private Connection conn = null;


//constructor por defecto
public Conexion() {
	
}
//métodos getter y setter

public Connection getConn() {
	return conn;
}


public void setConn(Connection conn) {
	this.conn = conn;
}




public void realizaConexion(){

    String urlDatabase =  "jdbc:postgresql://localhost:5432/Colegio"; 
    try {
    	Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(urlDatabase, "postgres","usuaria");
        if (conn != null) {
        	//System.out.println("La conexion se ha realizado con exito");
        }else {
        	System.out.println("No se pudo realizar la conexion");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
}



}
