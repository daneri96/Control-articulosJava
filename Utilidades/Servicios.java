package Utilidades;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servicios {

	/*Estos métodos se usan para la conexión de los socket
	 En principio solo será util para un unico servidor
	
	*/
	//conexion del socket - servidor
	public static void conexion(int puerto) {
		try {
			ServerSocket server= new ServerSocket(puerto);
			System.out.println("Esperando conxion del puerto "+String.valueOf(puerto));
			Socket socket = server.accept();
			System.out.println("La conexión ha sido establecida");
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
