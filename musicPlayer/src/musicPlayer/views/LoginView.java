package musicPlayer.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import musicPlayer.controller.UserController;
import musicPlayer.controller.exceptions.LoginPassException;

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
				String password = new String(passwordField.getPassword());

				UserController userController = new UserController();

				try {
					
					if (userController.usuarioBloqueado(user, password)) {
						JOptionPane.showMessageDialog(panel, "TU CUENTA ESTA  BLOQUEADA  ", "Error de inicio de sesión",
								JOptionPane.ERROR_MESSAGE);

						intentos = 1;

					} 
					
					try {
					    userController.verificarCredenciales2(user, password);
					    // Las credenciales son correctas, procede con el inicio de sesión
					    JOptionPane.showMessageDialog(panel, "Has inciado sesión correctamente ",
					            "Inicio de sesión correcto", JOptionPane.INFORMATION_MESSAGE);
					    userController.modificarFecha(user);
					    
					    // Resto del código para cambiar la visibilidad de los paneles...
					    
					    ((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
						((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
						((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
						((MainView) musicPanels.get(3)).getPanel().setVisible(true);
						((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
						((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
						((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
						((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
						((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);
					    intentos = 1;
					} catch (LoginPassException ex) {
					    JOptionPane.showMessageDialog(panel, "Usuario o contraseña incorrecta",
					            "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
					    
					    if (userController.bloquearUsuario(user, intentos)) {
							JOptionPane.showMessageDialog(panel, "TU CUENTA HA SIDO BLOQUEADA  ",
									"Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
						}
					    
					    intentos++;
					} 

					
					/*else if (userController.verificarCredenciales2(user, password)) {

						JOptionPane.showMessageDialog(panel, "Has inciado sesión correctamente ",
								"Inicio de sesión correcto", JOptionPane.INFORMATION_MESSAGE);
						userController.modificarFecha(user);

						((WelcomeView) musicPanels.get(0)).getPanel().setVisible(false);
						((LoginView) musicPanels.get(1)).getPanel().setVisible(false);
						((RegisterView) musicPanels.get(2)).getPanel().setVisible(false);
						((MainView) musicPanels.get(3)).getPanel().setVisible(true);
						((GroupsView) musicPanels.get(4)).getPanel().setVisible(false);
						((PodcasterView) musicPanels.get(5)).getPanel().setVisible(false);
						((ReproductionView) musicPanels.get(6)).getPanel().setVisible(false);
						((FavoritesView) musicPanels.get(7)).getPanel().setVisible(false);
						((ProfileView) musicPanels.get(8)).getPanel().setVisible(false);

						intentos = 1;

					} else {
						// Se cuela en user & pass
						JOptionPane.showMessageDialog(panel, "Usuario o contraseña incorrecta",
								"Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);

						if (userController.bloquearUsuario(user, intentos)) {
							JOptionPane.showMessageDialog(panel, "TU CUENTA HA SIDO BLOQUEADA  ",
									"Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
						}

						intentos++;
					}*/
					
					
				}catch (LoginPassException log ) {
				    JOptionPane.showMessageDialog(panel, "Error al acceder a BBDD", "Error ",
				            JOptionPane.ERROR_MESSAGE); 
				}catch (SQLException e1) {
					JOptionPane.showMessageDialog(panel, "Error de Base de Datos", "Error ",
							JOptionPane.ERROR_MESSAGE);
				
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(panel, "Error al acceder a BBDD", "Error ",
							JOptionPane.ERROR_MESSAGE);
				} finally {
					textUser.setText("");
					passwordField.setText("");
				}
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
				((MainView) musicPanels.get(3)).getPanel().setVisible(false);
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
