package TP5;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;

public class PanelListar extends JPanel {
	
	private JList list;
	private DefaultListModel <Pelicula> dlModel;
	
	public PanelListar() {
		setLayout(null);
		
		JLabel lblAgregarPelcula = new JLabel("Listar Pel\u00EDcula");
		lblAgregarPelcula.setBounds(193, 5, 64, 14);
		add(lblAgregarPelcula);
		
		list = new JList();
		list.setBounds(10, 56, 430, 233);
		
		dlModel = new DefaultListModel <Pelicula>();
		list.setModel(dlModel);
		add(list);
	}
}
