package vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VInsertar extends JFrame {

	//private JFrame frame;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtRam;
	private JTextField txtPlaca;
	private JTextField txtDiscoDuro;
	private JButton btnSalir;
	private JButton btnInsertar;

	
	
	
	public VInsertar() {
		
	}
	
	public VInsertar(JTextField txtId,JTextField txtNombre, JTextField txtRam, JTextField txtPlaca, JTextField txtDiscoDuro,JButton btnSalir,JButton btnInsertar) {
		this.txtId = txtId;
		this.txtNombre = txtNombre;
		this.txtRam =txtRam;
		this.txtPlaca = txtPlaca;
		this.txtDiscoDuro = txtDiscoDuro;
		this.btnInsertar = btnInsertar;
		this.btnSalir = btnSalir;
	}

	//métodos getter && setter
	
	public JTextField getTxtId() {
		return txtId;
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

	public JButton getBtnInsertar() {
		return btnInsertar;
	}

	public void setBtnInsertar(JButton btnInsertar) {
		this.btnInsertar = btnInsertar;
	}

	public void inicioInsertar() {
	
		this.setBounds(100, 100, 320, 335);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titulo = new JLabel("INSERTAR");
		titulo.setBounds(105, 11, 63, 14);
		panel.add(titulo);
		
		JLabel titId = new JLabel("Introducir id:");
		titId.setBounds(10, 46, 124, 14);
		panel.add(titId);
		
		txtId = new JTextField();
		txtId.setBounds(182, 43, 86, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel titNombre = new JLabel("Introducir nombre:");
		titNombre.setBounds(10, 91, 124, 14);
		panel.add(titNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(182, 88, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel titRam = new JLabel("Introducir ram:");
		titRam.setBounds(10, 137, 142, 14);
		panel.add(titRam);
		
		txtRam = new JTextField();
		txtRam.setBounds(182, 134, 86, 20);
		panel.add(txtRam);
		txtRam.setColumns(10);
		
		JLabel titPlaca = new JLabel("Introducir placa:");
		titPlaca.setBounds(10, 184, 158, 14);
		panel.add(titPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(182, 181, 86, 20);
		panel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtDiscoDuro = new JTextField();
		txtDiscoDuro.setBounds(182, 227, 86, 20);
		panel.add(txtDiscoDuro);
		txtDiscoDuro.setColumns(10);
		
		JLabel titDisco = new JLabel("Introducir tama\u00F1o disco:");
		titDisco.setBounds(10, 230, 158, 14);
		panel.add(titDisco);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(31, 262, 89, 23);
		panel.add(btnInsertar);
		
		
	    btnSalir = new JButton("Salir");
		btnSalir.setBounds(179, 262, 89, 23);
		panel.add(btnSalir);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
