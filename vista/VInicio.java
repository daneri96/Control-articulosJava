package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VInicio extends JFrame{
	

	private JButton btnSalir;
	private JButton btnInsertar;
	private JButton btnModificar;
	private JButton btnMostrar;
	private JButton btnEliminar;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	public VInicio() {
		

	}
	
	public VInicio(JButton btnSalir,JButton btnInsertar, JButton btnModificar,JButton btnMostrar,JButton btnEliminar,JTextArea textArea) {
		this.btnSalir = btnSalir;
		this.btnInsertar = btnInsertar;
		this.btnModificar = btnModificar;
		this.btnMostrar = btnMostrar;
		this.btnEliminar = btnEliminar;
		this.textArea = textArea;
	}
	
	

	//métodos gettter && setter
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}
	

	public JButton getBtnInsertar() {
		return btnInsertar;
	}

	public void setBtnInsertar(JButton btnInsertar) {
		this.btnInsertar = btnInsertar;
	}

	
	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	
	public void ventana() {
		this.setBounds(100, 100, 487, 356);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel titulo = new JLabel("ARTICULOS");
		titulo.setBounds(208, 0, 69, 24);
		this.getContentPane().add(titulo);
		
	    btnInsertar = new JButton("Insertar");
	    btnInsertar.setBounds(75, 206, 89, 23);
		this.getContentPane().add(btnInsertar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(311, 206, 89, 23);
		this.getContentPane().add(btnEliminar);
		
	    btnMostrar = new JButton("Mostrar");
	    btnMostrar.setBounds(75, 254, 89, 23);
		this.getContentPane().add(btnMostrar);
		
	    btnModificar = new JButton("Modificar");
	    btnModificar.setBounds(188, 254, 89, 23);
		this.getContentPane().add(btnModificar);
		
	    btnSalir = new JButton("Salir");
	    btnSalir.setBounds(311, 254, 89, 23);
		this.getContentPane().add(btnSalir);
	    
	    scrollPane = new JScrollPane();
	    scrollPane.setBounds(88, 26, 288, 169);
	    getContentPane().add(scrollPane);
	    
	    textArea = new JTextArea();
	    scrollPane.setViewportView(textArea);
	    textArea.setEditable(false);
	    textArea.setWrapStyleWord(true);
	    textArea.setLineWrap(true);
		
		
		this.setVisible(true);
	}
	
}
