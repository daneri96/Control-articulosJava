package vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VModificar extends JFrame {

	//private JFrame frame;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtRam;
	private JTextField txtPlaca;
	private JTextField txtDiscoDuro;
	private JButton btnSalir;
	private JButton btnModificar;
	private JButton btnMostrar;
    
	
	
	
	public VModificar() {
		
	}
	
	public VModificar(JTextField txtId,JTextField txtNombre, JTextField txtRam, JTextField txtPlaca, JTextField txtDiscoDuro,JButton btnSalir,JButton btnModificar,JButton btnMostrar) {
		this.txtId = txtId;
		this.txtNombre = txtNombre;
		this.txtRam =txtRam;
		this.txtPlaca = txtPlaca;
		this.txtDiscoDuro = txtDiscoDuro;
		this.btnModificar = btnModificar;
		this.btnSalir = btnSalir;
		this.btnMostrar = btnMostrar;
	}

	//métodos getter && setter
	
	
	public JTextField getTxtId() {
		return txtId;
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

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtRam() {
		return txtRam;
	}

	public void setTxtRam(JTextField txtRam) {
		this.txtRam = txtRam;
	}

	public JTextField getTxtPlaca() {
		return txtPlaca;
	}

	public void setTxtPlaca(JTextField txtPlaca) {
		this.txtPlaca = txtPlaca;
	}

	public JTextField getTxtDiscoDuro() {
		return txtDiscoDuro;
	}

	public void setTxtDiscoDuro(JTextField txtDiscoDuro) {
		this.txtDiscoDuro = txtDiscoDuro;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}


	public void inicioModificar() {
	
		this.setBounds(100, 100, 456, 371);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titulo = new JLabel("MODIFICAR");
		titulo.setBounds(196, 11, 63, 14);
		panel.add(titulo);
		
		JLabel titId = new JLabel("Introducir id:");
		titId.setBounds(10, 46, 110, 14);
		panel.add(titId);
		
		txtId = new JTextField();
		txtId.setBounds(173, 43, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel titNombre = new JLabel("nombre:");
		titNombre.setBounds(10, 115, 110, 14);
		panel.add(titNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(173, 112, 148, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel titRam = new JLabel(" ram:");
		titRam.setBounds(10, 157, 110, 14);
		panel.add(titRam);
		
		txtRam = new JTextField();
		txtRam.setBounds(173, 154, 148, 20);
		panel.add(txtRam);
		txtRam.setColumns(10);
		
		JLabel titPlaca = new JLabel(" placa:");
		titPlaca.setBounds(10, 199, 110, 14);
		panel.add(titPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(173, 196, 148, 20);
		panel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtDiscoDuro = new JTextField();
		txtDiscoDuro.setBounds(173, 242, 148, 20);
		panel.add(txtDiscoDuro);
		txtDiscoDuro.setColumns(10);
		
		JLabel titDisco = new JLabel(" tama\u00F1o disco:");
		titDisco.setBounds(10, 245, 135, 14);
		panel.add(titDisco);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(23, 286, 89, 23);
		panel.add(btnModificar);
		
		
	    btnSalir = new JButton("Salir");
		btnSalir.setBounds(232, 286, 89, 23);
		panel.add(btnSalir);
		
	    btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(285, 42, 89, 23);
		panel.add(btnMostrar);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
