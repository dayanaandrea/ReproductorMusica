package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import musicPlayer.bbdd.pojo.AccountPojo;
import musicPlayer.bbdd.pojo.UserPojo;

public class GestorRegister {
	
	public void insertUser (UserPojo userPojo, AccountPojo accountPojo) {
		
		// La conexion con BBDD
				Connection connection = null;

				// Vamos a lanzar una sentencia SQL contra la BBDD
				Statement statement = null;

				try {
					// El Driver que vamos a usar
					Class.forName(musicPlayer.bbdd.utils.DBUtils.DRIVER);

					// Abrimos la conexion con BBDD
					connection = DriverManager.getConnection(musicPlayer.bbdd.utils.DBUtils.URL, musicPlayer.bbdd.utils.DBUtils.USER,
							musicPlayer.bbdd.utils.DBUtils.PASS);

					// Vamos a lanzar la sentencia...
					statement = connection.createStatement();

					// Montamos la SQL
					String sql = "insert into theuser (userName, theName, surname1, surname2, dni, birthDate, address, postalCode, city, province, pass_word) "
							+ "VALUES ('" + accountPojo.getUser() + "', '" + userPojo.getTheName() + "', '"
							+ userPojo.getSurname1() + "', '" + userPojo.getSurname1() + "', '" + userPojo.getDni() + "', '"
							+ userPojo.getBirthDate() + "', '" + userPojo.getAddress() + "', '" + userPojo.getPostalCode()
							+ "', '" + userPojo.getCity() + "', '" + userPojo.getProvince() + "', '" 
							+ accountPojo.getPassword() + "')";

					// La ejecutamos...
					statement.executeUpdate(sql);

				} catch (SQLException sqle) {
					System.out.println("Error con la BBDD - " + sqle.getMessage());
				} catch (Exception e) {
					System.out.println("Error generico - " + e.getMessage());
				} finally {
					// Cerramos al reves de como las abrimos
					try {
						if (statement != null)
							statement.close();
					} catch (Exception e) {
						// No hace falta
					}
					;
					try {
						if (connection != null)
							connection.close();
					} catch (Exception e) {
						// No hace falta
					}
				}
		
	}
	
	public void insertPremiumAccount(AccountPojo accountPojo) {
		
		// La conexion con BBDD
		Connection connection = null;

		// Vamos a lanzar una sentencia SQL contra la BBDD
		Statement statement = null;

		try {
			// El Driver que vamos a usar
			Class.forName(musicPlayer.bbdd.utils.DBUtils.DRIVER);

			// Abrimos la conexion con BBDD
			connection = DriverManager.getConnection(musicPlayer.bbdd.utils.DBUtils.URL, musicPlayer.bbdd.utils.DBUtils.USER,
					musicPlayer.bbdd.utils.DBUtils.PASS);

			// Vamos a lanzar la sentencia...
			statement = connection.createStatement();

			// Montamos la SQL
			String sql = "insert into theuser (userType,isLocked, isAdmin) "
					+ "VALUES ('" + "premium" + "', '" + accountPojo.isLocked() + "', '"
					+ accountPojo.isManager() +  "')";

			// La ejecutamos...
			statement.executeUpdate(sql);

		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
				// No hace falta
			}
			;
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
		
	}
	
}