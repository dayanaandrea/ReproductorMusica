package musicPlayer.views;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WelcomeView {

	private JPanel panel = null;

	
	public WelcomeView(ArrayList<Object> musicPanels) {

		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(true);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				
			}
		});
		
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("img/logo.png"));
		JLabel imgLabel = new JLabel("", imageIcon, JLabel.CENTER);
		imgLabel.setBackground(new Color(255, 255, 255));
		imgLabel.setBounds(0, 0, 650, 470);
		imgLabel.setIcon(imageIcon);
		panel.add(imgLabel);
	}

	public JPanel getPanel() {
		return panel;
	}

}
