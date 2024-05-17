package musicPlayerTest.controller.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import musicPlayer.bbdd.utils.DBUtils;

public class GestorDiscos {

	public int obtenerNumeroDiscos() {
		int totalDiscs = 0;
		String sql = "SELECT COUNT(idDisc) AS total FROM disc";

		Connection connection = null;
		java.sql.Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				totalDiscs = resultSet.getInt("total");
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
		return totalDiscs;

	}

	public String obtenerDiscosCompleja() {
		String discos = null;
		String sql = "select b.theName from disc d join band b on d.idBand = b.idBand where d.idBand = 1 ; ";

		Connection connection = null;
		java.sql.Statement statement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				discos = resultSet.getString("theName");
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
		return discos;
	}
	
	public String obtenerDiscosCreados(int id) {
		String title = null;
		String sql = "SELECT title FROM disc WHERE idDisc = ?";

		try (Connection connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
				PreparedStatement statement = connection.prepareStatement(sql)) {

			statement.setInt(1, id);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					title = resultSet.getString("title");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return title;
	}

	public void crearDiscos(int id, String titulo, int idBand) {

		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// Load the JDBC driver
			Class.forName(DBUtils.DRIVER);
			// Establish the connection to the database
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Create the SQL query
			String sql = "INSERT INTO disc (idDisc, title, idBand) VALUES (?,?,?)";
			stm = connection.prepareStatement(sql);

			// Set the title parameter
			stm.setInt(1, id);
			stm.setString(2, titulo); // Utiliza el índice 1 para el primer parámetro
			stm.setInt(3, idBand);
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

	

	public void actualizarDiscos(int id, String nuevoTitulo) {
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// Load the JDBC driver
			Class.forName(DBUtils.DRIVER);
			// Establish the connection to the database
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Create the SQL query
			String sql = "UPDATE disc SET title = ? WHERE idDisc = ?";
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

	public void eliminarDisco(int id) {
		Connection connection = null;
		PreparedStatement stm = null;

		try {
			// Load the JDBC driver
			Class.forName(DBUtils.DRIVER);
			// Establish the connection to the database
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			// Create the SQL query
			String sql = "DELETE FROM disc WHERE idDisc = ?";
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
