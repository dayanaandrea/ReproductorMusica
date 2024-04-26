package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PodcasterView {

	private JPanel panel = null;
	private JTable tablePodcaster;
	private JTable tableSerie;
	private JTable tablePodcast;

	
	public PodcasterView(ArrayList<Object> musicPanels) {
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
		
		JPanel panel_Podcaster = new JPanel();
		panel_Podcaster.setBounds(272, 11, 251, 156);
		panel.add(panel_Podcaster);
		panel_Podcaster.setLayout(null);
		
		JLabel lblPodcasterImagen = new JLabel("Imagen Podcaster");
		lblPodcasterImagen.setBounds(10, 11, 93, 60);
		panel_Podcaster.add(lblPodcasterImagen);
		
		JLabel lblDescription = new JLabel("Decripción");
		lblDescription.setBounds(131, 15, 120, 52);
		panel_Podcaster.add(lblDescription);
		
		JLabel lblNameGroup = new JLabel("Nombre");
		lblNameGroup.setBounds(10, 78, 73, 14);
		panel_Podcaster.add(lblNameGroup);
		
		JLabel lblDate = new JLabel("Fecha");
		lblDate.setBounds(141, 78, 73, 14);
		panel_Podcaster.add(lblDate);
		
		JLabel lblReproductionNumber = new JLabel("Número de reproducciones");
		lblReproductionNumber.setBounds(48, 109, 136, 14);
		panel_Podcaster.add(lblReproductionNumber);
		
		JPanel panel_Serie = new JPanel();
		panel_Serie.setBounds(272, 192, 251, 156);
		panel.add(panel_Serie);
		panel_Serie.setLayout(null);
		
		JLabel lblDescription_1 = new JLabel("Decripción");
		lblDescription_1.setBounds(121, 11, 120, 52);
		panel_Serie.add(lblDescription_1);
		
		JLabel lblStartDate = new JLabel("Fecha Inicio ");
		lblStartDate.setBounds(10, 106, 73, 14);
		panel_Serie.add(lblStartDate);
		
		JLabel lblTematica = new JLabel("Temática");
		lblTematica.setBounds(10, 69, 73, 14);
		panel_Serie.add(lblTematica);
		
		JLabel lblReproductionNumber_1 = new JLabel("Número de reproducciones");
		lblReproductionNumber_1.setBounds(43, 131, 136, 14);
		panel_Serie.add(lblReproductionNumber_1);
		
		JLabel lblTitle = new JLabel("Titulo");
		lblTitle.setBounds(10, 30, 73, 14);
		panel_Serie.add(lblTitle);
		
		JLabel lblEndDate = new JLabel("Fecha Fin");
		lblEndDate.setBounds(120, 106, 73, 14);
		panel_Serie.add(lblEndDate);
		
		JPanel panel_Podcast = new JPanel();
		panel_Podcast.setBounds(272, 359, 251, 87);
		panel.add(panel_Podcast);
		panel_Podcast.setLayout(null);
		
		JLabel lblNameGroup_1 = new JLabel("Nombre");
		lblNameGroup_1.setBounds(10, 11, 73, 14);
		panel_Podcast.add(lblNameGroup_1);
		
		JLabel lblReproductionNumber_1_1 = new JLabel("Número de reproducciones");
		lblReproductionNumber_1_1.setBounds(37, 51, 136, 14);
		panel_Podcast.add(lblReproductionNumber_1_1);
		
		JLabel lblDuration = new JLabel("Duración");
		lblDuration.setBounds(136, 11, 73, 14);
		panel_Podcast.add(lblDuration);
		
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
		btnSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		
		JScrollPane scrollPanePodcaster = new JScrollPane();
		scrollPanePodcaster.setBounds(29, 23, 174, 130);
		panel.add(scrollPanePodcaster);
		
		tablePodcaster = new JTable();
		scrollPanePodcaster.setViewportView(tablePodcaster);
		
		
		JScrollPane scrollPaneSerie = new JScrollPane();
		scrollPaneSerie.setBounds(29, 192, 174, 130);
		panel.add(scrollPaneSerie);
		
		tableSerie = new JTable();
		scrollPaneSerie.setViewportView(tableSerie);
		
		
		JScrollPane scrollPanePodcast = new JScrollPane();
		scrollPanePodcast.setBounds(29, 359, 174, 94);
		panel.add(scrollPanePodcast);
		
		tablePodcast = new JTable();
		scrollPanePodcast.setViewportView(tablePodcast);
		
		
	}
		
		
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
