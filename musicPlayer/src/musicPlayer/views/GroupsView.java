package musicPlayer.views;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import musicPlayer.bbdd.gestor.GestorAudio;
import musicPlayer.bbdd.gestor.GestorDisk;
import musicPlayer.bbdd.gestor.GestorGroup;
import musicPlayer.bbdd.pojo.AudioPojo;
import musicPlayer.bbdd.pojo.DiskPojo;
import musicPlayer.bbdd.pojo.GroupPojo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JComboBox;

public class GroupsView {
	private JPanel panel = null;
	private String grupoSeleccionado = null;
	private String discoSeleccionado = null;
	private String cancionSeleccionada = null;
	private boolean datosCargados = false;

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
				((MainView) musicPanels.get(3)).getPanel().setVisible(false);
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

		// GRUPO

		JLabel lblGroupImage = new JLabel("Imagen Grupo");
		lblGroupImage.setBounds(308, 30, 95, 60);
		panel.add(lblGroupImage);

		JLabel lblDescription = new JLabel("Decripción");
		lblDescription.setBounds(429, 34, 138, 56);
		panel.add(lblDescription);

		JLabel lblNameGroup = new JLabel("Nombre");
		lblNameGroup.setBounds(308, 97, 73, 14);
		panel.add(lblNameGroup);

		JLabel lblDate = new JLabel("Fecha");
		lblDate.setBounds(439, 97, 73, 14);
		panel.add(lblDate);

		JLabel lblReproductionNumber = new JLabel("Número de reproducciones");
		lblReproductionNumber.setBounds(346, 128, 136, 14);
		panel.add(lblReproductionNumber);

		// DISCO

		JLabel lblImagenDisco = new JLabel("Imagen Disco");
		lblImagenDisco.setBounds(308, 181, 68, 60);
		panel.add(lblImagenDisco);

		JLabel lblDescription_1 = new JLabel("Decripción");
		lblDescription_1.setBounds(419, 181, 138, 60);
		panel.add(lblDescription_1);

		JLabel lblDate_1 = new JLabel("Fecha");
		lblDate_1.setBounds(429, 252, 73, 14);
		panel.add(lblDate_1);

		JLabel lblGenero = new JLabel("Género");
		lblGenero.setBounds(308, 252, 73, 14);
		panel.add(lblGenero);

		JLabel lblReproductionNumber_1 = new JLabel("Número de reproducciones");
		lblReproductionNumber_1.setBounds(325, 288, 136, 14);
		panel.add(lblReproductionNumber_1);

		// CANCION

		JLabel lblNameSong = new JLabel("Nombre");
		lblNameSong.setBounds(313, 348, 73, 14);
		panel.add(lblNameSong);

		JLabel lblReproductionNumber_1_1 = new JLabel("Número de reproducciones");
		lblReproductionNumber_1_1.setBounds(340, 388, 136, 14);
		panel.add(lblReproductionNumber_1_1);

		JLabel lblDuration = new JLabel("Duración");
		lblDuration.setBounds(439, 348, 73, 14);
		panel.add(lblDuration);

