package controlador;

import java.awt.event.ActionEvent;

import modelo.Articulos;
import vista.VInsertar;

public class CArtInsertar {

	 private VInsertar vi;
	
	public CArtInsertar() {
		vi = new VInsertar();
	    vi.inicioInsertar();
	}
	
	
	//métodos
    public void insertarArticulo() {
        vi.getBtnInsertar().addActionListener((ActionEvent e) -> {
        	Articulos art = new Articulos();
        	
        	art.setId(Integer.parseInt(vi.getTxtId().getText()));
        	art.setNombre(vi.getTxtNombre().getText());
        	art.setRam(vi.getTxtRam().getText());
        	art.setPlaca(vi.getTxtPlaca().getText());
        	art.setDisco_duro(Integer.parseInt(vi.getTxtDiscoDuro().getText()));
        	
        	art.insertar();
 
        });
    }
    
    
    public void cerrarVentana() {
    	vi.getBtnSalir().addActionListener((ActionEvent e)->{
    		vi.setVisible(false);
    	});
    }

}
