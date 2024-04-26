package musicPlayer.views;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterView  {

	private JPanel panel = null;
	private JPanel premiumPanel = null; // Panel adicional para opciones premium
	private JTextField txtSurname1;
	private JTextField txtSurname2;
	private JTextField txtDni;
	private JTextField txtName;
	private JTextField txtBirthday;
	private JTextField txtAddress;
	private JTextField txtPostalCode;
	private JTextField txtCity;
	private JTextField txtProvince;
	private JTextField txtUser;
	private JTextField txtPassword1;
	private JTextField txtPassword2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	public RegisterView(ArrayList<Object> musicPanels) {

		panel = new JPanel();
		panel.setBounds(0, 0, 704, 500);
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		
		txtSurname1 = new JTextField();
		txtSurname1.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtSurname1.setBounds(185, 97, 86, 20);
		panel.add(txtSurname1);
		txtSurname1.setColumns(10);
		
		txtSurname2 = new JTextField();
		txtSurname2.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtSurname2.setBounds(185, 126, 86, 20);
		panel.add(txtSurname2);
		txtSurname2.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtDni.setBounds(185, 157, 86, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(185, 66, 86, 20);
		panel.add(txtName);
		
		txtBirthday = new JTextField();
		txtBirthday.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtBirthday.setColumns(10);
		txtBirthday.setBounds(185, 188, 86, 20);
		panel.add(txtBirthday);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtAddress.setColumns(10);
		txtAddress.setBounds(185, 274, 86, 20);
		panel.add(txtAddress);
		
		txtPostalCode = new JTextField();
		txtPostalCode.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtPostalCode.setColumns(10);
		txtPostalCode.setBounds(185, 305, 86, 20);
		panel.add(txtPostalCode);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtCity.setColumns(10);
		txtCity.setBounds(185, 342, 86, 20);
		panel.add(txtCity);
		
		txtProvince = new JTextField();
		txtProvince.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtProvince.setColumns(10);
		txtProvince.setBounds(185, 379, 86, 20);
		panel.add(txtProvince);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtUser.setColumns(10);
		txtUser.setBounds(493, 60, 86, 20);
		panel.add(txtUser);
		
		txtPassword1 = new JTextField();
		txtPassword1.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtPassword1.setColumns(10);
		txtPassword1.setBounds(493, 91, 86, 20);
		panel.add(txtPassword1);
		
		txtPassword2 = new JTextField();
		txtPassword2.setFont(new Font("Amiri", Font.PLAIN, 15));
		txtPassword2.setColumns(10);
		txtPassword2.setBounds(493, 122, 86, 20);
		panel.add(txtPassword2);
		
		JRadioButton rdbtnLibre = new JRadioButton("Libre");
		rdbtnLibre.setBackground(new Color(255, 255, 255));
		rdbtnLibre.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		rdbtnLibre.setBounds(330, 234, 109, 23);
		panel.add(rdbtnLibre);
		
		JRadioButton rdbtnPremiun = new JRadioButton("Premiun");
		rdbtnPremiun.setBackground(new Color(255, 255, 255));
		rdbtnPremiun.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		rdbtnPremiun.setBounds(493, 234, 109, 23);
		panel.add(rdbtnPremiun);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setFont(new Font("Amiri", Font.BOLD, 15));
		lblCuenta.setBounds(436, 201, 86, 14);
		panel.add(lblCuenta);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setFont(new Font("Amiri", Font.BOLD, 15));
		lblName.setBounds(44, 72, 81, 14);
		panel.add(lblName);
		
		JLabel lblSurname1 = new JLabel("Apellido 1");
		lblSurname1.setFont(new Font("Amiri", Font.BOLD, 15));
		lblSurname1.setBounds(44, 103, 86, 14);
		panel.add(lblSurname1);
		
		JLabel lblSurname2 = new JLabel("Apellido 2");
		lblSurname2.setFont(new Font("Amiri", Font.BOLD, 15));
		lblSurname2.setBounds(44, 132, 109, 14);
		panel.add(lblSurname2);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Amiri", Font.BOLD, 15));
		lblDni.setBounds(44, 163, 86, 14);
		panel.add(lblDni);
		
		JLabel lblBirthday = new JLabel("Fecha nacimiento");
		lblBirthday.setFont(new Font("Amiri", Font.BOLD, 15));
		lblBirthday.setBounds(44, 194, 143, 14);
		panel.add(lblBirthday);
		
		JLabel lblAddress = new JLabel("Dirección");
		lblAddress.setFont(new Font("Amiri", Font.BOLD, 15));
		lblAddress.setBounds(44, 277, 109, 14);
		panel.add(lblAddress);
		
		JLabel lblPostCode = new JLabel("Código postal ");
		lblPostCode.setFont(new Font("Amiri", Font.BOLD, 15));
		lblPostCode.setBounds(44, 308, 109, 17);
		panel.add(lblPostCode);
		
		JLabel lblCity = new JLabel("Ciudad");
		lblCity.setFont(new Font("Amiri", Font.BOLD, 15));
		lblCity.setBounds(44, 345, 109, 14);
		panel.add(lblCity);
		
		JLabel lblProvince = new JLabel("Provincia");
		lblProvince.setFont(new Font("Amiri", Font.BOLD, 15));
		lblProvince.setBounds(44, 382, 109, 14);
		panel.add(lblProvince);
		
		JLabel lblUser = new JLabel("Usuario ");
		lblUser.setFont(new Font("Amiri", Font.BOLD, 15));
		lblUser.setBounds(368, 66, 115, 14);
		panel.add(lblUser);
		
		JLabel lbPassword1 = new JLabel("Password");
		lbPassword1.setFont(new Font("Amiri", Font.BOLD, 15));
		lbPassword1.setBounds(368, 97, 109, 14);
		panel.add(lbPassword1);
		
		JLabel lblPassword2 = new JLabel("Password 2");
		lblPassword2.setFont(new Font("Amiri", Font.BOLD, 15));
		lblPassword2.setBounds(368, 125, 115, 14);
		panel.add(lblPassword2);
		
		
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnLibre);
        group.add(rdbtnPremiun);
        
        panel.add(rdbtnLibre);
        panel.add(rdbtnPremiun);

        // Crear el panel adicional para contenido Premium
        premiumPanel = new JPanel();
        premiumPanel.setBackground(new Color(255, 255, 255)); 
        premiumPanel.setLayout(null);
        premiumPanel.setBounds(305, 279, 321, 100); 
        premiumPanel.setVisible(false);
        
        JLabel lblCountNumber = new JLabel("Numero de cuenta ");
        lblCountNumber.setFont(new Font("Dialog", Font.BOLD, 15));
        lblCountNumber.setBounds(10, 11, 150, 14);
        premiumPanel.add(lblCountNumber);
        
        JLabel lblExpirationDate = new JLabel("Fecha caducidad");
        lblExpirationDate.setFont(new Font("Dialog", Font.BOLD, 15));
        lblExpirationDate.setBounds(10, 36, 130, 14);
        premiumPanel.add(lblExpirationDate);
        
        JLabel lblCVC = new JLabel("CVV / CVC");
        lblCVC.setFont(new Font("Dialog", Font.BOLD, 15));
        lblCVC.setBounds(10, 62, 104, 14);
        premiumPanel.add(lblCVC);
        
        textField = new JTextField();
        textField.setBounds(152, 5, 159, 20);
        premiumPanel.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(150, 35, 91, 20);
        premiumPanel.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(152, 61, 86, 20);
        premiumPanel.add(textField_2);
        textField_2.setColumns(10);
        
        panel.add(premiumPanel); 
        
        rdbtnPremiun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                premiumPanel.setVisible(true); // Mostrar el panel Premium
                panel.setSize(650, 550); // Ajustar el tamaño del panel principal
            }
        });

        rdbtnLibre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                premiumPanel.setVisible(false); // Ocultar el panel Premium
                panel.setSize(650, 470); // Revertir al tamaño original
            }
        });
        
        
        
        JButton btnSingUp = new JButton("Registrate");
        btnSingUp.addMouseListener(new MouseAdapter() {
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
        btnSingUp.setFont(new Font("Dialog", Font.BOLD, 15));
        btnSingUp.setBounds(393, 410, 156, 23);
        panel.add(btnSingUp);
        
    }
	
	public JPanel getPanel() {
		return panel ;
	}
}