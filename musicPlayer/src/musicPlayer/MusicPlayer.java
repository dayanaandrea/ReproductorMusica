package musicPlayer;

import java.awt.EventQueue;
import java.awt.Frame;


public class MusicPlayer {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Frame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
