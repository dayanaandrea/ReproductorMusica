package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

import musicPlayer.bbdd.pojo.DiskPojo;
import musicPlayer.controller.ControladorRandom;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainView  {
	private JPanel panel = null;


	public MainView(ArrayList<Object> musicPanels) {

		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		//ControladorRandom controladorRandom = new ControladorRandom();
		//DiskPojo disk = controladorRandom.getRandomDisk();
		
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("img/perfil.png"));
		JLabel imgLabel = new JLabel("", imageIcon, JLabel.CENTER);
		imgLabel.addMouseListener(new MouseAdapter() {
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
		imgLabel.setBackground(new Color(255, 255, 255));
		imgLabel.setBounds(577, 0, 73, 87);
		imgLabel.setIcon(imageIcon);
		panel.add(imgLabel);
		
		ImageIcon imageFavourites = new ImageIcon(this.getClass().getResource("img/favourites.png"));
		JLabel imgFavourites = new JLabel("", imageFavourites, JLabel.CENTER);
		imgFavourites.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(true);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
			}
		});
		imgFavourites.setBackground(new Color(255, 255, 255));
		imgFavourites.setBounds(0, 0, 81, 72);
		imgFavourites.setIcon(imageFavourites);
		panel.add(imgFavourites);
		
		JButton btnOut = new JButton("Salir"); // MIRAR POR QUE NO SABEMOS A DONDE TIENE QUE SALIR
		btnOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(true);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				
			}
		});
		btnOut.setBounds(528, 429, 100, 30);
		panel.add(btnOut);
		
		JLabel lblImg = new JLabel("Imagen Al azar ");
		lblImg.setBounds(93, 131, 110, 78);
		panel.add(lblImg);
		
		JLabel lblInformation = new JLabel("Información al azar ");
		lblInformation.setBounds(348, 121, 190, 99);
		panel.add(lblInformation);
		
		JButton btnDiscoverGroup = new JButton("Descubre Grupos");
		btnDiscoverGroup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(true);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				
			}
		});
		btnDiscoverGroup.setBounds(97, 291, 130, 23);
		panel.add(btnDiscoverGroup);
		
		JButton btnDiscoverPodcast = new JButton("Descube Podcast ");
		btnDiscoverPodcast.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(true);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				
			}
		});
		btnDiscoverPodcast.setBounds(342, 291, 144, 23);
		panel.add(btnDiscoverPodcast);
		
		
		
		
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}