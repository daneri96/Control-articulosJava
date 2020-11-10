package controlador;

public class Ejecutable {

	//constructor por defecto
	public Ejecutable() {
		
	}
	
	public void control() {
		CArticulos art = new CArticulos();
		art.salir();
		art.insertar();
		art.mostrar();
		art.modificar();
		art.eliminar();
	}
}
