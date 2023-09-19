package TP5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelAgregar extends JPanel{
	private JTextField textField;
	public PanelAgregar() {
		setLayout(null);
		
		JLabel lblAgregarPelcula = new JLabel("Agregar Pel\u00EDcula");
		lblAgregarPelcula.setBounds(186, 5, 77, 14);
		add(lblAgregarPelcula);
		
		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID.setBounds(30, 50, 71, 14);
		add(lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(30, 90, 71, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setBounds(30, 130, 71, 14);
		add(lblGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(30, 185, 150, 30);
		add(btnAceptar);
		
		textField = new JTextField();
		textField.setBounds(200, 90, 150, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblIdPelicula = new JLabel("");
		lblIdPelicula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdPelicula.setBounds(200, 50, 46, 14);
		add(lblIdPelicula);
		
		JComboBox cbGenero = new JComboBox();
		cbGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbGenero.setBounds(200, 130, 150, 20);
		add(cbGenero);
	}
}
