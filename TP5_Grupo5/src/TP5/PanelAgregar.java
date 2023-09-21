package TP5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;

public class PanelAgregar extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JLabel lblAgregarPelcula;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JButton btnAceptar;
	private JLabel lblIdPelicula;
	private JComboBox<Genero> cbGenero = new JComboBox<Genero>();
	Pelicula pelicula = new Pelicula();
	private DefaultListModel<Pelicula> dlModel;
	
	
	public void SetDefaultlistModel(DefaultListModel<Pelicula> recibido)
	{
		this.dlModel = recibido;
	}
	
	public PanelAgregar() {
		setLayout(null);
		
		lblAgregarPelcula = new JLabel("Agregar Pelicula");
		lblAgregarPelcula.setBounds(184, 5, 123, 14);
		add(lblAgregarPelcula);
		
		lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID.setBounds(30, 50, 71, 14);
		add(lblID);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(30, 90, 71, 14);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGenero.setBounds(30, 130, 71, 14);
		add(lblGenero);
		
		textField = new JTextField();
		textField.setBounds(200, 90, 219, 20);
		add(textField);
		textField.setColumns(10);
		
		lblIdPelicula = new JLabel("");
		lblIdPelicula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdPelicula.setBounds(200, 50, 46, 14);
		add(lblIdPelicula);
		lblIdPelicula.setText(Integer.toString(pelicula.getId()));
		
		cbGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbGenero.setBounds(200, 130, 219, 20);
		add(cbGenero);
		
		cbGenero.addItem(new Genero(0, "Seleccionar Género"));
		cbGenero.addItem(new Genero(1, "Terror"));
		cbGenero.addItem(new Genero(2, "Acción"));
		cbGenero.addItem(new Genero(3, "Suspenso"));
		cbGenero.addItem(new Genero(4, "Romántica"));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNombre.getText().isEmpty() != true && cbGenero.getSelectedIndex() != 0) {
					
					Pelicula pelicula = new Pelicula();
					Genero genero = new Genero();
					
					genero.setGenero(cbGenero.getSelectedItem().toString());
					genero.setId(cbGenero.getSelectedIndex());
					
					pelicula.setGenero(genero);
					pelicula.setNombre(txtNombre.getText());
					
					//JOptionPane.showMessageDialog(null, pelicula.toString());
					dlModel.addElement(pelicula);
				}else {
					JOptionPane.showMessageDialog(null, "Complete el nombre y seleccione un género para poder guardar la película");
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(30, 185, 150, 30);
		add(btnAceptar);
		
		
	}
}
