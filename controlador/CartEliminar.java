package controlador;

import java.awt.event.ActionEvent;

import modelo.Articulos;
import vista.VEliminar;

public class CartEliminar {

	 private VEliminar ve;
	
	public CartEliminar() {
		ve = new VEliminar();
		ve.inicioEliminar();
	}
	
	public void eliminar() {
		ve.getBtnEliminar().addActionListener((ActionEvent e)->{
			 Articulos art = new Articulos();
			 art.setId(Integer.parseInt(ve.getTextID().getText()));
			 art.eliminarArticulo();
		});
	}
	public void salir() {
		ve.getBtnSalir().addActionListener((ActionEvent e)->{
			ve.setVisible(false);
		});
	}
}
