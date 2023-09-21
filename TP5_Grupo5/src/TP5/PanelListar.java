package TP5;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelListar extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	private JList<Pelicula> list;
	private DefaultListModel <Pelicula> dlModel;
	
	public PanelListar() {
		setLayout(null);
		
		JLabel lblAgregarPelcula = new JLabel("Listar Peliculas");
		lblAgregarPelcula.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregarPelcula.setBounds(182, 5, 111, 35);
		add(lblAgregarPelcula);
		
		list = new JList<Pelicula>();
		list.setBounds(102, 39, 338, 305);
		
		dlModel = new DefaultListModel <Pelicula>();
		list.setModel(dlModel);
		add(list);
		
		JLabel lblNewLabel = new JLabel("Pel\u00EDculas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(15, 142, 72, 20);
		add(lblNewLabel);
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
	{
		this.dlModel = listModel2;
		list.setModel(this.dlModel);
	}
}
