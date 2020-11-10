package controlador;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import modelo.Articulos;
import vista.VInicio;
import vista.VInsertar;

public class CArticulos {

	  private  VInicio v;
	//constructor por defecto
	public CArticulos() {
		v = new VInicio();
		v.ventana();
	}
	
	//public métodos
	
	
    public void mostrar() {
    	v.getBtnMostrar().addActionListener((ActionEvent e)->{
    	        Articulos at = new Articulos();
    	        at.mostrar();
    	        v.getTextArea().setText(at.getInfo());;
    	});
    }
    
   public void eliminar() {
	   v.getBtnEliminar().addActionListener((ActionEvent e)->{
		   		CartEliminar el = new CartEliminar();
		   		el.eliminar();
		   		el.salir();
	   });
   }
	
	public void salir() {
	
		 v.getBtnSalir().addActionListener((ActionEvent e) -> {
	            int i = JOptionPane.showConfirmDialog(v.getBtnSalir(), "¿Desea salir del progama?", "Pulsate el botón", 1);
	            if (i == JOptionPane.YES_OPTION) {
	                System.exit(0);
	            }
	        });
	}

	public void insertar() {
		v.getBtnInsertar().addActionListener((ActionEvent e)->{
			 CArtInsertar arti = new CArtInsertar();
			 arti.insertarArticulo();
			 arti.cerrarVentana();
		});
	}
	public void modificar() {
		v.getBtnModificar().addActionListener((ActionEvent e)->{
			CartModificar artm = new CartModificar();
			artm.mostrar();
			artm.modificar();
			artm.salir();
		});
	}

}
