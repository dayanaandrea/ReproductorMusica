package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import musicPlayer.bbdd.gestor.GestorDisk;
import musicPlayer.bbdd.gestor.GestorGroup;
import musicPlayer.bbdd.gestor.GestorPodcaster;
import musicPlayer.bbdd.gestor.GestorSerie;
import musicPlayer.bbdd.pojo.DiskPojo;
import musicPlayer.bbdd.pojo.GroupPojo;
import musicPlayer.bbdd.pojo.PodcasterPojo;
import musicPlayer.bbdd.pojo.SeriePojo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JComboBox;

public class PodcasterView {

	private JPanel panel = null;
	private String podcasterSeleccionado = null;
	private String serieSeleccionado = null;
	private String podcastSeleccionado = null;
	private boolean datosCargados = false;

	
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
		
		JLabel lblPodcasterImagen = new JLabel("Imagen Podcaster");
		lblPodcasterImagen.setBounds(282, 34, 93, 60);
		panel.add(lblPodcasterImagen);
		
		JLabel lblDescriptionPodcaster = new JLabel("Decripción");
		lblDescriptionPodcaster.setBounds(403, 38, 120, 52);
		panel.add(lblDescriptionPodcaster);
		
		JLabel lblNamePodcaster = new JLabel("Nombre");
		lblNamePodcaster.setBounds(282, 101, 73, 14);
		panel.add(lblNamePodcaster);
		
		JLabel lblDatePodcaster = new JLabel("Fecha");
		lblDatePodcaster.setBounds(413, 101, 73, 14);
		panel.add(lblDatePodcaster);
		
		JLabel lblReproductionNumberPodcaster = new JLabel("Número de reproducciones");
		lblReproductionNumberPodcaster.setBounds(320, 132, 136, 14);
		panel.add(lblReproductionNumberPodcaster);
		
		JLabel lblTitleSerie = new JLabel("Titulo");
		lblTitleSerie.setBounds(272, 201, 73, 14);
		panel.add(lblTitleSerie);
		
		JLabel lblTematicaSerie = new JLabel("Temática");
		lblTematicaSerie.setBounds(272, 240, 73, 14);
		panel.add(lblTematicaSerie);
		
		JLabel lblStartDateSerie = new JLabel("Fecha Inicio ");
		lblStartDateSerie.setBounds(272, 277, 73, 14);
		panel.add(lblStartDateSerie);
		
		JLabel lblReproductionNumberSerie = new JLabel("Número de reproducciones");
		lblReproductionNumberSerie.setBounds(305, 302, 136, 14);
		panel.add(lblReproductionNumberSerie);
		
		JLabel lblEndDateSerie = new JLabel("Fecha Fin");
		lblEndDateSerie.setBounds(382, 277, 73, 14);
		panel.add(lblEndDateSerie);
		
		JLabel lblDescriptionSerie = new JLabel("Decripción");
		lblDescriptionSerie.setBounds(383, 182, 120, 52);
		panel.add(lblDescriptionSerie);
		
		JLabel lblNameGroupPodcast = new JLabel("Nombre");
		lblNameGroupPodcast.setBounds(282, 378, 73, 14);
		panel.add(lblNameGroupPodcast);
		
		JLabel lblDurationPodcast = new JLabel("Duración");
		lblDurationPodcast.setBounds(408, 378, 73, 14);
		panel.add(lblDurationPodcast);
		
		JLabel lblReproductionNumberPodcast = new JLabel("Número de reproducciones");
		lblReproductionNumberPodcast.setBounds(309, 418, 136, 14);
		panel.add(lblReproductionNumberPodcast);
		
		JButton btnReproduccion = new JButton("Reproduccion");
		btnReproduccion.setBounds(245, 447, 89, 23);
		panel.add(btnReproduccion);
		
		JComboBox<String> comboBoxPodcaster = new JComboBox<String>();
		comboBoxPodcaster.addItem("Seleccionar Podcaster...");
		comboBoxPodcaster.setBounds(52, 52, 134, 35);
		panel.add(comboBoxPodcaster);
		
		if (!datosCargados) {
			GestorPodcaster gestorPodcaster = new GestorPodcaster();
			List<PodcasterPojo> podcasters = gestorPodcaster.getAllGroup();
			if (podcasters != null) {
				for (PodcasterPojo podcaster : podcasters) {
					comboBoxPodcaster.addItem(podcaster.getName());

				}
			}
			datosCargados = true;
		}
		
		
		JComboBox<String> comboBoxSerie = new JComboBox<String>();
		comboBoxSerie.addItem("Seleccionar Serie...");
		comboBoxSerie.setBounds(52, 203, 134, 35);
		panel.add(comboBoxSerie);
		
		JComboBox<String> comboBoxPodcast = new JComboBox<String>();
		comboBoxPodcast.addItem("Seleccionar Podcast...");
		comboBoxPodcast.setBounds(52, 372, 134, 35);
		panel.add(comboBoxPodcast);
		
		
		
		comboBoxPodcaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String podcasterSeleccionado = (String) comboBoxPodcaster.getSelectedItem();
				if (podcasterSeleccionado != null) {
					GestorPodcaster gestorPodcaster = new GestorPodcaster();
					List<PodcasterPojo> podcaster = gestorPodcaster.getPodcaster(podcasterSeleccionado);

					if (podcaster != null && !podcaster.isEmpty()) {
						PodcasterPojo podcasters = podcaster.get(0);

						ImageIcon imageIcon1 = new ImageIcon(podcasters.getImagen());
						lblPodcasterImagen.setIcon(imageIcon1);

						lblDescriptionPodcaster.setText(podcasters.getDescription());
						lblNamePodcaster.setText(podcasters.getName());
						lblReproductionNumberPodcaster.setText(Integer.toString(podcasters.getReproductionNumber()));

						Date formationDate = podcasters.getUnionDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						String formattedDate = dateFormat.format(formationDate);
						lblDatePodcaster.setToolTipText(formattedDate);
					} else {
						lblPodcasterImagen.setIcon(null);
						lblDescriptionPodcaster.setText("");
						lblNamePodcaster.setText("");
						lblReproductionNumberPodcaster.setText("");
						lblDatePodcaster.setToolTipText("");
					}
				}
			}
		});

		
		
		
		
	}
		
		
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}
}