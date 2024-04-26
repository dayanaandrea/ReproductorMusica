package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FavoritesView  {

	private JPanel panel = null;
	private JTable tableDatosLista;


	public FavoritesView(ArrayList<Object> musicPanels) {

		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		JScrollPane scrollPaneListas = new JScrollPane();
		scrollPaneListas.setBounds(46, 35, 177, 225);
		panel.add(scrollPaneListas);
		
		JTable tableListas = new JTable();
		scrollPaneListas.setViewportView(tableListas);
		
		JScrollPane scrollPaneDAtosListas = new JScrollPane();
		scrollPaneDAtosListas.setBounds(371, 35, 177, 225);
		panel.add(scrollPaneDAtosListas);
		
		tableDatosLista = new JTable();
		scrollPaneDAtosListas.setViewportView(tableDatosLista);
		
		JButton btnCrear = new JButton("Crear ");
		btnCrear.setBounds(46, 305, 89, 23);
		panel.add(btnCrear);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(226, 305, 89, 23);
		panel.add(btnEliminar);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(384, 305, 89, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(514, 305, 89, 23);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 356, 177, 103);
		panel.add(panel_1);
		
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
