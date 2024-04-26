package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReproductionView  {

	private JPanel panel = null;


	public ReproductionView(ArrayList<Object> musicPanels) {

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
		
		
		JLabel lblImg = new JLabel("New label");
		lblImg.setBounds(247, 60, 154, 166);
		panel.add(lblImg);
		
		JLabel lblSongName = new JLabel("Canción");
		lblSongName.setBounds(116, 269, 46, 14);
		panel.add(lblSongName);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(116, 301, 46, 14);
		panel.add(lblAutor);
		
		JButton btnBack = new JButton("Volver");
		btnBack.addMouseListener(new MouseAdapter() {
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
		btnBack.setBounds(42, 418, 89, 23);
		panel.add(btnBack);
		
		JLabel lblCancionAnterior = new JLabel("Cancion anterior ");
		lblCancionAnterior.setBounds(100, 353, 82, 14);
		panel.add(lblCancionAnterior);
		
		JLabel lblCancionSiguiente = new JLabel("Cancion siguiente");
		lblCancionSiguiente.setBounds(423, 353, 119, 14);
		panel.add(lblCancionSiguiente);
		
		JLabel lblStop = new JLabel("STOP");
		lblStop.setBounds(261, 353, 82, 14);
		panel.add(lblStop);
		
		
		
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
