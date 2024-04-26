package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ProfileView {

	private JPanel panel = null;


	public ProfileView(ArrayList<Object> musicPanels) {

		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
	}

	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return panel;
	}

}
