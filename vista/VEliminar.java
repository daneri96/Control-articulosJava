package vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VEliminar extends JFrame{

	private JTextField textID;
    private JButton btnEliminar;
    private JButton btnSalir;

    public VEliminar() {
    	
    }
    
    public VEliminar(JTextField textID,JButton btnEliminar,JButton btnSalir){
		this.textID = textID;
		this.btnEliminar = btnEliminar;
		this.btnSalir = btnSalir;
	}
	//métodos getter && setter
	public JTextField getTextID() {
		return textID;
	}

	public void setTextID(JTextField textID) {
		this.textID = textID;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public void inicioEliminar() {
		this.setBounds(100, 100, 568, 137);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel titulo = new JLabel("Eliminar articulos");
		titulo.setBounds(226, 11, 174, 14);
		panel.add(titulo);
		
		JLabel lblNewLabel = new JLabel("Introduzca el ID:");
		lblNewLabel.setBounds(32, 46, 179, 14);
		panel.add(lblNewLabel);
		
		textID = new JTextField();
		textID.setBounds(128, 43, 158, 20);
		panel.add(textID);
		textID.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(311, 42, 89, 23);
		panel.add(btnEliminar);
		
	    btnSalir = new JButton("Salir");
		btnSalir.setBounds(431, 42, 89, 23);
		panel.add(btnSalir);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}