		JButton btnOut = new JButton("Salir");
		btnOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(true);
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
				((MainView) musicPanels.get(3)).getPanel().setVisible(false);
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(true);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
			}
		});
		btnSelect.setBounds(551, 397, 89, 23);
		panel.add(btnSelect);

		JButton btnReproduccion = new JButton("Reproducir ");
		btnReproduccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false);
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(true);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);

			}
		});
		btnReproduccion.setBounds(272, 456, 109, 21);
		btnReproduccion.setEnabled(false);
		panel.add(btnReproduccion);

		JComboBox<String> comboBoxGrupo = new JComboBox<String>();
		comboBoxGrupo.addItem("Seleccionar grupo...");
		comboBoxGrupo.setBounds(32, 54, 167, 38);
		panel.add(comboBoxGrupo);

		if (!datosCargados) {
			GestorGroup gestorGroup = new GestorGroup();
			List<GroupPojo> grupos = gestorGroup.getAllGroup();
			if (grupos != null) {
				for (GroupPojo grupo : grupos) {
					comboBoxGrupo.addItem(grupo.getName());

				}
			}
			datosCargados = true;
		}

		JComboBox<String> comboBoxDisco = new JComboBox<String>();
		comboBoxDisco.addItem("Seleccionar disco...");
		comboBoxDisco.setBounds(32, 210, 167, 38);
		panel.add(comboBoxDisco);

		JComboBox<String> comboBoxCancion = new JComboBox<String>();
		comboBoxCancion.addItem("Seleccionar cancion...");
		comboBoxCancion.setBounds(32, 359, 167, 38);
		panel.add(comboBoxCancion);

		comboBoxGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grupoSeleccionado = (String) comboBoxGrupo.getSelectedItem();
				if (grupoSeleccionado != null) {
					GestorGroup gestorGroup = new GestorGroup();
					List<GroupPojo> grupos = gestorGroup.getGroup(grupoSeleccionado);

					if (grupos != null && !grupos.isEmpty()) {
						GroupPojo grupo = grupos.get(0);

						ImageIcon imageIcon1 = new ImageIcon(grupo.getImagen());
						lblGroupImage.setIcon(imageIcon1);

						lblDescription.setText(grupo.getDescription());
						lblNameGroup.setText(grupo.getName());
						lblReproductionNumber.setText(Integer.toString(grupo.getReproductionNumber()));

						Date formationDate = grupo.getFormationDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						String formattedDate = dateFormat.format(formationDate);
						lblDate.setToolTipText(formattedDate);
					} else {
						lblGroupImage.setIcon(null);
						lblDescription.setText("");
						lblNameGroup.setText("");
						lblDate.setToolTipText("");
					}
				}
			}
		});
		comboBoxGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grupoSeleccionado = (String) comboBoxGrupo.getSelectedItem();
				if (grupoSeleccionado != null) {

					comboBoxDisco.removeAllItems();
					comboBoxDisco.addItem("Seleccionar disco...");

					GestorGroup gestorGroup = new GestorGroup();
					int idBand = gestorGroup.getGroupId(grupoSeleccionado);

					GestorDisk gestorDisk = new GestorDisk();
					List<DiskPojo> disks = gestorDisk.getDisks(idBand);

					if (disks != null) {
						for (DiskPojo disk : disks) {
							comboBoxDisco.addItem(disk.getTitle());

						}
					}


					btnReproduccion.setEnabled(false);
				}

			}
		});
		comboBoxDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String discoSeleccionado = (String) comboBoxDisco.getSelectedItem();

				if (discoSeleccionado != null) {
					GestorDisk gestorDisk = new GestorDisk();
					List<DiskPojo> disks = gestorDisk.getDisk(discoSeleccionado);

					if (disks != null && !disks.isEmpty()) {
						DiskPojo disk = disks.get(0);

						ImageIcon imageIcon = new ImageIcon(disk.getImage());
						lblImagenDisco.setIcon(imageIcon);

						lblDescription_1.setText(disk.getDescription());

						lblGenero.setText(disk.getGender());

						lblReproductionNumber_1.setText(String.valueOf(disk.getReproductionNumber()));

						Date formationDate = disk.getPublicationDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
						String formattedDate = dateFormat.format(formationDate);
						lblDate.setToolTipText(formattedDate);

					} else {
						// Si no hay discos disponibles para el grupo seleccionado, limpias los JLabel
						lblImagenDisco.setIcon(null);
						lblDescription_1.setText("");
						lblDate_1.setText("");
						lblGenero.setText("");
						lblReproductionNumber_1.setText("");
					}
				}

			}
		});

		comboBoxDisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				discoSeleccionado = (String) comboBoxDisco.getSelectedItem();
				if (discoSeleccionado != null && !discoSeleccionado.equals("Seleccionar cancion...")) {

					comboBoxCancion.removeAllItems();
					comboBoxCancion.addItem("Seleccionar cancion...");

					GestorDisk gestorDisk = new GestorDisk();
					int idDisk = gestorDisk.getDisckId(discoSeleccionado);

					GestorAudio gestorAudio = new GestorAudio();
					List<AudioPojo> audios = gestorAudio.getSongDisks(idDisk);

					if (audios != null) {
						for (AudioPojo audio : audios) {
							comboBoxCancion.addItem(audio.getTitle());

						}
					}
					btnReproduccion.setEnabled(true);
				}

			}
		});

		comboBoxCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cancionSeleccionada = (String) comboBoxCancion.getSelectedItem();
				if (cancionSeleccionada != null && !cancionSeleccionada.equals("Seleccionar cancion...")) {

					GestorAudio gestorAudio = new GestorAudio();
					List<AudioPojo> canciones = gestorAudio.getDisk(cancionSeleccionada);

					if (canciones != null && !canciones.isEmpty()) {
						// Obtén el primer elemento de la lista de canciones
						AudioPojo cancion = canciones.get(0);

						// Establece los valores en los JLabel
						lblNameSong.setText(cancion.getTitle());
						lblReproductionNumber_1_1.setText(String.valueOf(cancion.getReproductionNumber()));
						lblDuration.setText(String.valueOf(cancion.getDuration()));
					} else {
						// Si la lista de canciones está vacía, limpia los JLabel
						lblNameSong.setText("");
						lblReproductionNumber_1_1.setText("");
						lblDuration.setText("");
					}
				}
			}
		});
	}

	public JPanel getPanel() {
		return panel;
	}

}