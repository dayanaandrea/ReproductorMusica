package musicPlayer.views;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Frame {

	private JFrame frame;
	private ArrayList <Object> musicPanels = null;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Frame().frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.na
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 511);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		musicPanels = new ArrayList<Object>();
		
		WelcomeView welcome = new WelcomeView(musicPanels);
		JPanel welcomePanel = welcome.getPanel();
		welcomePanel.setVisible(true);
		musicPanels.add(welcome);
		frame.getContentPane().add(welcomePanel);
		
		LoginView login = new LoginView(musicPanels);
		JPanel loginPanel = login.getPanel();
		loginPanel.setVisible(false);
		musicPanels.add(login);
		frame.getContentPane().add(loginPanel);
		
		RegisterView register = new RegisterView(musicPanels);
		JPanel registerPanel = register.getPanel();
		registerPanel.setVisible(false);
		musicPanels.add(register);
		frame.getContentPane().add(registerPanel);
		
		MainView main= new MainView(musicPanels);
		JPanel mainPanel = main.getPanel();
		mainPanel.setVisible(false);
		musicPanels.add(main);
		frame.getContentPane().add(mainPanel);
		
		GroupsView groups= new GroupsView(musicPanels);
		JPanel groupsPanel = groups.getPanel();
		groupsPanel.setVisible(false);
		musicPanels.add(groups);
		frame.getContentPane().add(groupsPanel);
		
		
		PodcasterView podcaster= new PodcasterView(musicPanels);
		JPanel podcasterPanel = podcaster.getPanel();
		podcasterPanel.setVisible(false);
		musicPanels.add(podcaster);
		frame.getContentPane().add(podcasterPanel);
		
		
		ReproductionView reproduction= new ReproductionView(musicPanels);
		JPanel reproductionPanel = reproduction.getPanel();
		reproductionPanel.setVisible(false);
		musicPanels.add(reproduction);
		frame.getContentPane().add(reproductionPanel);
		
		FavoritesView favorites= new FavoritesView(musicPanels);
		JPanel favoritesPanel = favorites.getPanel();
		favoritesPanel.setVisible(false);
		musicPanels.add(favorites);
		frame.getContentPane().add(favoritesPanel);
		
		
		ProfileView profile= new ProfileView(musicPanels);
		JPanel profilePanel = profile.getPanel();
		profilePanel.setVisible(false);
		musicPanels.add(profile);
		frame.getContentPane().add(profilePanel);
		
		
		
	}
	
	

}
