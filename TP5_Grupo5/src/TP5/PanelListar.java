package TP5;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;

public class PanelListar extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	private JList<Pelicula> list;
	private DefaultListModel <Pelicula> dlModel;
	
	public PanelListar() {
		setLayout(null);
		
		JLabel lblAgregarPelcula = new JLabel("Listar Pelicula");
		lblAgregarPelcula.setBounds(193, 5, 64, 14);
		add(lblAgregarPelcula);
		
		list = new JList<Pelicula>();
		list.setBounds(10, 56, 430, 233);
		
		dlModel = new DefaultListModel <Pelicula>();
		list.setModel(dlModel);
		add(list);
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
	{
		this.dlModel = listModel2;
		list.setModel(this.dlModel);
	}
}
