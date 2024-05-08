package musicPlayer.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import musicPlayer.controller.UserController;


public class LoginView {
	private JPanel panel = null;
	private JTextField textUser;
	private JPasswordField passwordField;
	private int intentos = 1;
	
	public LoginView(ArrayList<Object> musicPanels) {
		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);


		textUser = new JTextField();
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUser.setBounds(189, 137, 257, 35);
		panel.add(textUser);
		textUser.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(189, 201, 257, 35);
		panel.add(passwordField);

		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Amiri", Font.BOLD, 15));
		lblUser.setBounds(71, 147, 66, 14);
		panel.add(lblUser);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Amiri", Font.BOLD, 15));
		lblPassword.setBounds(71, 209, 96, 14);
		panel.add(lblPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textUser.getText();
				String password= new String(passwordField.getPassword());

				UserController userController = new UserController();
				boolean bloqueado = userController.usuarioBloqueado(user, password);
				boolean credencialesValidas = userController.verificarCredenciales(user, password);


				boolean cuentasBloqueadas = userController.bloqueoLogin(user, password, intentos);


				if (bloqueado) {

					JOptionPane.showMessageDialog(panel, "TU CUENTA ESTA  BLOQUEADA  ", "Error de inicio de sesión",
							JOptionPane.ERROR_MESSAGE);

				} else if (credencialesValidas) {
					
					JOptionPane.showMessageDialog(panel, "Has inciado sesión correctamente ",
							"Inicio de sesión correcto", JOptionPane.INFORMATION_MESSAGE);
					userController.modificarFecha(user);

					((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
					((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
					((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
					((MainView) musicPanels.get(3)).getPanel().setVisible(true );
					((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
					((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
					((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
					((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
					((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				} else  {
					do {
						System.out.println(intentos);
						intentos ++;
						JOptionPane.showMessageDialog(panel, "Usuario o contraseña incorrecta", "Error de inicio de sesión",
								JOptionPane.ERROR_MESSAGE);
						System.out.println(intentos);
					} while (cuentasBloqueadas);



				}

				/*
				JButton btnLogin = new JButton("Login");
				btnLogin.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				        String user = textUser.getText();
				        String password = new String(passwordField.getPassword());

				        UserController userController = new UserController();
				        boolean bloqueado = userController.usuarioBloqueado(user);
				        if (bloqueado) {
				            JOptionPane.showMessageDialog(panel, "La cuenta está bloqueada", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
				        } else {
				            boolean credencialesValidas = userController.verificarCredenciales(user, password);
				            if (credencialesValidas) {
				                JOptionPane.showMessageDialog(panel, "Inicio de sesión exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
				               ((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
					((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
					((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
					((MainView) musicPanels.get(3)).getPanel().setVisible(true );
					((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
					((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
					((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
					((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
					((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
				            } else {
				                JOptionPane.showMessageDialog(panel, "Usuario o contraseña incorrecta", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
				                //Me tendria que llevar a algun metodo que me haga un bucle para que pueda hacer el bloqueo a el de tres 
				            }
				        }
				    }
				});*/


				textUser.setText("");
				passwordField.setText("");
				//}


			}

		});
		btnLogin.setFont(new Font("Amiri", Font.PLAIN, 15));
		btnLogin.setBounds(253, 269, 134, 35);
		panel.add(btnLogin);

		JLabel lblRegistre = new JLabel("Registarte !!");
		lblRegistre.setFont(new Font("Amiri", Font.BOLD, 15));
		lblRegistre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
				((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
				((RegisterView) musicPanels.get(2)).getPanel().setVisible(true);
				((MainView) musicPanels.get(3)).getPanel().setVisible(false );
				((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
				((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
				((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
				((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
				((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);

			}
		});
		lblRegistre.setBounds(269, 331, 103, 14);
		panel.add(lblRegistre);


	}
	public JPanel getPanel() {
		return panel;
	}


}



