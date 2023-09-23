package TP5;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class PanelAgregar extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JLabel lblAgregarPelcula;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JButton btnAceptar;
	private JLabel lblIdPelicula;
	private JComboBox<Categoria> cbGenero = new JComboBox<Categoria>();
	Pelicula pelicula = new Pelicula();
	private DefaultListModel<Pelicula> dlModel;
	TreeSet<Pelicula> listaPeliculas = new TreeSet<Pelicula>();
	
	public void SetDefaultlistModel(DefaultListModel<Pelicula> recibido)
	{
		this.dlModel = recibido;
	}
	
	public static void OrdenarLista(DefaultListModel<Pelicula> dlModel){
		
		List<Pelicula> elementos = new ArrayList<>();
        for (int i = 0; i < dlModel.size(); i++) {
            elementos.add(dlModel.getElementAt(i));
        }
        
        Collections.sort(elementos);
        
        dlModel.clear();
        
        for (Pelicula elemento : elementos) {
            dlModel.addElement(elemento);
        }
	}
	
	public void agregarItems_cbGenero() {
		cbGenero.addItem(new Categoria(0, "Seleccionar Género"));
		cbGenero.addItem(new Categoria(1, "Terror"));
		cbGenero.addItem(new Categoria(2, "Acción"));
		cbGenero.addItem(new Categoria(3, "Suspenso"));
		cbGenero.addItem(new Categoria(4, "Romántica"));
	}
	
	public void reestablecerCampos() {
		cbGenero.setSelectedIndex(0);
		txtNombre.setText("");
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
		
		txtNombre = new JTextField();
		txtNombre.setBounds(200, 90, 219, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		lblIdPelicula = new JLabel("");
		lblIdPelicula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdPelicula.setBounds(200, 50, 46, 14);
		add(lblIdPelicula);
		lblIdPelicula.setText(Integer.toString(pelicula.getContador()));
		
		cbGenero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbGenero.setBounds(200, 130, 219, 20);
		add(cbGenero);
		
		// Agrego los items al JComboBox, en este caso de Categoria/Género:
		agregarItems_cbGenero();
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtNombre.getText().isEmpty() != true && cbGenero.getSelectedIndex() != 0) {
					
					// Creo un objeto de Categoria, y luego se lo asigno a un nuevo objeto de Pelicula:
					Categoria categoria = new Categoria(cbGenero.getSelectedIndex(),cbGenero.getSelectedItem().toString());
					pelicula = new Pelicula(txtNombre.getText(),categoria);
					
					// Establezco el contador:
					lblIdPelicula.setText(Integer.toString(pelicula.getContador()));
					
					// Agrego el objeto pelicula al DefaultListModel:
					dlModel.addElement(pelicula);
					
					OrdenarLista(dlModel);
					
					reestablecerCampos();
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


