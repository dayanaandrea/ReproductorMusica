package musicPlayerTest.controller.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import musicPlayer.bbdd.utils.DBUtils;

public class GestorGrupos {

	public String obtenerNombreGrupos() {
		String grupos = null;
		String sql = "SELECT theName FROM band";

		Connection connection = null;
		java.sql.Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				grupos = resultSet.getString("theName");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return grupos;
	}

	public String obtenerNombreGruposCompleja() {
		String grupos = null;
		String sql = "select d.title from disc d join band b on d.idBand = b.idBand\r\n"
				+ "where d.idBand = 1 ; ";

		Connection connection = null;
		java.sql.Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				grupos = resultSet.getString("title");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return grupos;
	}
	
	public String obtenerGrupoCreados(int idGrupo) {
		String title = null;
		String sql = "SELECT theName FROM band WHERE idBand = ?";

		try (Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				PreparedStatement statement = connection.prepareStatement(sql)) {

			statement.setInt(1, idGrupo);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					title = resultSet.getString("theName");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return title;
	}

	public void crearGrupos(int id, String titulo) {

		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// Load the JDBC driver
			Class.forName(DBUtils.DRIVER);
			// Establish the connection to the database
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Create the SQL query
			String sql = "INSERT INTO band (idBand, theName ) VALUES (?,?)";
			stm = connection.prepareStatement(sql);

			// Set the title parameter
			stm.setInt(1, id);
			stm.setString(2, titulo); // Utiliza el índice 1 para el primer parámetro
			// Execute the query
			stm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// Close resources
			try {
				if (stm != null)
					stm.close();
			} catch (Exception e) {
				// Ignore
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// Ignore
			}
		}
	}

	public void actualizarGrupos(int id, String nuevoTitulo) {
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// Load the JDBC driver
			Class.forName(DBUtils.DRIVER);
			// Establish the connection to the database
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Create the SQL query
			String sql = "UPDATE band SET theName = ? WHERE idBand = ?";
			stm = connection.prepareStatement(sql);

			// Set the new title and disc ID parameters
			stm.setString(1, nuevoTitulo);
			stm.setInt(2, id);

			// Execute the update query
			int rowsUpdated = stm.executeUpdate();

			if (rowsUpdated == 0) {
				System.out.println("No se encontró ningún disco con el ID proporcionado.");
			} else {
				System.out.println("Título actualizado correctamente para el disco con ID: " + id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// Close resources
			try {
				if (stm != null)
					stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void eliminarGrupos(int id) {
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// Load the JDBC driver
			Class.forName(DBUtils.DRIVER);
			// Establish the connection to the database
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Create the SQL query
			String sql = "DELETE FROM band WHERE idBand = ?";
			stm = connection.prepareStatement(sql);

			// Set the disc ID parameter
			stm.setInt(1, id);

			// Execute the delete query
			int rowsDeleted = stm.executeUpdate();

			if (rowsDeleted == 0) {
				System.out.println("No se encontró ningún disco con el ID proporcionado.");
			} else {
				System.out.println("Disco eliminado correctamente con ID: " + id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// Close resources
			try {
				if (stm != null)
					stm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
