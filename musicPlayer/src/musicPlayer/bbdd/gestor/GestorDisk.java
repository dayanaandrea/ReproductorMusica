package musicPlayer.bbdd.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import musicPlayer.bbdd.pojo.DiskPojo;
import musicPlayer.bbdd.pojo.GroupPojo;
import musicPlayer.bbdd.utils.DBUtils;

public class GestorDisk {

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

	public List<DiskPojo> getAllDisks(int numeroAleatorio) {
		List<DiskPojo> ret = null;

		String sql = "SELECT * FROM disc where idDisc = ?";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, numeroAleatorio);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<DiskPojo>();

				DiskPojo disk = new DiskPojo();
				disk.setIdDisk(resultSet.getInt("idDisc"));
				disk.setImage(resultSet.getString("image"));
				disk.setTitle(resultSet.getString("title"));
				java.sql.Date date = resultSet.getDate("publicationDate");
				disk.setPublicationDate(new java.util.Date(date.getTime()));
				disk.setGender(resultSet.getString("genre"));
				disk.setDescription(resultSet.getString("theDescription"));
				disk.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(disk);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
		return ret;
	}

	public List<DiskPojo> getDisks(int idBand) {
		List<DiskPojo> ret = null;

		String sql = "SELECT disc.* FROM disc INNER JOIN band ON disc.idBand = band.idBand WHERE disc.idBand = ?";

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idBand);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				if (null == ret)
					ret = new ArrayList<DiskPojo>();

				DiskPojo disk = new DiskPojo();
				disk.setIdDisk(resultSet.getInt("idDisc"));
				disk.setImage(resultSet.getString("image"));
				disk.setTitle(resultSet.getString("title"));
				java.sql.Date date = resultSet.getDate("publicationDate");
				disk.setPublicationDate(new java.util.Date(date.getTime()));
				disk.setGender(resultSet.getString("genre"));
				disk.setDescription(resultSet.getString("theDescription"));
				disk.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				ret.add(disk);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (resultSet != null)
					resultSet.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (Exception e) {
				// No hace falta
			}
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
		return ret;
	}

	public int getDisckId(String discoSeleccionado ) { 
		int ret = 0;
		Connection connection = null;
		PreparedStatement statement = null;

		String sql = "SELECT idDisc FROM disc WHERE title = ?";

		try {
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);
			statement = connection.prepareStatement(sql);
			
			statement.setString(1, discoSeleccionado);
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				ret  = resultSet.getInt("idDisc"); 
			}
			
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
			} catch (Exception e) {
			throw e;
		} finally {
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

	public List<DiskPojo> getDisk(String discoSeleccionado ) {
		List<DiskPojo> ret = null;

		String sql = "SELECT * FROM disc WHERE title = ?";

		Connection connection = null;
		PreparedStatement statement = null;


		try {
			Class.forName(DBUtils.DRIVER);
			connection = DriverManager.getConnection(DBUtils.URL, DBUtils.USER, DBUtils.PASS);

			statement = connection.prepareStatement(sql);
			statement.setString(1, discoSeleccionado);
			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				
				ret = new ArrayList<DiskPojo>();
				
				DiskPojo disk = new DiskPojo();
				disk.setIdDisk(resultSet.getInt("idDisc"));
				disk.setImage(resultSet.getString("image"));
				disk.setTitle(resultSet.getString("title"));
				disk.setGender(resultSet.getString("genre"));
				java.sql.Date date = resultSet.getDate("publicationDate");
				disk.setPublicationDate(new java.util.Date(date.getTime()));
				disk.setDescription(resultSet.getString("theDescription"));
				disk.setReproductionNumber(resultSet.getInt("numberOfReproductions"));
				
				ret.add(disk);
			}
		} catch (SQLException sqle) {
			System.out.println("Error con la BBDD - " + sqle.getMessage());
		} catch (Exception e) {
			System.out.println("Error generico - " + e.getMessage());
		} finally {
			// Cerramos al reves de como las abrimos
			try {
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				// No hace falta
			}
		}
		return ret;
	}




}