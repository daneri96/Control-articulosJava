package controlador;

import java.awt.event.ActionEvent;

import modelo.Articulos;
import vista.VModificar;

public class CartModificar {

	 private VModificar vm;
	
	public CartModificar(){
		vm = new VModificar();
		vm.inicioModificar();
	}
	
	
	public void mostrar() {
		vm.getBtnMostrar().addActionListener((ActionEvent e)->{
			  Articulos art = new Articulos();
			    art.setId(Integer.parseInt(vm.getTxtId().getText()));
			    art.mostrar_uno();
	            //introducimos los valores en los textos para poder mostrarlo
	            vm.getTxtNombre().setText(art.getNombre());
	            vm.getTxtRam().setText(art.getRam());
	            vm.getTxtPlaca().setText(art.getPlaca());
	            vm.getTxtDiscoDuro().setText(String.valueOf(art.getDisco_duro()));
	            
	            
		});
	}
	public void modificar() {
		vm.getBtnModificar().addActionListener((ActionEvent e)->{
			Articulos art = new Articulos();
			
			 art.setId(Integer.parseInt(vm.getTxtId().getText()));
             art.setNombre(vm.getTxtNombre().getText());
             art.setRam(vm.getTxtRam().getText());
             art.setPlaca(vm.getTxtPlaca().getText());
             art.setDisco_duro(Integer.parseInt(vm.getTxtDiscoDuro().getText()));
      
		    art.modificarArticulo();  

          
		});
	}
	public void salir() {
		vm.getBtnSalir().addActionListener((ActionEvent e)->{
			vm.setVisible(false);
		});
	}
}
