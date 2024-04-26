package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GroupsView  {
	private JPanel panel = null;
	private JTable tableGroups;
	private JTable tableDiscs;
	private JTable tableSong;


	public GroupsView(ArrayList<Object> musicPanels) {

		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("img/perfil.png"));
		panel.setLayout(null);
		JLabel imgProfile = new JLabel("", imageIcon, JLabel.CENTER);
		imgProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(true);
				
			}
		});
		imgProfile.setBounds(577, 0, 73, 87);
		imgProfile.setBackground(new Color(255, 255, 255));
		imgProfile.setIcon(imageIcon);
		panel.add(imgProfile);
		
		JPanel panel_Grupo = new JPanel();
		panel_Grupo.setBounds(272, 11, 251, 156);
		panel.add(panel_Grupo);
		panel_Grupo.setLayout(null);
		
		JLabel lblGroupImage = new JLabel("Imagen Grupo");
		lblGroupImage.setBounds(10, 11, 68, 60);
		panel_Grupo.add(lblGroupImage);
		
		JLabel lblDescription = new JLabel("Decripción");
		lblDescription.setBounds(131, 15, 120, 52);
		panel_Grupo.add(lblDescription);
		
		JLabel lblNameGroup = new JLabel("Nombre");
		lblNameGroup.setBounds(10, 78, 73, 14);
		panel_Grupo.add(lblNameGroup);
		
		JLabel lblDate = new JLabel("Fecha");
		lblDate.setBounds(141, 78, 73, 14);
		panel_Grupo.add(lblDate);
		
		JLabel lblReproductionNumber = new JLabel("Número de reproducciones");
		lblReproductionNumber.setBounds(48, 109, 136, 14);
		panel_Grupo.add(lblReproductionNumber);
		
		JPanel panel_Disco = new JPanel();
		panel_Disco.setBounds(272, 192, 251, 156);
		panel.add(panel_Disco);
		panel_Disco.setLayout(null);
		
		JLabel lblImagenDisco = new JLabel("Imagen Disco");
		lblImagenDisco.setBounds(10, 11, 68, 60);
		panel_Disco.add(lblImagenDisco);
		
		JLabel lblDescription_1 = new JLabel("Decripción");
		lblDescription_1.setBounds(121, 11, 120, 52);
		panel_Disco.add(lblDescription_1);
		
		JLabel lblDate_1 = new JLabel("Fecha");
		lblDate_1.setBounds(131, 82, 73, 14);
		panel_Disco.add(lblDate_1);
		
		JLabel lblGenero = new JLabel("Género");
		lblGenero.setBounds(10, 82, 73, 14);
		panel_Disco.add(lblGenero);
		
		JLabel lblReproductionNumber_1 = new JLabel("Número de reproducciones");
		lblReproductionNumber_1.setBounds(44, 109, 136, 14);
		panel_Disco.add(lblReproductionNumber_1);
		
		JPanel panel_Cancion = new JPanel();
		panel_Cancion.setBounds(272, 359, 251, 87);
		panel.add(panel_Cancion);
		panel_Cancion.setLayout(null);
		
		JLabel lblNameGroup_1 = new JLabel("Nombre");
		lblNameGroup_1.setBounds(10, 11, 73, 14);
		panel_Cancion.add(lblNameGroup_1);
		
		JLabel lblReproductionNumber_1_1 = new JLabel("Número de reproducciones");
		lblReproductionNumber_1_1.setBounds(37, 51, 136, 14);
		panel_Cancion.add(lblReproductionNumber_1_1);
		
		JLabel lblDuration = new JLabel("Duración");
		lblDuration.setBounds(136, 11, 73, 14);
		panel_Cancion.add(lblDuration);
		
		JButton btnOut = new JButton("Salir");
		btnOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(true );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				
			}
		});
		
		btnOut.setBounds(551, 436, 89, 23);
		panel.add(btnOut);
		
		JButton btnSelect = new JButton("Seleccionar");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(true);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
			}
		});
		btnSelect.setBounds(551, 397, 89, 23);
		panel.add(btnSelect);
		
		JScrollPane scrollPaneGroups = new JScrollPane();
		scrollPaneGroups.setBounds(29, 23, 174, 130);
		panel.add(scrollPaneGroups);
		
		tableGroups = new JTable();
		scrollPaneGroups.setViewportView(tableGroups);
		
		JScrollPane scrollPaneDiscs = new JScrollPane();
		scrollPaneDiscs.setBounds(29, 192, 174, 130);
		panel.add(scrollPaneDiscs);
		
		tableDiscs = new JTable();
		scrollPaneDiscs.setViewportView(tableDiscs);
		
		JScrollPane scrollPaneSong = new JScrollPane();
		scrollPaneSong.setBounds(29, 359, 174, 94);
		panel.add(scrollPaneSong);
		
		tableSong = new JTable();
		scrollPaneSong.setViewportView(tableSong);
		
		
		
		
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}
}
