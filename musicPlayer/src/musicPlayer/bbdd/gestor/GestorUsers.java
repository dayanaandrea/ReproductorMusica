package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import musicPlayer.bbdd.pojo.AccountPojo;
import musicPlayer.bbdd.pojo.FreePojo;
import musicPlayer.bbdd.pojo.PremiunPojo;
import musicPlayer.bbdd.utils.DBUtils;

public class GestorUsers {

	public  ArrayList<AccountPojo> obtenerDatosLogin() {
		ArrayList<AccountPojo> ret = null;

		String sql = "select * from theuser";
		Connection connection = null;

		java.sql.Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);

			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				if (ret == null) {
					ret = new ArrayList<>();
				}
				String userType = resultSet.getString("userType"); // Free o Premium
				String userName = resultSet.getString("userName");
				String pass_word = resultSet.getString("pass_word");

				AccountPojo accountPojo;

				if ("premium".equalsIgnoreCase(userType)) {
					accountPojo = new PremiunPojo();
				} else {
					accountPojo = new FreePojo();
				}

				accountPojo.setUser(userName);
				accountPojo.setPassword(pass_word);

				ret.add(accountPojo);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
			}
			try {
				if (statement != null)
					statement.close();
			} catch (Exception e) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
			}
		}
		return ret;
	}
	public  boolean bloquearUsuario(String user) {

		boolean modificacionExitosa = false;
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			String sql = "UPDATE theuser SET isLocked = 'Y' WHERE userName =  ?";

			stm = connection.prepareStatement(sql);
			stm.setString(1, user);

			int filasAfectadas = stm.executeUpdate();

			if (filasAfectadas > 0) {
				modificacionExitosa = true;
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			try {
				if (stm != null)
					stm.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return modificacionExitosa;

	}
	public boolean usuarioBloqueado(String user) {
		String sql = "SELECT isLocked FROM theuser WHERE userName = ?";
		try (
				Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

				PreparedStatement statement = connection.prepareStatement(sql)) {

			statement.setString(1, user);
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				return "Y".equalsIgnoreCase(resultSet.getString("isLocked"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public void updateLastLogin(String user) {
		String query = "UPDATE theuser SET registrationDate = ? WHERE userName = ?";
		try (
				Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				PreparedStatement pstmt = connection.prepareStatement(query)) {
			
				pstmt.setString(1, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
				pstmt.setString(2, user);

				pstmt.executeUpdate();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}